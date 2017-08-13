import java.util.Scanner;

/**
 * Created by todor on 8.08.2017 г..
 */
public class P10_IndexOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        for (char ch :
                input.toCharArray()) {
            System.out.println(String.format("%s -> %d", ch, (int) (ch - 'a')));
        }
    }
}
