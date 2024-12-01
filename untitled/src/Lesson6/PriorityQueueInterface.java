package Lesson6;

public interface PriorityQueueInterface {
    void insert(long item);
    long remove();
    long peekMin();
    boolean isEmpty();
    boolean isFull();
    void display();
}
