package ua.edu.ucu.collections.immutable;


import java.util.Arrays;

public class ImmutableArrayList implements ImmutableList{
    private int size = 0;
    private Object nArray[];

    public ImmutableArrayList(Object[] nArray) {
        this.nArray = nArray;
    }

    public ImmutableArrayList() {
        nArray = new Object[1];
    }

    @Override
    public ImmutableList add(Object e) {
        Object[] a = new Object[size + 1];
        System.arraycopy(nArray, 0, a, 0, size);
        a[size] = e;
        return new ImmutableArrayList(a);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            Object[] a = new Object[size + 1];
            System.arraycopy(nArray, 0, a, 0, index);
            a[index] = e;
            System.arraycopy(nArray, index, a, index + 1, size - index);
            return new ImmutableArrayList(a);
        }
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        Object[] a = new Object[size + c.length];
        System.arraycopy(nArray, 0, a, 0, size);
        System.arraycopy(c, 0, a, size, c.length);
        return new ImmutableArrayList(a);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            Object[] a = new Object[size + c.length];
            System.arraycopy(nArray, 0, a, 0, index);
            System.arraycopy(c, 0, a, index, c.length);
            System.arraycopy(nArray, index, a, index + c.length,
                    size - index);
            return new ImmutableArrayList(a);
        }

    }

    @Override
    public Object get(int index) {
        if (size <= index) {
            throw new IndexOutOfBoundsException();
        } else {
            return nArray[index];
        }
    }


    @Override
    public ImmutableList remove(int index)  {
        if (size < index){
            throw new IndexOutOfBoundsException();
        }
        else {
            Object[] nA = new Object[nArray.length - 1];
            System.arraycopy(nArray, 0, nA, 0, index);
            System.arraycopy(nArray, index + 1, nA, index,
                    this.size() - 1 - index);
            return new ImmutableArrayList(nA);
        }
    }

    @Override
    public ImmutableList set(int index, Object e) {
        if (size < index) {
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
        return size;
    }

    @Override
    public ImmutableList clear() {
        ImmutableArrayList nA = new ImmutableArrayList();
        nA.size = 0;
        return nA;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(nArray);
    }
}
