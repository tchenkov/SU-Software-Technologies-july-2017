import java.util.Scanner;

/**
 * Created by todor on 10.08.2017 г..
 */
public class P13_ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scan.nextLine());
        sb.reverse();
        System.out.println(sb);
    }
}
