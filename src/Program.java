import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int number;
        int max = -1;
        do {
            number = console.nextInt();
            if (number > max) {
                max = number;
            }
        } while (number != 0);
        System.out.println("Max: " + max);
    }
}

