package Lesson6;

public class Queue implements QueueInterface{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) { // Вставка элемента в конец очереди
        if (nItems == maxSize){
            System.out.println("Очередь переполнена");
        }
        else {
            if (rear == maxSize - 1) { // Циклический перенос
                rear = -1;
            }
            queArray[++rear] = j; // Увеличение rear и вставка
            nItems++; // Увеличение количества элементов
        }
    }

    public long remove() { // Извлечение элемента в начале очереди
        long temp = queArray[front++]; // Выборка и увеличение front
        if (front == maxSize) { // Циклический перенос
            front = 0;
        }
        nItems--; // Уменьшение количества элементов
        return temp;
    }

    public long peekFront() { // Чтение элемента в начале очереди
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    public void display() {
        for (int i = 0; i < nItems; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println();
    }
}
