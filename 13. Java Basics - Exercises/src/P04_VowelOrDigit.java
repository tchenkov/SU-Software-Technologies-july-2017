import java.util.Scanner;

/**
 * Created by todor on 7.08.2017 г..
 */
public class P04_VowelOrDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = String.valueOf(scan.nextLine().charAt(0));
        char[] vowels = {'a', 'o', 'u', 'e', 'i'};

        if (input.matches("\\d")){
            System.out.println("digit");
        } else if (input.matches("[aouei]")){
            System.out.println("vowel");
        }
        else {
            System.out.println("other");
        }
    }
}
