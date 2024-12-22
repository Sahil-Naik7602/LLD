import java.util.*;

public class LFUCacheBruteForce {
    private Map<Integer,Integer> valueMap = new HashMap<>();
    private Map<Integer,Integer> countMap = new HashMap<>();
    private TreeMap<Integer, List<Integer>> frequencyMap = new TreeMap<>();
    private final Integer size;

    public LFUCacheBruteForce(Integer size) {
        this.size = size;
    }

    public Integer get(int k){
        if (size == 0 || !valueMap.containsKey(k)){
            return -1;
        }
        helper(k);

        return valueMap.get(k);
    }

    public void put(int k, int v){
        if (size != 0){
            if (!valueMap.containsKey(k) && valueMap.size()==size){
                int leastFrequency = frequencyMap.firstKey();
                int keyToBeDeleted = frequencyMap.get(leastFrequency).remove(0);
                if (frequencyMap.get(leastFrequency).size()==0) frequencyMap.remove(leastFrequency);
                countMap.remove(keyToBeDeleted);
                valueMap.remove(keyToBeDeleted);
            }
            helper(k);


            valueMap.put(k,v);
        }
    }

    private void helper(int k) {
        Integer freq = nvl(countMap.get(k),0);
        if (frequencyMap.containsKey(freq)){
            frequencyMap.get(freq).remove(Integer.valueOf(k));
            if (frequencyMap.get(freq).size()==0) frequencyMap.remove(freq);
        }

        if (!frequencyMap.containsKey(freq+1)) frequencyMap.put(freq+1,new ArrayList<>());
        frequencyMap.get(freq+1).add(k);

        countMap.put(k,freq+1);
    }

    public void printCache(){
        System.out.println("{");
        for (Map.Entry<Integer,Integer> entry:valueMap.entrySet()){
            System.out.println("  "+entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("}");
    }

    public void printFrequencyTable(){
        Set<Map.Entry<Integer, List<Integer>> > entries
                = frequencyMap.entrySet();
        System.out.println("{");
        for (Map.Entry<Integer, List<Integer>> entry : entries){
            System.out.println("  "+entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("}");

    }

    public static <T> T nvl(T arg0, T arg1) {
        return (arg0 == null) ? arg1 : arg0;
    }
}
