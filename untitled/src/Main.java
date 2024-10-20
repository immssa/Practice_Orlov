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

        //Task 4 (ID:0766)
        Scanner scanner4 = new Scanner(System.in);
        int N = scanner4.nextInt();
        int M = scanner4.nextInt();
        int K = scanner4.nextInt();
        if (N * M >= K)
            System.out.println("YES");
        else
            System.out.println("NO");

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

        //Task 6 (ID:0195)
        Scanner scanner6 = new Scanner(System.in);
        System.out.println(scanner6.nextInt() * scanner6.nextInt() * scanner6.nextInt() * 2);

        //Task 7 (ID:0773)
        Scanner scanner7 = new Scanner(System.in);
        int k = scanner7.nextInt();
        int m = scanner7.nextInt();
        System.out.println(k * k * m);
    }
}