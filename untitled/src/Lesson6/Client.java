package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class Client {
    public static void main(String[] args){
        Random random = new Random();
        String palindrom = "ABCBAC";
        int size = 10;

        StackImpl stack = new StackImpl(palindrom.length());
        QueueImpl queue = new QueueImpl(size);
        PriorityQueue priorityQueue = new PriorityQueue(size);

        for (int i = 0; i < size; i++) {
            queue.insert(random.nextLong(100));
            priorityQueue.insert(random.nextLong(100));
        }

        queue.display();
        priorityQueue.display();

        //Проверка на палиндром
        char[] chars = palindrom.toCharArray();
        for (char c: chars)
        {
            stack.push(c);
        }
        char[] charsStr = new char[chars.length];
        for (int i = 0; !stack.isEmpty(); i++){

            charsStr[i] = stack.pop();
        }

        if (Arrays.equals(chars, charsStr)) System.out.println("\nСтрока " + palindrom + " - палиндром");
        else System.out.println("\nСтрока " + palindrom + " - не палиндром");
    }
}
