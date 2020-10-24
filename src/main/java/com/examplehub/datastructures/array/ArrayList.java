package com.examplehub.datastructures.array;

import java.util.StringJoiner;

public class ArrayList<E> {

  /** Array to store elements. */
  private E[] elements;

  /** Default init capacity of this list. */
  private static final int DEFAULT_CAPACITY = 10;

  /** Max count number of elements in this list. */
  private int capacity;

  /** Count number of elements in this list. */
  private int size;

  /** Construct a list with a default capacity. */
  public ArrayList() {
    this(DEFAULT_CAPACITY);
  }

  /**
   * Construct a list with a capacity.
   *
   * @param capacity the initial capacity.
   */
  public ArrayList(int capacity) {
    @SuppressWarnings("unchecked")
    E[] tempArray = (E[]) new Object[capacity];
    elements = tempArray;
    this.capacity = capacity;
    this.size = 0;
  }

  /**
   * Returns a elements at a given index.
   *
   * @param index the index of element to be returned.
   * @return element at a given index.
   */
  public E get(int index) {
    checkIndex(index);
    return elements[index];
  }

  /**
   * Replace a element at given index in this list with special element.
   *
   * @param index the index to be updated.
   * @param newValue the new value.
   * @return original value at special index.
   */
  public E set(int index, E newValue) {
    E oldValue = get(index);
    elements[index] = newValue;
    return oldValue;
  }

  /**
   * Add a item to the end of this list.
   *
   * @param item the item to be added.
   * @return {@code true} if added successfully, otherwise {@code false}.
   */
  public boolean add(E item) {
    add(size, item);
    return true;
  }

  /**
   * Insert a item to special index of this list.
   *
   * @param index the special index of this list.
   * @param item the item to be inserted.
   * @throws IndexOutOfBoundsException if {@code index} is out of bounds.
   */
  public void add(int index, E item) {
    checkIndexForAdd(index);
    growCapacityIfNeed();
    if (size - index >= 0) System.arraycopy(elements, index, elements, index + 1, size - index);
    elements[index] = item;
    size++;
  }

  public void growCapacityIfNeed() {
    if (capacity == size) {
      int newCapacity = capacity + capacity / 2;
      @SuppressWarnings("unchecked")
      E[] newElements = (E[]) new Object[newCapacity];
      for (int i = 0; i < size; ++i) {
        newElements[i] = elements[i];
        elements[i] = null; /* let gc do its work */
      }
      elements = newElements;
      capacity = newCapacity;
    }
  }

  /**
   * Remove last item of this list.
   *
   * @return the last item of this list.
   */
  public E remove() {
    return remove(size - 1);
  }

  /**
   * Remove the element at special index.
   *
   * @param index the index .
   * @return element at special index.
   * @throws IndexOutOfBoundsException if {@code index} is out of bounds.
   */
  public E remove(int index) {
    checkIndex(index);

    E removed = elements[index];
    if (size - 1 - index >= 0)
      System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
    size--;
    return removed;
  }

  /**
   * Remove all given elements.
   *
   * @param target the target element to be removed.
   * @return the number removed.
   */
  public int remove(E target) {
    int count = 0;
    for (int i = 0; i < size; ++i) {
      if (!elements[i].equals(target)) {
        elements[count++] = elements[i];
      }
    }
    int removedCount = size - count;
    size = count;
    return removedCount;
  }

  /** Clear all elements in this list. */
  public void clear() {
    for (int i = 0; i < size; ++i) {
      elements[i] = null; /* let gc do its work */
    }
    size = 0;
  }

  /**
   * Check index for add.
   *
   * @param index the index to be checked.
   */
  private void checkIndexForAdd(int index) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException(index + "");
    }
  }

  /**
   * Check index for removing or getting.
   *
   * @param index the index to be checked.
   */
  private void checkIndex(int index) {
    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException(index + "");
    }
  }

  /**
   * Return the number of this list.
   *
   * @return the number of this list.
   */
  public int size() {
    return size;
  }

  /**
   * Check if this list contains no elements.
   *
   * @return {@code true} if this list contains elements, otherwise {@code false}.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public String toString() {
    StringJoiner joiner = new StringJoiner(", ", "[", "]");
    for (int i = 0; i < size; ++i) {
      joiner.add(elements[i].toString());
    }
    return joiner.toString();
  }
}
