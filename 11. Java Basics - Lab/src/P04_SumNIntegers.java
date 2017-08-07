import java.util.Scanner;

/**
 * Created by todor on 4.08.2017 г..
 */
public class P04_SumNIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        
        int sum = 0;
    
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(scan.nextLine());
        }
    
        System.out.printf("Sum = %d%n", sum);
    }
}
