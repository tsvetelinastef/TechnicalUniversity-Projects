package Upr_6;

public class Books extends Goods {
    private String author;
    private String title;


    public Books() {
        super();
        this.author = " ";
        this.title = " ";
    }

    public Books(double price, int number, String author, String title) {
        this.price = price;
        this.number = number;
        this.author = author;
        this.title = title;
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

    @Override
    public double checkPromo(double price) throws PriceException {
        price = 0.91 * price;
        return price;
    }

}
