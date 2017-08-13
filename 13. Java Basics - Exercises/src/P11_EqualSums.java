import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by todor on 8.08.2017 г..
 */
public class P11_EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        if (numArray.length == 1)
        {
            System.out.println(0);
            return;
        }
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < numArray.length; i++)
        {
            leftSum = sumElements(Arrays.copyOfRange(numArray, 0, i));
            rightSum = sumElements(Arrays.copyOfRange(numArray, i + 1, numArray.length));
            if (leftSum == rightSum)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }

    static int sumElements (int[] arr){
        int result = 0;
        for (int num :
                arr) {
            result += num;
        }
        return result;
    }
}
