import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by todor on 13.08.2017 г..
 */
public class P19_PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        TreeMap<String, String> phoneBook = new TreeMap<>();

        while (!command.equals("END"))
        {
            String[] commandList = command
                    .split(" ");
            String instruction = commandList[0];

            if (instruction.equals("ListAll"))
            {
                PrintPhoneBookEntries(phoneBook);
                command = scan.nextLine();
                continue;
            }

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

    private static void SearchPhoneNumberByName(TreeMap<String, String> phoneBook, String name)
    {
        System.out.println(
                phoneBook.containsKey(name) ?
                        String.format("%s -> %s", name, phoneBook.get(name)) :
                        String.format("Contact %s does not exist.", name)
        );
    }

    static void AddPhoneNumber(TreeMap<String, String> phoneBook,
                               String[] commandList, String name)
    {
        String phoneNumber = commandList[2];
        phoneBook.put(name, phoneNumber);
    }

    static void PrintPhoneBookEntries(TreeMap<String, String> phoneBook)
    {
        for (String name : phoneBook.keySet())
        {
            System.out.println(String.format("%s -> %s", name, phoneBook.get(name)));
        }
    }
}

