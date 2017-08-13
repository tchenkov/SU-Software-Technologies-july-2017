import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by todor on 13.08.2017 г..
 */
public class P21_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int messagesCount = Integer.parseInt(scan.nextLine());
        List<String> messages = generateRandomMessage(messagesCount);

        messages.forEach(System.out::println);
    }

    private static List<String> generateRandomMessage(int count) {
        String[] phrases =
                {
                        "Excellent product.",
                        "Such a great product.",
                        "I always use that product.",
                        "Best product of its category.",
                        "Exceptional product.",
                        "I can’t live without this product."
                };
        String[] events =
                {
                        "Now I feel good.",
                        "I have succeeded with this product.",
                        "Makes miracles. I am happy of the results!",
                        "I cannot believe but now I feel awesome.",
                        "Try it yourself, I am very satisfied.",
                        "I feel great!"
                };
        String[] author =
                {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city =
                {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rand = new Random();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String randomPhrase = phrases[rand.nextInt(phrases.length)];
            String randomEvent = events[rand.nextInt(events.length)];
            String randomAuthor = author[rand.nextInt(author.length)];
            String randomCity = city[rand.nextInt(city.length)];
            String message = String.format("%s %s %s – %s.", randomPhrase, randomEvent, randomAuthor, randomCity);
            result.add(message);
        }

        return result;
    }
}
