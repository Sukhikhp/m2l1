import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        double x = new Scanner(System.in).nextDouble();
        int y = (int) x;
        System.out.println(y == x ? "целое число" : "Дробное Число");

    }
}
