import java.util.Scanner;

/**
 * Created by todor on 3.08.2017 г..
 */
public class P03_3IntegersSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] input = scan.nextLine().split(" ");
        int[] inputNums = new int[input.length];
        for (int i = 0; i < input.length; i++){
            inputNums[i] = Integer.parseInt(input[i]);
        }
    
        for (int i = 0; i < inputNums.length - 1; i++) {
            for (int j = i + 1; j < inputNums.length; j++) {
                int currentSum = inputNums[i] + inputNums[j];
                for (int k = 0; k < inputNums.length; k++) {
                    if (k != i && k != j && inputNums[k] == currentSum){
                        int min = Math.min(inputNums[i], inputNums[j]);
                        int max = Math.max(inputNums[i], inputNums[j]);
                        System.out.printf("%d + %d = %d", min, max , currentSum);
                        return;
                    }
                }
            }
        }
    
        System.out.println("No");
    }
}
