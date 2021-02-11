package core.collections.list.arrayList;

import java.util.Arrays;
import java.util.Collection;

public class ArrayListImpl<E> {

    private transient Object[] elementData;
    private int size;

    public ArrayListImpl(int initialCapacity) {
//        super();
        if(initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                                                initialCapacity);
        this.elementData = new Object[initialCapacity];
    }

    public ArrayListImpl() {
        this(10);
    }

    public ArrayListImpl(Collection<? extends E> c) {
        elementData = c.toArray();
        size = elementData.length;
        if(elementData.getClass() != Object[].class)
            elementData = Arrays.copyOf(elementData, size, Object[].class);
    }

    public void add(E e) {
        ensureCapacityInternal(size + 1);
        elementData[size++] = e;
    }

    public void rangeCheckForAdd(int index) {
        if(index > size || index < 0)
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
    }

    public void rangeCheck(int index) {
        if(index >= size)
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
    }

    public void add(int index, E element) {
        rangeCheckForAdd(index);
        ensureCapacityInternal(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    private void ensureCapacityInternal(int minCapacity) {
        if(minCapacity > 0) {
//            modCount++;
            if(minCapacity - elementData.length > 0)
                grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if(newCapacity - minCapacity < 0) newCapacity = minCapacity;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public void clear() {
        for(int i = 0; i < size; i++) elementData[i] = null;
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = (E) elementData[index];
        int numMoved = size - index - 1;
        if(numMoved > 0)
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;
        return oldValue;
    }
}
