import java.util.Scanner;

/**
 * Created by todor on 7.08.2017 г..
 */
public class P02_BooleanVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean bool = Boolean.parseBoolean(scan.nextLine());

        System.out.println(
                bool ?
                        "Yes" :
                        "No"
        );
    }
}
