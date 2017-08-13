import java.util.Scanner;

/**
 * Created by todor on 7.08.2017 г..
 */
public class P03_ReverseCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder result = new StringBuilder();
        int n = 3;
        while (n > 0){
            result.append(scan.nextLine());
            n--;
        }

        System.out.println(result.reverse());
    }
}
