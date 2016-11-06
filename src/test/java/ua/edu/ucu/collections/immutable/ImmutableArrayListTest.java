package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    
    @Test
    public void testAdd() {
        ImmutableArrayList nArray = new ImmutableArrayList();
        ImmutableList actual = nArray.add(1);
        String expResult = "[1]";
        assertEquals(expResult, actual.toString());
    }
    @Test
    public void testAddIndex() {
        ImmutableArrayList nArray = new ImmutableArrayList();
        Object c[] = new Object[]{1,2,3};
        nArray.addAll(c);
        ImmutableList actual = nArray.add(0,6);
        String expResult = "[6, 1, 2, 3]";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testAddAll() {
        ImmutableArrayList nArray = new ImmutableArrayList();
        Object c[] = new Object[]{1,2,3};
        ImmutableList actual = nArray.addAll(c);
        String expResult = "[1, 2, 3]";
        assertEquals(expResult, actual.toString());
    }
    @Test
    public void testAddAllIndex() {                                                           //!!!!!!!
        ImmutableArrayList nArray = new ImmutableArrayList();
        Object c[] = new Object[]{1,2,5};
        Object old[] = new Object[]{3,4};
        nArray.addAll(c);
        ImmutableList actual = nArray.addAll(2, old);
        String expResult = "[1, 2, 3, 4, 5]";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testGet(){
        ImmutableArrayList nArray = new ImmutableArrayList();
        Object c[] = new Object[]{1,2,3};
        nArray.addAll(c);
        Object actual = nArray.get(1);
        String expResult = "2";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testRemove() {
        ImmutableArrayList nArray = new ImmutableArrayList();
        Object c[] = new Object[]{1,2,3};
        nArray.addAll(c);
        Object actual = nArray.remove(1);
        String expResult = "[1, 3]";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testSet() {
        ImmutableArrayList nArray = new ImmutableArrayList();
        Object c[] = new Object[]{1,2,3};
        nArray.addAll(c);
        Object actual = nArray.set(1, 0);
        String expResult = "[1, 0, 3]";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testIndexOf() {
        ImmutableArrayList nArray = new ImmutableArrayList();
        Object c[] = new Object[]{1,2,3};
        nArray.addAll(c);
        Object actual = nArray.indexOf(2);
        String expResult = "1";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testSize() {
        ImmutableArrayList nArray = new ImmutableArrayList();
        Object c[] = new Object[]{1,2,3};
        nArray.addAll(c);
        Object actual = nArray.size();
        String expResult = "3";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testClear() {
        ImmutableArrayList nArray = new ImmutableArrayList();
        Object c[] = new Object[]{1,2,3};
        nArray.addAll(c);
        Object actual = nArray.clear();
        String expResult = "[null]";
        assertEquals(expResult, actual.toString());
    }

    @Test
    public void testIsEmpty() {
        ImmutableArrayList nArray = new ImmutableArrayList();
        boolean actual = nArray.isEmpty();
        assertEquals(true, actual);
    }

}
