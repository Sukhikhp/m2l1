import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
            System.out.print("введите число:");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int a = x / 1000;
            int b = (x - 1000 * a) / 100;
            int c = (x - 1000 * a - 100 * b) / 10;
            int d = x % 10;
            System.out.println("Результат вычисления:" + a * b * c * d);
    }
}
