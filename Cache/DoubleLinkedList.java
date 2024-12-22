import java.util.Objects;

public class DoubleLinkedList {
    private int n;
    private Node head;
    private Node tail;

    public DoubleLinkedList(){
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public boolean isEmpty(){
        return this.n == 0;
    }

    public void addNode(Node node){
        Node prevNode = tail.prev;
        prevNode.next = node;
        node.prev = prevNode;
        node.next = tail;
        tail.prev = node;
        n++;
    }

    public Node removeFirstNode(){
        if (isEmpty()) {
            return null;
        }
        Node firstNode = head.next;
        firstNode.next.prev = head;
        head.next = firstNode.next;
        firstNode.next = null;
        firstNode.prev = null;
        n--;
        return firstNode;

    }

    public void removeNode(Node node){
        Node tempNode = head;
        while (tempNode != tail){
            if (Objects.equals(tempNode.getKey(), node.getKey())){
                Node prevNode = tempNode.prev;
                Node nextNode = tempNode.next;
                prevNode.next = nextNode;
                nextNode.prev = prevNode;
                n--;
                break;
            }
            tempNode = tempNode.next;
        }
    }

    public Integer len(){
        return this.n;
    }

    public void printLL(){
        Node tempNode = head.next;
        while (tempNode != tail){
            System.out.print(tempNode.getKey()+"->");
            tempNode = tempNode.next;
        }
        System.out.println();
    }

}
