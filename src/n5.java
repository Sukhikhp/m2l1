import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        System.out.print("введите четырех значное число:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = x / 1000;
        int b = (x - 1000 * a) / 100;
        int c = (x - 1000 * a - 100 * b) / 10;
        int d = x % 10;
        System.out.print("Переворачиваем:");
        System.out.print(d);
        System.out.print(c);
        System.out.print(b);
        System.out.print(a);
    }
}
