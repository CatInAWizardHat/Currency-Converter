import java.util.Scanner;

public class CurrencyConverter {

    protected static final double RUPEE_CONVERSION = 62.69;

    protected static final double USD_CONVERSION = 0.73;

    protected static final double EURO_CONVERSION = 0.64;

    public static void convertRupee(double amount) {
        double rupees = amount * RUPEE_CONVERSION;

        System.out.printf("$%.2f CAD is worth ₹%.2f INR\n", amount, rupees);
    }

    public static void convertUSD(double amount) {
        double usd = amount * USD_CONVERSION;

        System.out.printf("$%.2f CAD is worth $%.2f USD\n", amount, usd);
    }

    public static void convertEuro(double amount) {
        double euros = amount * EURO_CONVERSION;

        System.out.printf("$%.2f CAD is worth €%.2f EUR\n", amount, euros);
    }

    public static void main(String[] args) {
        System.out.println("1 - Rupee");
        System.out.println("2 - USD");
        System.out.println("3 - Euro");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        System.out.print("Enter amount in CAD: ");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                convertRupee(amount);
                break;
            case 2:
                convertUSD(amount);
                break;
            case 3:
                convertEuro(amount);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}
