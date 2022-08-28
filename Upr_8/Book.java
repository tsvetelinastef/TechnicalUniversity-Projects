package Upr_8;

public class Book extends Product {
    private String author;
    private String title;

    public Book(int inventoryNumber, double price, int quantity, String provider, String author2, String title2) {
        super();
        this.setAuthor("");
        this.setTitle("");
    }

    public Book(int inventoryNumber, int price, int quantity, String provider, String author, String title) {
        this.inventoryNumber = inventoryNumber;
        this.price = price;
        this.quantity = quantity;
        this.provider = provider;
        this.setAuthor(author);
        this.setTitle(title);

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double hetPromotionalPrice(double price) {
        return price - 100;
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

    @Override
    public double getPromotionalPrice(double price) {
        return 0;
    }

}


