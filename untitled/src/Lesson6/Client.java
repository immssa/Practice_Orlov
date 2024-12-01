package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class Client {
    public static void main(String[] args){
        Random random = new Random();
        String palindrom = "ABCBA";
        int size = 100;

        Stack stack = new Stack(palindrom.length());
        Queue queue = new Queue(size);
        PriorityQueue priorityQueue = new PriorityQueue(size);

        for (int i = 0; i < size; i++) {
            queue.insert(random.nextLong(10000));
            priorityQueue.insert(random.nextLong(10000));
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
