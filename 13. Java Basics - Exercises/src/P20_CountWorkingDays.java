import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by todor on 13.08.2017 г..
 */
public class P20_CountWorkingDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LocalDate startDate = getDate(scan);
        LocalDate endDate = getDate(scan);

        int workingDaysCount = getWorkingDays(startDate, endDate);

        System.out.println(workingDaysCount);
    }

    private static LocalDate getDate(Scanner scan) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateStr = scan.nextLine();
        return LocalDate.parse(dateStr, format);
    }

    private static int getWorkingDays(LocalDate start, LocalDate end) {
        int workingDaysCount = 0;
        for (LocalDate currentDate = start; currentDate.compareTo(end) <= 0; currentDate = currentDate.plusDays(1)) {
            if (currentDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                currentDate.plusDays(1);
                continue;
            }
            if (currentDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                continue;
            }
            if (isHoliday(currentDate)) {
                continue;
            }
            if (currentDate.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                currentDate.plusDays(2);
            }
            workingDaysCount++;
        }

        return workingDaysCount;
    }

    private static boolean isHoliday(LocalDate currentDate) {
        List<LocalDate> holidays = new ArrayList<>();

        holidays.add(LocalDate.of(2000, 1, 1));
        holidays.add(LocalDate.of(2000, 3, 3));
        holidays.add(LocalDate.of(2000, 5, 1));
        holidays.add(LocalDate.of(2000, 5, 6));
        holidays.add(LocalDate.of(2000, 5, 24));
        holidays.add(LocalDate.of(2000, 9, 6));
        holidays.add(LocalDate.of(2000, 9, 22));
        holidays.add(LocalDate.of(2000, 11, 1));
        holidays.add(LocalDate.of(2000, 12, 24));
        holidays.add(LocalDate.of(2000, 12, 25));
        holidays.add(LocalDate.of(2000, 12, 26));

        return holidays.contains(currentDate.withYear(2000));
    }
}
