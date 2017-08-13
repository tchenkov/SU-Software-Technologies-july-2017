import java.util.Scanner;

/**
 * Created by todor on 10.08.2017 г..
 */
public class P14_FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.nextLine();
        int stringSize = 20;

        string = string.length() < stringSize ?
                padRight(string, '*', stringSize) :
                string.substring(0, stringSize);
        System.out.println(string);
    }

    private static String padRight(String string, char symbol, int padToSize) {
        int add = padToSize - string.length();
        StringBuilder result = new StringBuilder(string);
        for (int i = 0; i < add; i++) {
            result.append(symbol);
        }
        return result.toString();
    }
}
