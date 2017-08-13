import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by todor on 8.08.2017 г..
 */
public class P12_BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine();
        Integer[] inputArr = Arrays.stream(inputStr.split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(inputArr));

        int[] bombAndPower = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        BombNumList(numList, bombAndPower[0], bombAndPower[1]);

        int sum = 0;
        for (Integer e : numList) {
            sum += e;
        }
        System.out.println(sum);
    }

    static void BombNumList(ArrayList<Integer> numList, int bomb, int power)
    {

        while (numList.contains(bomb))
        {
            int currentBombIndex = numList.indexOf(bomb);
            int startIndex = currentBombIndex - power < 0 ?
                    0 :
                    currentBombIndex - power;
            int endIndex = currentBombIndex + power >= numList.size() ?
                    numList.size() - 1 :
                    currentBombIndex + power;
            int numberOfElementsToRemove = endIndex - startIndex;

            for (int i = 0; i <= numberOfElementsToRemove; i++)
            {
                numList.remove(startIndex);
            }
        }
    }
}
