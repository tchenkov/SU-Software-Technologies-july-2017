import java.util.Scanner;

/**
 * Created by todor on 7.08.2017 г..
 */
public class P06_CompareCharArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = String.join("", scan.nextLine().split(" "));
        String str2 = String.join("", scan.nextLine().split(" "));

        int compare = str1.compareTo(str2);

        if (compare < 0) {
            System.out.println(str1);
            System.out.println(str2);
        } else if (compare > 0) {
            System.out.println(str2);
            System.out.println(str1);
        } else {
            System.out.println(str1);
            System.out.println(str2);
        }


    }
}
