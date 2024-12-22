import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LRUCacheDoubleLL {
    private Map<Integer,Node> valueMap = new HashMap<>();

    private DoubleLinkedList requestOrder = new DoubleLinkedList();
    private final Integer size;

    public LRUCacheDoubleLL(Integer size) {
        this.size = size;
    }

    public Integer get(Integer k){
        if (size == 0 || !valueMap.containsKey(k)){
            return -1;
        }
        Node keyNode = valueMap.get(k);
        //TODO: remove the node whose key is k from the doubleLL and move it to the Last
        helper(keyNode);
        return keyNode.getValue();
    }

    public void put(int k, int v){
        if (size != 0){
            if (!valueMap.containsKey(k) && valueMap.size()==size){
                Integer keyToBeDeleted = requestOrder.removeFirstNode().getKey();
                System.out.println(keyToBeDeleted);
                valueMap.remove(keyToBeDeleted);
            }
            Node newNode = new Node(k,v);
            //TODO: remove the node whose key is k from the doubleLL and move it to the Last
            helper(newNode);
            valueMap.put(k,newNode);
        }
    }

    private void helper(Node node) {
        requestOrder.removeNode(node);
        requestOrder.addNode(node);
        requestOrder.printLL();

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
