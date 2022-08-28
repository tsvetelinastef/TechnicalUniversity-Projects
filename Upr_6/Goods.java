package Upr_6;

public abstract class Goods {
    double price;
    int number;


    public Goods() {
        this.price = 0.0;
        this.number = 0;

    }

    public Goods(double price, int number) {
        this.price = price;
        this.number = number;
    }

    public double getPrice() {
        return price;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract double checkPromo(double price) throws PriceException;
}
