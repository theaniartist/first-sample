import java.util.Scanner;
public class TaxProgram {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        double taxAmount;
        System.out.println("What is your annual income? ");
        double income = console.nextDouble();
        if (income > 0 && income < 9526) {
            taxAmount = income * 0.10;
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income > 9526 && income < 38701) {
            taxAmount = (((income - 9525) * 0.12) + 952.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income > 38701 && income < 82501) {
            taxAmount = (((income - 38700) * 0.22) + 4453);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income > 82501 && income < 157501) {
            taxAmount = (((income-82500) * 0.24) + 14089.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income > 157501 && income < 200001) {
            taxAmount = (((income-157500) * 0.32) + 32089.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else if (income > 200001 && income < 500001) {
            taxAmount = (((income-200000) * 0.35) + 45689.5);
            System.out.println("Amount of Tax: " + taxAmount);
        } else {
            taxAmount = (((income-500000) * 0.37) + 150689.5);
            System.out.println("Amount of Tax: " + taxAmount);
        }
    }
}
