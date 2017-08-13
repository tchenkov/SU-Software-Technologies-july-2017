package P24_BookLibrary;

import java.util.*;
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

        for (int i = 0; i < booksCount; i++) {
            String bookData = scan.nextLine();
            String pattern = "^.+? (?<author>.+?) .+? \\d{1,2}\\.\\d{1,2}\\.\\d{4} \\d+? (?<price>\\d+?\\.\\d+?)$";
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(bookData);
            if (matcher.find()){
                String author = matcher.group("author");
                double price = Double.parseDouble(matcher.group("price"));
                Book book = new Book();
                book.setAuthorName(author);
                book.setPrice(price);

                bookLibrary.getBooks().add(book);
            }
        }

        bookLibrary.getBooks().stream()
                .collect(Collectors.groupingBy(b -> b.getAuthorName(), Collectors.summingDouble(Book::getPrice)))
                .entrySet()
                .stream()
                .sorted((a1, a2) -> {
                    int compared = a2.getValue().compareTo(a1.getValue());
                    if (compared == 0){
                        compared = a1.getKey().compareTo(a2.getKey());
                    }

                    return compared;
                })
                .forEach(p -> System.out.println(String.format("%s -> %.2f", p.getKey(), p.getValue())));
    }
}
