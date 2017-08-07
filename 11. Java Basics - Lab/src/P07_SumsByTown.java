import java.util.Scanner;
        import java.util.TreeMap;

/**
 * Created by todor on 4.08.2017 г..
 */
public class P07_SumsByTown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String, Double> towns = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\|");
            String town = input[0].trim();
            double income = Double.parseDouble(input[1].trim());
            
            if (!towns.containsKey(town)){
                towns.put(town, 0.0);
            }
            income += towns.get(town);
            towns.put(town, income);
        }
        
        towns.forEach((k, v) -> System.out.println(String.format("%s -> %s", k , v.toString())));
    }
}
