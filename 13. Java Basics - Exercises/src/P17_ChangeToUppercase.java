import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by todor on 13.08.2017 г..
 */
public class P17_ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        String pattern = "<upcase>(?<textMatch>.+?)<\\/upcase>";
        Pattern regex = Pattern.compile(pattern);

        Matcher match = regex.matcher(text);

        while (match.find()){
            text = text.replace(match.group(0), match.group("textMatch").toUpperCase());
            match = regex.matcher(text);
        }

        System.out.println(text);
    }
}
