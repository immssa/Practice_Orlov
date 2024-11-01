package Lesson3;

public abstract class ParentLongArray implements ArrayInterface {
    protected final long[] array; // Массив для хранения значений
    protected int nElems; // Текущее количество элементов в массиве
    protected Long minValue = null; // Минимальное значение, обновляется при добавлении
    protected Long maxValue = null; // Максимальное значение, обновляется при добавлении
    protected int operationsCount = 0; // Счетчик операций

    @Override
    public int getOperationsCount() {
        return operationsCount; // Возвращает количество операций
    }

    // Конструктор инициализирует массив заданного размера
    public ParentLongArray(int size) {
        this.array = new long[size];
        this.nElems = 0;
    }

    @Override
    public boolean insert(long value) {
        if (nElems == array.length) {
            return false; // Массив полон, вставка невозможна
        }

        // Обновление минимального и максимального значений массива
        if (minValue == null || value < minValue) minValue = value;
        if (maxValue == null || value > maxValue) maxValue = value;

        array[nElems++] = value; // Добавление нового элемента
        return true;
    }

    @Override
    public boolean delete(long value) {
        // Поиск элемента для удаления
        int i;
        for (i = 0; i < nElems; i++) {
            if (array[i] == value) break;
        }

        if (i == nElems) {
            return false; // Элемент не найден
        } else {
            // Сдвиг оставшихся элементов влево
            System.arraycopy(array, i + 1, array, i, nElems - i - 1);
            nElems--;

            // Обновляем min и max значения, если удалено одно из них
            if (value == minValue || value == maxValue) {
                recalculateMinMax();
            }
            return true;
        }
    }

    // Метод для пересчета минимального и максимального значений
    private void recalculateMinMax() {
        minValue = maxValue = null;
        for (int i = 0; i < nElems; i++) {
            if (minValue == null || array[i] < minValue) minValue = array[i];
            if (maxValue == null || array[i] > maxValue) maxValue = array[i];
        }
    }

    @Override
    public long getMax() {
        if (maxValue == null) throw new IllegalStateException("Array is empty");
        return maxValue;
    }

    @Override
    public long getMin() {
        if (minValue == null) throw new IllegalStateException("Array is empty");
        return minValue;
    }

    @Override
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    @Override
    public int getSize() {
        return this.nElems;
    }
}