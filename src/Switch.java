import java.util.Scanner;

public class Switch {

    public static final int PENNY = 1;
    public static final int NICKEL =5;
    public static final int DIME = 10;
    public static final int QUARTER = 25;
    public static final int HALF_DOLLAR = 50;

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a moneyValue: ");
        int moneyValue = console.nextInt();

        if (moneyValue == PENNY) {
            System.out.print("It is a penny.");
        } else if (moneyValue == NICKEL) {
            System.out.println("It is a nickel.");
        } else if (moneyValue == DIME) {
            System.out.println("It is a dime.");
        } else if (moneyValue == QUARTER) {
            System.out.println("It is a quarter.");
        } else if (moneyValue > HALF_DOLLAR) {
            System.out.println("It is a half dollar.");
        } else {
            System.err.println("It is not a US currency coin.");
        }
        switch(moneyValue) {
            case PENNY:
                System.out.println("Penny");
                break;
            case NICKEL:
                System.out.println("nickel");
                break;
            case DIME:
                System.out.println("dime");
                break;
            case QUARTER:
                System.out.println("quarter");
                break;
            case HALF_DOLLAR:
                System.out.println("half dollar");
                break;
            default:
                System.out.print("not anything");
                break;
        }

    }
}
