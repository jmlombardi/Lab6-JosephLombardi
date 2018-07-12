package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // TODO
    if (size == capacity) {
      return false;
    }
    size++;
    rear = (rear + 1) % capacity;
    this.data[rear] =  obj;
    return true;
  }

  @Override
  public E peek() {
    // TODO
    if (size == 0) {
      return null;
    }
    return data[front];
  }

  @Override
  public E poll() {
    // TODO
    if (size == 0) {
      return null;
    }
    E temp = data[front];
    size --;
    front = (front + 1) % capacity;
    return temp;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    if (size == 0) {
      return true;
    }
    else
      return false;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    List<E> arrayList = new ArrayList<>();

    for (int i = 0; i < size; i++) {
        arrayList.add(data[front]);
        front = (front + 1) % capacity;
    }
    return arrayList;
  }
}
