
package javaapplication139;
public class Cart {
   private int customerId;
   private int nProducts;
   private Product[] products;

    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[nProducts];
    }
   public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void addProduct(Product product , int index){
        
        if (index >= 0 && index < nProducts) {
            products[index] = product;
        } else {
            System.out.println("Invalid index.");
        }  
    }
    public void removeProduct(int index){
        if (index >= 0 && index < nProducts) {
            products[index] = null;
        } else {
            System.out.println("Invalid index.");
        }
    }
    /*for (Product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }*/
    public float calculatePrice(){
        float totalprice = 0;
        for (int i = 0; i < nProducts; i++) {
            Product product = products[i];
            if (product != null)
                totalprice += product.getPrice();
        }
        return totalprice;
    }
    public Order placeOrder() {
        return new Order(customerId, nProducts, products, calculatePrice());
    }
    
}
