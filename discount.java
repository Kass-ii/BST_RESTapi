import java.util.Scanner;

public class discount {
    
    public static double calculateDiscount(double price, String category) {
        double discountRate = 0.0;
        
        category = category.toLowerCase();
        
        if (category.equals("electronics")) {
            discountRate = 0.10;
        } else if (category.equals("clothing")) {
            discountRate = 0.15;
        } else if (category.equals("groceries")) {
            discountRate = 0.05;
        } else {
            System.out.println("Unknown category. No discount applied.");
        }
        
        
        return price * (1 - discountRate);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the product price: ");
            double price = input.nextDouble();
            
        
            if (price == -1) {
                System.out.println("Transactions complete.");
                break;
            }
            
            System.out.print("Enter the product category: ");
            String category = input.nextLine();
            
        
            double discountedPrice = calculateDiscount(price, category);
            System.out.println("Discounted price: " + discountedPrice);
        }
        
        input.close();
    }
}
