
package javaapplication139;
public class Order {
   private int customerId;
   private int orderId;
   private Product []products;
   private float totalPrice;

    public Order(int customerId, int orderId, Product[] products,float totalPrice ) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice=Math.abs(totalPrice);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
   
    public void printOrderInfo(){
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
       
        
        for (int i = 0; i < products.length ; i++) {
            if (products[i] != null) {
            System.out.println( (i+1) + products[i].getName() + ": $" + products[i].getPrice());
        }
    }
    System.out.println("Total Price: $" + totalPrice);
}
        }
    
   
   

