package Lesson3;


public class CommonArray extends ParentLongArray {
    public CommonArray(int size) {
        super(size);
    }

    @Override
    public boolean contains(long searchValue) {
        operationsCount = 0; // Обнуляем счетчик перед поиском

        for (int i = 0; i < nElems; i++) {
            operationsCount++; // Увеличиваем счетчик операций
            if (array[i] == searchValue) return true;
        }
        return false;
    }
}