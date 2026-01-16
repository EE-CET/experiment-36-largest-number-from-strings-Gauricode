import java.util.Scanner;
import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();   
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

      
        if (arr[0].equals("0")) {
            System.out.print("0");
            return;
        }

        StringBuilder large = new StringBuilder();
        for (String s : arr) {
            large.append(s);
        }

        System.out.println(large);
    }
}
