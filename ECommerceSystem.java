
package javaapplication139;
import java.util.Scanner;
public class ECommerceSystem {
  
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       ElectronicProduct electronicproduct = new ElectronicProduct(1, "smartphone",599.9f, "Samsung", 1 );
       ClothingProduct clothingProduct = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
       BookProduct bookProduct = new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X Publications");
        System.out.println("welcome to the E-commerce System");
        System.out.println("please enter your id");
        int customerId = input.nextInt();
        System.out.println("please enter your name");
        String name = input.next();
         System.out.println("please enter your address");
        String address = input.next();
        Customer customer = new Customer(customerId , name, address);
        System.out.println("How many products do you want to order?");
        int nProducts = input.nextInt();
        Cart cart = new Cart(customerId, nProducts);
        for (int i = 0; i < nProducts; i++) {
            System.out.println("which product would you like to add? " + (i + 1) + ": 1. Electronic, 2. Clothing, 3. Book");
           int productType  = input.nextInt();
            
            switch (productType ) {
                case 1:
                    cart.addProduct(electronicproduct, i);
                    break;
                case 2:
                    cart.addProduct(clothingProduct, i);
                    break;
                case 3:
                    cart.addProduct(bookProduct, i);
                    break;
                default:
                    System.out.println("Invalid product type.");
            }
        }
      System.out.println("your total is $ "+cart.calculatePrice());
        System.out.println("Do you want to place the order? 1- yes  2- No");
        int orderchoice = input.nextInt();
        if( orderchoice == 1){
           float totalPrice = cart.calculatePrice();
            Order order = new Order(customer.getCustomerId(), 1, cart.getProducts(), totalPrice);
            order.printOrderInfo();
        } else {
            System.out.println("Order placement cancelled.");
        }
       
    }
}
