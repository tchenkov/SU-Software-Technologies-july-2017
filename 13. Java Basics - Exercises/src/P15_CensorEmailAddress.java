import java.util.Scanner;

/**
 * Created by todor on 13.08.2017 г..
 */
public class P15_CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();
        String text = scan.nextLine();

        text = hideMyEmail(text, email);

        System.out.println(text);
    }

    private static String hideMyEmail(String text, String email) {
        String censoredEmail = censorEmail(email);
        String result = text.replaceAll(email, censoredEmail);
        return result;
    }

    private static String censorEmail(String email) {
        int usernameLength = email.indexOf('@');
        String result = stringRepeat("*", usernameLength) + email.substring(usernameLength);
        return result;
    }

    private static String stringRepeat(String repeatStr, int count) {
        StringBuilder result = new StringBuilder(repeatStr);
        for (int i = 1; i < count; i++) {
            result.append(repeatStr);
        }
        return result.toString();
    }
}
