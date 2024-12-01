package Lesson6;

import java.io.IOException;

public class Stack implements StackInterface{
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j){
        if ((top + 1) == maxSize)
        {
            //throw new ArrayIndexOutOfBoundsException("Стек переполнен");
            System.out.println("Стек перепонен");
        }
        else stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }
}
