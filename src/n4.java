import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        System.out.print("Основание:");
        int x = new Scanner(System.in).nextInt();
        System.out.print("Высота:");
        int y = new Scanner(System.in).nextInt();
        System.out.println("площадь треугольника равна:" + x * y * 0.5);
    }

}
