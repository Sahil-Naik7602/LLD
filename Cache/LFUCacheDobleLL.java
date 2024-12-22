import java.util.*;

public class LFUCacheDobleLL {
    private Map<Integer,Node> valueMap = new HashMap<>();
    private Map<Integer,Integer> countMap = new HashMap<>();
    private TreeMap<Integer, DoubleLinkedList> frequencyMap = new TreeMap<>();
    private final Integer size;

    public LFUCacheDobleLL(Integer size) {
        this.size = size;
    }

    public Integer get(Integer k){
        if (size == 0 || !valueMap.containsKey(k)){
            return -1;
        }
        Node keyNode = valueMap.get(k);
        helper(keyNode);
        return keyNode.getValue();
    }

    public void put(int k, int v){
        if (size != 0){
            if (!valueMap.containsKey(k) && valueMap.size()==size){
                int leastFrequency = frequencyMap.firstKey();
                int keyToBeDeleted = frequencyMap.get(leastFrequency).removeFirstNode().getKey();
                if (frequencyMap.get(leastFrequency).len()==0) frequencyMap.remove(leastFrequency);
                countMap.remove(keyToBeDeleted);
                valueMap.remove(keyToBeDeleted);
            }
            Node newNode = new Node(k,v);
            helper(newNode);
            valueMap.put(k,newNode);
        }
    }

    private void helper(Node node) {
        Integer k = node.getKey();
        Integer freq = nvl(countMap.get(k),0);
        if (frequencyMap.containsKey(freq)){
            frequencyMap.get(freq).removeNode(node);
            if (frequencyMap.get(freq).len()==0) frequencyMap.remove(freq);
        }

        if (!frequencyMap.containsKey(freq+1)) frequencyMap.put(freq+1,new DoubleLinkedList());
        frequencyMap.get(freq+1).addNode(node);

        countMap.put(k,freq+1);
    }

    public void printCache(){
        System.out.println("{");
        for (Map.Entry<Integer,Node> entry:valueMap.entrySet()){
            System.out.println("  "+entry.getKey()+" : "+entry.getValue().getValue());
        }
        System.out.println("}");
    }



    public static <T> T nvl(T arg0, T arg1) {
        return (arg0 == null) ? arg1 : arg0;
    }
}
