package Lesson6;

public class StackImpl implements Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackImpl(int s) {
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
        if (isEmpty()) {
            System.out.println("Стек пуст");
            return 0;
        }
        else {
            return stackArray[top--];
        }
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
