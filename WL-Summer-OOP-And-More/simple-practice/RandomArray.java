import java.util.*;
public class RandomArray {
    public static void main (String args[]) {
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        int n = r.nextInt(19) +1;
        System.out.println("Number of arrays: " + n);
        int [] list = new int[n];
        int num;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("Enter your number: ");
        for (int i = 0; i<list.length; i++) {
            num = console.nextInt();
            list[i] = num;
            if (list[i] > 0) {
                positive++;
            } else if (list[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Number of positives: " + positive);
        System.out.println("Number of negatives: " + negative);
        System.out.println("Number of zeros: " + zero);
    }
}
