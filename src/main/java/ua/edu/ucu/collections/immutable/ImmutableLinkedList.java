package ua.edu.ucu.collections.immutable;



public class ImmutableLinkedList implements ImmutableList{
    private Node head;
    private int listCount;

    public ImmutableLinkedList(){
        head = new Node(null);
        listCount = 0;
    }

    public ImmutableLinkedList(Node head){
        this.head = head;
        Node current = this.head;
        while(current != null){
            listCount++;
            current = current.getNext();
        }
    }

    public ImmutableLinkedList addFirst(Object e) {
        return null;
    }

    public ImmutableLinkedList addLast(Object e) {
        return null;
    }

    public Object getFirst() {
        return null;
    }

    public Object getLast() {
        return null;
    }

    public ImmutableLinkedList removeFirst() {
        return null;
    }

    public ImmutableLinkedList removeLast() {
        return null;
    }


    @Override
    public ImmutableList add(Object e) {
        return null;
    }

    @Override
    public ImmutableList add(int index, Object e) {
        return null;
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return null;
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public ImmutableList remove(int index) {
        return null;
    }

    @Override
    public ImmutableList set(int index, Object e) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public int size() {
        int size = 0;
        Node nN = this.head;
        while (nN != null){
            size += 1;
            nN = nN.getNext();
        }
        return size;
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return listCount == 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public String toString(){
        String str = "[";
        if (this.head.getData() != null){
            str += this.head.getData();
            while(this.head.getNext()!= null){
                str += ",";
                this.head = this.head.getNext();
                str += this.head.getData();
            }
            str += "]";
        }
        else{
            str = "[]";
        }
        return str;
    }
}
