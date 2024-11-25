package Lesson5;

public class BubbleSort{
    protected final long[] array;
    private int nElems;

    public BubbleSort(int size) {
        this.array = new long[size];
        this.nElems = 0;
    }

    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        for (int out = nElems - 1; out > 1; out--) { // Внешний цикл (обратный)
            for (int in = 0; in < out; in++) {  // Внутренний цикл (прямой)
                if (array[in] > array[in + 1]) { // Порядок нарушен?
                    swap(in, in + 1); // Поменять местами
                }
            }
        }
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
