import java.util.Scanner;
public class Lab09_Part_2_2 {
    public static String OddEven(int x) {
        if (x % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = input.nextInt();
        System.out.println(OddEven(num));
    }
}
