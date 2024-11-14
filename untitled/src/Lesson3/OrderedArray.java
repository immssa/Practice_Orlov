package Lesson3;

public class OrderedArray extends ParentLongArray {
    public OrderedArray(int size) {
        super(size);
    }

    @Override
    public boolean contains(long searchValue) {
        operationsCount = 0; // Обнуляем счетчик перед поиском
        int lowerBound = 0;
        int upperBound = nElems - 1;

        while (lowerBound <= upperBound) {
            operationsCount++; // Увеличиваем счетчик операций
            int currentIndex = (lowerBound + upperBound) / 2;

            if (array[currentIndex] == searchValue) {
                return true; // Значение найдено
            } else if (array[currentIndex] < searchValue) {
                lowerBound = currentIndex + 1;
            } else {
                upperBound = currentIndex - 1;
            }
        }
        return false; // Значение не найдено
    }

    @Override
    public boolean insert(long value) {
        if (nElems == array.length) return false;

        if (contains(value)) return false;

        int low = 0, high = nElems - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.arraycopy(array, low, array, low + 1, nElems - low);
        array[low] = value;
        nElems++;
        return true;
    }

    @Override
    public boolean delete(long value) {
        int low = 0, high = nElems - 1, deleteIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                deleteIndex = mid;
                break;
            } else if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (deleteIndex == -1) return false;

        for (int i = deleteIndex; i < nElems - 1; i++) {
            array[i] = array[i + 1];
        }
        nElems--;
        return true;
    }

    @Override
    public long getMax() {
        return array[nElems - 1];
    }

    @Override
    public long getMin() {
        return array[0];
    }
}