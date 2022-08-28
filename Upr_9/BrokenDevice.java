package Upr_9;

public class BrokenDevice extends Device {
    private String symptoms;
    private int time;


    public BrokenDevice() {
        super();
        this.setSymptoms("");
        this.setTime(0);

    }
    public BrokenDevice(String brand, String model, int  price, String symptoms, int time)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.setSymptoms(symptoms);
        this.setTime(time);
    }
    public String getSymptoms() {
        return symptoms;
    }
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }


}
