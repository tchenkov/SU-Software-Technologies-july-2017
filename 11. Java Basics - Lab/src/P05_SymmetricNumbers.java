import java.util.Scanner;

/**
 * Created by todor on 4.08.2017 г..
 */
public class P05_SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 1; i <= n; i++) {
            
            if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())){
                System.out.printf("%d ", i);
            }
        }
    }
}
