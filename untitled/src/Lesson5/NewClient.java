package Lesson5;
import java.util.Random;

public class NewClient {
    public static void main(String[] args) {
        Random random = new Random();

        long start;
        long end;

        int size = 10000;
        SelectionSort korjik = new SelectionSort(size);
        InsertionSort karamelika = new InsertionSort(size);
        BubbleSort kompot = new BubbleSort(size);

        for (int i = 0; i < size; i++) {
            kompot.insert(random.nextLong(10000));
            karamelika.insert(random.nextLong(10000));
            korjik.insert(random.nextLong(10000));
        }

        System.out.println("Bubble");
        kompot.display();
        start = System.currentTimeMillis();
        kompot.bubbleSort();
        end = System.currentTimeMillis();
        kompot.display();
        System.out.printf("Время выполнения: %d мс \n", end - start);

        System.out.println("\nInsertion");
        karamelika.display();
        start = System.currentTimeMillis();
        karamelika.insertionSort();
        end = System.currentTimeMillis();
        karamelika.display();
        System.out.printf("Время выполнения: %d мс \n", end - start);

        System.out.println("\nSelection");
        korjik.display();
        start = System.currentTimeMillis();
        korjik.selectionSort();
        end = System.currentTimeMillis();
        korjik.display();
        System.out.printf("Время выполнения: %d мс \n", end - start);
    }
}
