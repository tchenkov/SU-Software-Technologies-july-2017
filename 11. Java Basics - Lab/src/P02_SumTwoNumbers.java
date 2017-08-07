import java.util.Scanner;

/**
 * Created by todor on 3.08.2017 г..
 */
public class P02_SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double num1 = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());
        double result = num1 + num2;
        boolean isInt = num1 == (int) num1 && num2 == (int) num2;
        if (isInt) {
            System.out.printf("%.0f%n", result);
        }
        else{
            System.out.printf("%.2f%n", result);
        }
    }
}
