import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by todor on 8.08.2017 г..
 */
public class P09_MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] intArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        HashMap<Integer, Integer> countPerNum = new HashMap<>();
        for (int i = 0; i < intArray.length; i++)
        {
            if (!countPerNum.containsKey(intArray[i]))
            {
                countPerNum.put(intArray[i], 0);
            }
            countPerNum.put(intArray[i], countPerNum.get(intArray[i]) + 1);
        }

        int maxCount = -1;
        for (int num :
                countPerNum.values()) {
            if (maxCount < num){
                maxCount = num;
            }
        }

        for (int num :
                intArray) {
            if (countPerNum.get(num) == maxCount){
                System.out.println(num);
                break;
            }
        }
    }
}
