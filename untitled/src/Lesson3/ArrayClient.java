package Lesson3;

import java.util.Random;

public class ArrayClient {
    public static void main(String[] args) {
        String separator = "__________________________________________________________";

        Random random = new Random();
        int size = 100;

        CommonArray commonArray = new CommonArray(size);
        OrderedArray orderedArray = new OrderedArray(size);

        for (int i = 0; i < size; i++) {
            boolean insertResultCommonArray = false;
            boolean insertResultOrderedArray = false;

            while (!insertResultCommonArray) {
                insertResultCommonArray = commonArray.insert(random.nextLong(1000));
            }

            while (!insertResultOrderedArray) {
                insertResultOrderedArray = orderedArray.insert(random.nextLong(1000));
            }
        }

        long searchValue = random.nextLong(1000);

        commonArray.display();

        System.out.println("Минимальный элемент неупорядоченного массива: " + commonArray.getMin());
        System.out.println("Максимальный элемент неупорядоченного массива: " + commonArray.getMax());

        if (commonArray.contains(searchValue)) {
            System.out.println("Значение найдено в неупорядоченном массиве: " + searchValue);
        } else {
            System.out.println("Значение не найдено в неупорядоченном массиве: " + searchValue);
        }
        System.out.println("Количество операций в неупорядоченном массиве: " + commonArray.getOperationsCount());

        System.out.println(separator);

        orderedArray.display();

        System.out.println("Минимальный элемент упорядоченного массива: " + orderedArray.getMin());
        System.out.println("Максимальный элемент упорядоченного массива: " + orderedArray.getMax());

        if (orderedArray.contains(searchValue)) {
            System.out.println("Значение найдено в упорядоченном массиве: " + searchValue);
        } else {
            System.out.println("Значение не найдено в упорядоченном массиве: " + searchValue);
        }
        System.out.println("Количество операций в упорядоченном массиве: " + orderedArray.getOperationsCount());
    }
}

