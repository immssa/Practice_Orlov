package Lesson3;

public interface ArrayInterface {
    boolean contains(long searchValue);
    boolean insert(long value);
    boolean delete(long value);
    void display();
    int getSize();
    long getMax();
    long getMin();
    int getOperationsCount(); // Новый метод для получения количества операций
}