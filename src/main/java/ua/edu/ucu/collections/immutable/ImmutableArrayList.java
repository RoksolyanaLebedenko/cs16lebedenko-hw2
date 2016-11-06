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
        if (nArray.length - size < 1) {
            nArray = Arrays.copyOf(nArray, nArray.length+1);
        }
        nArray[size++] = e;
        return new ImmutableArrayList(nArray);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            nArray = Arrays.copyOf(nArray, nArray.length + 1);
            System.arraycopy(nArray, index, nArray, index + 1, size - index);
            nArray[index] = e;
        }
        return new ImmutableArrayList(nArray);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        for (Object i: c){
            this.add(i);
        }
        return new ImmutableArrayList(nArray);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        } else {
            for (Object i: c){
                nArray = Arrays.copyOf(nArray, nArray.length+1);
                System.arraycopy(nArray, index, nArray, index + 1, size - index);
                this.add(i);}
            size += 1;
        }
        return new ImmutableArrayList(nArray);
    }

    @Override
    public Object get(int index) throws ArrayIndexOutOfBoundsException {
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
            System.arraycopy(nArray, index + 1, nA, index, this.size() - 1 - index);
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
