package Lesson6;

public class PriorityQueue implements PriorityQueueInterface{
    // Элементы массива сортируются по значению ключа,
    // от максимумa (0) до минимума (maxSize-1)
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQueue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        if (nItems == maxSize) System.out.println("Приоритетная очередь переполнена");
        else {
            int j;// сдвинуть вверх

            if (nItems == 0) { // Если очередь пуста,
                queArray[nItems++] = item; // вставляем в ячейку 0
            }
            else { // Если очередь содержит элементы
                for (j = nItems - 1; j >= 0; j--) { // Перебор в обратном направлении
                    if (item > queArray[j]) { // Если новый элемент больше,
                        queArray[j + 1] = queArray[j]; // сдвинуть вверх
                    } else { // Если меньше,
                        break; // сдвиг прекращается
                    }
                }
                queArray[j + 1] = item; // Вставка элемента
                nItems++;
            }
        }
    }

    public long remove() {
        return queArray[--nItems];
    }

    public long peekMin() {
        return queArray[nItems-1];
    }

    public boolean isEmpty() {
        return (nItems==0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void display() {
        for (int i = 0; i < nItems; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println();
    }
}
