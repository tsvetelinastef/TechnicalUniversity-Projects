package Upr_9;


import java.util.Scanner;


public class Device {
    protected String brand;
    protected String model;
    protected int price;

    public Device() {

        this.setBrand("");
        this.setModel("");
        this.setPrice(0);
    }
    public Device(String brand, String model, int price)
    {
        this.setBrand(brand);
        this.setModel(model);
        this.setPrice(price);

    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Brand:");
        brand=sc.next();
        System.out.println("Model:");
        model=sc.next();
        System.out.println("Price:");
        price=sc.nextInt();
    }
    public void Output(Device ob)
    {


        brand=ob.getBrand();
        System.out.println(brand);
        model=ob.getModel();
        System.out.println(model);
        price=ob.getPrice();
        System.out.println(price);
    }


}
