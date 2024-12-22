public class Node {
    private Integer key;
    private Integer value;
    Node next;
    Node prev;

    public Node(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void removeNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void insertNode(Node node){
        Node tempNode = this;
        while (tempNode.next.getKey() != -1 && tempNode.next.getValue() != -1){
            tempNode = tempNode.next;
        }
        node.next = tempNode.next;
        tempNode.next = node;
        node.prev = tempNode;
    }
}
