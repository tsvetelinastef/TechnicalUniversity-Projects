package Upr_8;

public abstract class Product {
    public int inventoryNumber;
    public double price;
    public int quantity;
    public String provider;


    public Product() {
        this.inventoryNumber = 0;
        this.price = 0.0;
        this.quantity = 0;
        this.provider = " ";
    }

    public Product(int inventoryNumber, int price, int quantity, String provider) {
        this.inventoryNumber = inventoryNumber;
        this.price = price;
        this.quantity = quantity;
        this.provider = provider;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public abstract double getPromotionalPrice(double price);

    public abstract boolean sellProduct(int piece) throws NoMoreProductsException;


}
