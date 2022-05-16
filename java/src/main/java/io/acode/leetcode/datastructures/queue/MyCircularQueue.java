package io.acode.leetcode.datastructures.queue;

public class MyCircularQueue {
  int[] queue;
  int head = -1;
  int tail = -1;
  int count = 0;

  public MyCircularQueue(int size) {
    queue = new int[size];
  }

  public int Front() {
    if (isEmpty()) return -1;
    return queue[head];
  }

  public int Rear() {
    if (isEmpty()) return -1;
    return queue[tail];
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public boolean isFull() {
    return count == queue.length;
  }


  public Boolean enQueue(int i) {
    if (isFull()) return false;
    count++;
    if (head == -1) head++;
    tail = ++tail % queue.length;
    queue[tail] = i;
    return true;
  }

  public boolean deQueue() {
    if (isEmpty()) return false;
    count--;
    head = ++head % queue.length;
    return true;
  }

  public int size() {
    return count;
  }
}
