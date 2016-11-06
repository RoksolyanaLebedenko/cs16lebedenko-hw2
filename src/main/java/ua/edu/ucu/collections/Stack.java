package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList newStack = new ImmutableLinkedList();

    Object peek() {
        return 0;
    }

    Object pop() {
        return 0;
    }

    void pop(Object e) {
        newStack.addLast(e);
    }
    
}
