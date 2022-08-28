package Upr_6;

public class Televisions extends Goods implements ElectricalAppliance {
    private String manufacturer;
    private String model;
    private int power;

    public Televisions() {
        super();
        this.manufacturer = " ";
        this.model = " ";
        this.power = 0;
    }

    public Televisions(double price, int number, String manufacturer, String model, int power) {
        this.price = price;
        this.number = number;
        this.setManufacturer(manufacturer);
        this.setModel(model);
        this.setPower(power);
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public double checkPromo(double price) throws PriceException {
        price = 0.91 * price;
        return price;
    }

    @Override
    public double Costs() throws PowerException {
        return power * 30 * 24;
    }
}
