import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by todor on 13.08.2017 г..
 */
public class P16_UrlParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String url = scan.nextLine();

        String pattern = "^((?<protocol>.+?):\\/\\/)?(?<server>.+?)(\\/(?<resource>.+)?)?$";
        Pattern regex = Pattern.compile(pattern);

        Matcher match = regex.matcher(url);

        if (match.find()){
            System.out.printf("[protocol] = \"%s\"%n", match.group("protocol") == null ? "" : match.group("protocol"));
            System.out.printf("[server] = \"%s\"%n", match.group("server") == null ? "" : match.group("server"));
            System.out.printf("[resource] = \"%s\"%n", match.group("resource") == null ? "" : match.group("resource"));
        }
    }
}
