package ua.edu.ucu.collections.immutable;

/**
 * Created by Roksolyana Lebedenko on 07.11.2016.
 */
public class Node {
    private Object data;
    private Node next;

    public Node(Object e) {
        this.data = e;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node clone(){
        return new Node(this.data);
    }

}
