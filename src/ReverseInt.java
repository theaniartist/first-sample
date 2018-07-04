import java.util.*;
public class ReverseInt {
    public static void main(String args[]) {
        int [] list = new int [6];
        int num;
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            num = console.nextInt();
            list[i] = num;
        }
        reverse(list);
        for (int i = 0; i < list.length; i++) {
             System.out.print(list[i]);
        }
    }
   public static void reverse (int [] list) {
        for (int i = 0; i < list.length/2; i++) {
            int j = list.length - i -1;
            swap(list, i ,j);
        }
   }
   public static void swap(int [] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
   }
}
