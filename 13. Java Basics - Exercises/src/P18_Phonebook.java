import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by todor on 13.08.2017 г..
 */
public class P18_Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        HashMap<String, String> phoneBook = new HashMap<>();

        while (!command.equals("END"))
        {
            String[] commandList = command
                    .split(" ");
            String instruction = commandList[0];
            String name = commandList[1];

            if (instruction.equals("A"))
            {
                AddPhoneNumber(phoneBook, commandList, name);
            }

            if (instruction.equals("S"))
            {
                SearchPhoneNumberByName(phoneBook, name);
            }

            command = scan.nextLine();
        }
    }

    private static void SearchPhoneNumberByName(HashMap<String, String> phoneBook, String name)
    {
        System.out.println(
                phoneBook.containsKey(name) ?
                        String.format("%s -> %s", name, phoneBook.get(name)) :
                        String.format("Contact %s does not exist.", name)
                );
    }

    static void AddPhoneNumber(HashMap<String, String> phoneBook,
                               String[] commandList, String name)
    {
        String phoneNumber = commandList[2];
        phoneBook.put(name, phoneNumber);
    }
}
