import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by todor on 4.08.2017 г..
 */
public class P06_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] input = scan.nextLine().split(" ");
        ArrayList<Integer> inputList = new ArrayList<Integer>();
    
        for (String str: input) {
            inputList.add(Integer.parseInt(str));
        }
        Comparator<Integer> comparator = Collections.reverseOrder();
        inputList.sort(comparator);
        
        int length = inputList.size() > 2 ?
                3 :
                inputList.size();
    
        for (int i = 0; i < length; i++) {
            System.out.println(inputList.get(i));
        }
    }
}
