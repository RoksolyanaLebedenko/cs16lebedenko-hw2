package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    
    @Test
    public void testAdd() {
        ImmutableList nArray = new ImmutableArrayList();
        ImmutableList actual = nArray.add(1);
        String expResult = "[1]";
        assertEquals(expResult, actual.toString());
    }
    @Test
    public void testAddIndex() {
        ImmutableList nArray = new ImmutableArrayList();
        nArray = nArray.add(0, 1);
        nArray = nArray.add(1, 2);
        ImmutableList actual = nArray.add(0,6);
        String expResult = "[6, 1, 2]";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testAddAll() {
        ImmutableList nArray = new ImmutableArrayList();
        nArray = nArray.add(0, 1);
        nArray = nArray.add(1, 2);
        Object c[] = new Object[]{4, 5};
        ImmutableList actual = nArray.addAll(c);
        String expResult = "[1, 2, 4, 5]";
        assertEquals(expResult, actual.toString());
    }
    @Test
    public void testAddAllIndex() {
        ImmutableList nArray = new ImmutableArrayList();
        nArray = nArray.add(0, 1);
        nArray = nArray.add(1, 2);
        nArray = nArray.add(2, 3);
        Integer c[] = {4, 5};
        nArray = nArray.addAll(1, c);
        ImmutableList actual = nArray;
        assertEquals("[1, 4, 5, 2, 3]", actual.toString());
    }

    @Test
    public void testGet(){
        ImmutableList nArray = new ImmutableArrayList();
        nArray = nArray.add(0,0);
        nArray= nArray.add(1,1);
        nArray= nArray.add(2,2);
        Object actual = nArray.get(1);
        String expResult = "1";
        assertEquals(expResult, actual.toString());
    }


    @Test
    public void testRemove() {
        ImmutableList nArray = new ImmutableArrayList();
        nArray = nArray.add(0,0);
        nArray= nArray.add(1,1);
        nArray= nArray.add(2,2);
        Object actual = nArray.remove(1);
        String expResult = "[0, 2]";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testSet() {
        ImmutableList nArray = new ImmutableArrayList();
        nArray = nArray.add(0,0);
        nArray= nArray.add(1,1);
        nArray= nArray.add(2,2);
        Object actual = nArray.set(1, 0);
        String expResult = "[0, 0, 2]";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testIndexOf() {
        ImmutableList nArray = new ImmutableArrayList();
        nArray = nArray.add(0, 1);
        nArray = nArray.add(1, 2);
        Object actual = nArray.indexOf(2);
        assertEquals(1, actual);
    }

    @Test
    public void testSize() {
        ImmutableList nArray = new ImmutableArrayList();
        nArray = nArray.add(0, 1);
        nArray = nArray.add(1, 2);
        Object actual = nArray.size();
        String expResult = "2";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testClear() {
        ImmutableList nArray = new ImmutableArrayList();
        nArray = nArray.add(0, 1);
        nArray = nArray.add(1, 2);
        Object actual = nArray.clear();
        String expResult = "[]";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testIsEmpty() {
        ImmutableList nArray = new ImmutableArrayList();
        nArray = nArray.add(0, 1);
        nArray = nArray.add(1, 2);
        boolean actual = nArray.isEmpty();
        assertEquals(false, actual);
    }

}
