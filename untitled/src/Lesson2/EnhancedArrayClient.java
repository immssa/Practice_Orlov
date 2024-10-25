package Lesson2;

import java.util.Random;

public class EnhancedArrayClient {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 50;
        EnhancedArrayInterface array = new EnhancedArrayImpl(size);

        for (int i = 0; i < size; i++) {
            array.insert(random.nextLong(50));
        }

        array.display();

        long search = random.nextLong(50);
        if (array.find(search)) {
            System.out.println("Знчение найдено: " + search);
        } else {
            System.out.println("Значение не найдено: " + search);
        }

        System.out.println("Минимальный элемент массива: " + array.getMin());
        System.out.println("Максимальный элемент массива: " + array.getMax());

        System.out.println("Размер массива: " + array.getSize());
    }
}