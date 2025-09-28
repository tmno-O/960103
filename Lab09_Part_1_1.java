import java.util.Scanner;
public class Lab09_Part_1_1 {
    public static double power(double x) {
        return Math.pow(2, x);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double num = input.nextDouble();

        double result = power(num);
        System.out.println("2^" + num + " = " + result);
    }
}
