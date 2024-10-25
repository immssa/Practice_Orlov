package Lesson2;

public class EnhancedArrayImpl implements EnhancedArrayInterface {
    private final long[] array;
    private int a;

    public EnhancedArrayImpl(int size) {
        this.array = new long[size];
        this.a = 0;
    }

    public void insert(long value) {
        array[a] = value;
        a++;
    }

    public boolean find(long searchValue) {
        for (int i = 0; i < this.a; i++) {
            if (array[i] == searchValue) {
                return true;
            }
        }
        return false;
    }

    public boolean delete(long value) {
        int i;
        for (i = 0; i < this.a; i++) {
            if (array[i] == value) {
                break;
            }
        }

        if (i == a - 1) { // Если значение не найдено
            return false;
        } else {
            for (int j = i; j < a - 1; j++) {
                array[j] = array[j + 1];
            }
            a--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < a; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return this.a;
    }

    public long getMin() {
        if (a == 0) {
            throw new IllegalStateException("Array is empty");
        }
        long min = array[0];
        for (int i = 1; i < a; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    public long getMax() {
        if (a == 0) {
            throw new IllegalStateException("Array is empty");
        }
        long max = array[0];
        for (int i = 1; i < a; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
}