package csc223.dj;

public interface Queue{
    void enqueue(int item);
    int dequeue();
    int peek();
    boolean isEmpty();
    int size();
}
