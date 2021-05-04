import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        System.out.print("введите количество метров:");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Равно СМ:"+ x*100);
        System.out.println("Равно ДМ:"+ x*10);
        System.out.println("Равно ММ:"+ x*1000);
        System.out.println("Равно МЛ:"+ x*0.0006);


    }
}
