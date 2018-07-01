import java.util.Scanner;

public class ArrayMax {
    public static void main(String args[]) {
        int list [] = new int [] {1,3,5,6,7,3,1,6,10};
        int max = list[0];
        for (int i=1; i<list.length; i++) {
            if (list[i]>max) {
                max = list[i];
            }
        }
        System.out.println("Max array: " + max);
    }
}
