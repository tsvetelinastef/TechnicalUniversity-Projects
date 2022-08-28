package Upr_4;
public class Ship extends Vehicle implements IsSeaVessel {
    private double deadweight;

    public Ship (double maxSpeed, String model, double price, double deadweight) {
        super(maxSpeed, model, price);
        this.deadweight = deadweight;
    }

    public double getDeadweight() {
        return this.deadweight;
    }
    public void setDeadweight(double enginePower) {
        this.deadweight = enginePower;
    }

    @Override
    public double checkPromo() {
        return 3 * 1.0 /1000*this.price;
    }

    @Override
    public void enterSea() {}

}
