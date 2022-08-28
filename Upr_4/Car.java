package Upr_4;

public class Car extends Vehicle implements IsLandVehicle{
    private double kW;

    public Car (double maxSpeed, String model, double price, double kW) {
        super(maxSpeed, model, price);
        this.kW = kW;
    }

    public double getEnginePower() {
        return this.kW;
    }
    public void setEnginePower(double enginePower) {
        this.kW = enginePower;
    }

    @Override
    public double checkPromo() {
        return 20 * 1.0 /100 * this.price;
    }

    @Override
    public void enterLand() {}

}
