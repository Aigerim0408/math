import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" num = ");
        int num = scanner.nextInt();
        System.out.print("num1 = ");
        int num1 = scanner.nextInt();
        System.out.print("num2 = ");
        int num2 = scanner.nextInt();
        int sum = num + num1 + num2;
        int sum1 = num * num1 * num2;
        double sum2 = (double) sum / 3;
        System.out.println(num + " + " + num1 + " + " + num2 + " = " + sum);
        System.out.println(num + " + " + num1 + " + " + num2 + " = " + sum1);
        System.out.println("(" + num + " + " + num1 + " + " + num2 + ")" + "/" + 3 + " = " + sum2);
    }
}