package Upr_8;


public class Electronics extends Product {
    private String manufacturer;
    private String model;


    public Electronics(int inventoryNumber, double price, int quantity, String provider, String manufacturer2, String model2) {
        super();
        this.setManufacturer(" ");
        this.setModel(" ");

    }

    public Electronics(int inventoryNumber, int price, int quantity, String provider, String manufacturer, String model) {
        this.inventoryNumber = inventoryNumber;
        this.price = price;
        this.quantity = quantity;
        this.provider = provider;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPromotionalPrice(double price) {
        return price * 0.9;
    }

    public boolean sellProduct(int piece) throws NoMoreProductsException {
        while (quantity > 0) {
            quantity = quantity - piece;
            return true;
        }
        if (quantity == 0) {
            throw new NoMoreProductsException();
        }
        return true;
    }


}