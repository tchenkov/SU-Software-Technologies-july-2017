import java.util.Scanner;

/**
 * Created by todor on 7.08.2017 г..
 */
public class P01_VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine(), 16);

        System.out.println(num);
    }
}
