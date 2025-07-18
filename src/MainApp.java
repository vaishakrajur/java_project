import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers to add: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Sum: " + Addition.add(x, y));

        System.out.print("Enter a number for factorial: ");
        int n = scanner.nextInt();
        System.out.println("Factorial: " + Factorial.compute(n));
    }
}

