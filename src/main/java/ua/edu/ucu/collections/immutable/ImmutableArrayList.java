package ua.edu.ucu.collections.immutable;


import java.util.Arrays;

public class ImmutableArrayList implements ImmutableList {
    private int size = 0;
    private Object[] nArray;

    public ImmutableArrayList(Object[] nArray) {
        this.nArray = nArray;
    }

    public ImmutableArrayList() {
        nArray = new Object[0];
    }

    @Override
    public ImmutableList add(Object e) {
        Object [] nA = new Object[nArray.length + 1];
        System.arraycopy(nArray, 0, nA, 0, nArray.length);
        nA[nArray.length] = e;
        return new ImmutableArrayList(nA);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        if (nArray.length < index){
            throw new IndexOutOfBoundsException();
        }
        Object [] nA = new Object[ nArray.length + 1];
        System.arraycopy(nArray, 0, nA, 0, index);
        nA[index] = e;
        System.arraycopy(nArray, index, nA, index + 1,  nArray.length - index);
        return new ImmutableArrayList(nA);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        Object [] nA = new Object[nArray.length +c.length];
        System.arraycopy(nArray, 0, nA, 0, nArray.length);
        System.arraycopy(c, 0, nA, nArray.length, c.length);
        return new ImmutableArrayList(nA);
    }


    @Override
    public ImmutableList addAll(int index, Object[] c) {
        if (nArray.length < index){
            throw new IndexOutOfBoundsException();
        }
        Object [] nA = new Object[nArray.length + c.length];
        System.arraycopy(nArray, 0, nA, 0, index);
        System.arraycopy(c, 0, nA, index , c.length);
        System.arraycopy(nArray, index, nA,
                index+c.length,nArray.length - index);
        return new ImmutableArrayList(nA);
    }

    @Override
    public Object get(int index) {
        if (nArray.length <= index) {
            throw new IndexOutOfBoundsException();
        } else {
            return nArray[index];
        }
    }


    @Override
    public ImmutableList remove(int index)  {
        if (nArray.length < index){
            throw new IndexOutOfBoundsException();
        }
        else {
            Object[] nA = new Object[nArray.length - 1];
            System.arraycopy(nArray, 0, nA, 0, index);
            System.arraycopy(nArray, index + 1, nA, index,
                    nArray.length - 1 - index);
            return new ImmutableArrayList(nA);
        }
    }

    @Override
    public ImmutableList set(int index, Object e) {
        if (nArray.length < index) {
            throw new IndexOutOfBoundsException();
        }
        else {
            nArray[index] = e;
            return new ImmutableArrayList(nArray);
        }
    }


    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < nArray.length; i++) {
            if (nArray[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return nArray.length;
    }

    @Override
    public ImmutableList clear() {
        ImmutableArrayList nA = new ImmutableArrayList();
        nA.size = 0;
        return nA;
    }

    @Override
    public boolean isEmpty() {
        return nArray.length == 0;
    }

    @Override
    public Object[] toArray() {
        return nArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(nArray);
    }
}
