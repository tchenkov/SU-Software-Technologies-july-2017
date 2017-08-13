import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by todor on 8.08.2017 г..
 */
public class P08_MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayInput = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int startIndex = 0;
        int length = 1;
        int maxStartIndex = 0;
        int maxLength = 1;
        for (int i = 1; i < arrayInput.length; i++)
        {
            if (arrayInput[i] > arrayInput[i - 1])
            {
                length++;
                if (length > maxLength)
                {
                    maxLength = length;
                    maxStartIndex = startIndex;
                }
            }
            else
            {
                startIndex = i;
                length = 1;
            }
        }

        int[] outputArray = Arrays.copyOfRange(arrayInput, maxStartIndex, maxStartIndex + maxLength);
        String output = Arrays.stream(outputArray)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
