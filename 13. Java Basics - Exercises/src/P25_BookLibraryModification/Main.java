package P25_BookLibraryModification;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by todor on 13.08.2017 г..
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int booksCount = Integer.parseInt(scan.nextLine());

        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.setBooks(new ArrayList<>());
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        for (int i = 0; i < booksCount; i++) {
            String bookData = scan.nextLine();
            String pattern = "(?<title>^.+?) .+? .+? (?<date>\\d{1,2}\\.\\d{1,2}\\.\\d{4}) \\d+? \\d+?\\.\\d+?$";
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(bookData);
            if (matcher.find()){
                String title = matcher.group("title");

                LocalDate date = LocalDate.parse(matcher.group("date"), format);
                Book book = new Book();
                book.setTitle(title);
                book.setReleaseDate(date);

                bookLibrary.getBooks().add(book);
            }
        }

        LocalDate startDate = LocalDate.parse(scan.nextLine(), format);

        bookLibrary.getBooks().stream()
                .filter(b -> b.getReleaseDate().compareTo(startDate) > 0)
                .sorted((b1, b2) -> {
                    int compared = b1.getReleaseDate().compareTo(b2.getReleaseDate());
                    if (compared == 0){
                        compared = b1.getTitle().compareTo(b2.getTitle());
                    }

                    return compared;
                })
                .forEach(p -> System.out.println(String.format("%s -> %s", p.getTitle(), p.getReleaseDate().format(format))));
    }
}
