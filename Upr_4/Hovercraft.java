package Upr_4;

public class Hovercraft extends Vehicle implements IsSeaVessel, IsLandVehicle {
    private int passengers;

    public Hovercraft(double maxSpeed, String model, double price, int passengers) {
        super(maxSpeed, model, price);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void setPassengers(int enginePower) {
        this.passengers = enginePower;
    }

    @Override
    public double checkPromo() {
        return 3 * 1.0 / 100 * this.price;
    }

    @Override
    public void enterSea() {
    }

    @Override
    public void enterLand() {
    }
}