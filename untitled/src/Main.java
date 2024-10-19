import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task 1 (ID:0108)
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextInt());

        //Task 2 (ID:0001)
        Scanner scanner2 = new Scanner(System.in);
        System.out.println(scanner2.nextInt() + scanner2.nextInt());

        //Task 3 (ID:0903)
        Scanner scanner3 = new Scanner(System.in);
        System.out.println(scanner3.nextInt() + 1);

        //Task 4 (ID:0942)


        //Task 5 (ID:0025)
        Scanner scanner5 = new Scanner(System.in);
        int a = scanner5.nextInt();
        int b = scanner5.nextInt();
        if (a > b)
            System.out.println(">");
        else if (a < b)
            System.out.println("<");
        else
            System.out.println("=");
    }
}