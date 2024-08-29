import java.util.Scanner;

public class Discountjakkapat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer type (Silver/Gold/Platinum): ");
        String customerType = scanner.nextLine();

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double finalAmount = myMethod(customerType, purchaseAmount);
        
        System.out.println("Final amount after discount: " + finalAmount);
        
        scanner.close();
    }

    public static double myMethod(String customerType, double purchaseAmount) {
        double discount = 0.0;

        if (customerType.equalsIgnoreCase("Silver") && purchaseAmount > 1000) {
            discount = 0.02; // 2% discount for Silver
        } else if (customerType.equalsIgnoreCase("Gold") && purchaseAmount > 1000) {
            discount = 0.03; // 3% discount for Gold
        } else if (customerType.equalsIgnoreCase("Platinum")) {
            discount = 0.05; // 5% discount for Platinum
        }

        double finalAmount = purchaseAmount - (purchaseAmount * discount);
        return finalAmount;
    }
}