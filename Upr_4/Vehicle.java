package Upr_4;


public abstract class Vehicle {
    protected double maxSpeed;
    protected String model;
    protected double price;

    public Vehicle(double maxSpeed, String model, double price) {
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.price = price;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double checkPromo();

}
