package Upr_9;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    List<Device> devices = new ArrayList<>();
    List<BrokenDevice> brokendevices = new ArrayList<>();
    public void ReadFile() {

        Scanner sc=new Scanner("healthy.txt");
        Scanner sc2=new Scanner("injured.txt");
        try {
            FileInputStream in = new FileInputStream("healthy.txt");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        while(sc.hasNext())
        {
            String[] in=sc.nextLine().split("\\s");
            devices.add(new Device(in[0], in[1], Integer.parseInt(in[2])));
        }
        try {
            FileInputStream in2 = new FileInputStream("injured.txt");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        while(sc2.hasNext())
        {
            String[] in=sc2.nextLine().split("\\s");
            brokendevices.add(new BrokenDevice(in[0], in[1], Integer.parseInt(in[2]), in[3], Integer.parseInt(in[4])));
        }

    }

    public void WriteFile(String filename) throws IOException
    {
        FileWriter wr= new FileWriter(filename);
        for(Device device: devices)
        {
            wr.write(String.format("%s %s %d %n", device.getBrand(), device.getModel(), device.getPrice()));
        }
        for(BrokenDevice device: brokendevices)
        {
            wr.write(String.format("%s %s %d %s %d %n", device.getBrand(), device.getModel(), device.getPrice(), device.getSymptoms(), device.getTime()));
        }
    }

    public void NewDevice() throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int num;
        String brand;
        String model;
        int price;
        String symptoms;
        int time;
        System.out.println("new or broken(1 or 2)");
        num=sc.nextInt();
        if(num==1)
        {
            brand=sc.nextLine();
            model=sc.nextLine();
            price=sc.nextInt();


            Device newd=new Device(brand,model, price);
            WriteFile("healthy.txt");
        }
        if(num==2)
        {
            brand=sc.nextLine();
            model=sc.nextLine();
            price=sc.nextInt();
            symptoms=sc.nextLine();
            time=sc.nextInt();
            BrokenDevice newbd=new BrokenDevice(brand,model, price, symptoms, time);
            WriteFile("unhealthy.txt");
        }
    }
    public void newBroken()
    {
        Scanner sc=new Scanner(System.in);

        String brand;
        String model;
        int price;
        String symptoms;
        int time;
        brand=sc.nextLine();
        model=sc.nextLine();
        price=sc.nextInt();
        symptoms=sc.nextLine();
        time=sc.nextInt();
        if(symptoms=="" && time==0)
        {
            System.out.println("Not broken");
        }
        else
        {
            BrokenDevice newbd=new BrokenDevice(brand,model, price, symptoms, time);
            System.out.println("Accepted");
        }
    }
    public void Transfer() throws IOException
    {
        Scanner sc2=new Scanner("healthy.txt");
        try {
            FileInputStream in2 = new FileInputStream("injured.txt");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        while(sc2.hasNext())
        {
            String[] in=sc2.nextLine().split("\\s");
            brokendevices.add(new BrokenDevice(in[0], in[1], Integer.parseInt(in[2]), in[3], Integer.parseInt(in[4])));
            if(in[3]=="" && Integer.parseInt(in[4])==0)
            {
                Device fix=new Device(in[0], in[1], Integer.parseInt(in[2]));
                WriteFile("injured.txt");
            }

        }

    }
    public void Symptom(String sym)
    {

        Scanner sc2=new Scanner("injured.txt");
        try {
            FileInputStream in2 = new FileInputStream("injured.txt");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        while(sc2.hasNext())
        {
            String[] in=sc2.nextLine().split("\\s");
            brokendevices.add(new BrokenDevice(in[0], in[1], Integer.parseInt(in[2]), in[3], Integer.parseInt(in[4])));
            if(sym.equals(in[3]))
            {
                System.out.println(brokendevices);
            }

        }
    }
    public void count()
    {
        Scanner sc=new Scanner("healthy.txt");
        int sum=0;
        try {
            FileInputStream in = new FileInputStream("healthy.txt");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        while(sc.hasNext())
        {
            String[] in=sc.nextLine().split("\\s");
            devices.add(new Device(in[0], in[1], Integer.parseInt(in[2])));
            sum+=Integer.parseInt(in[2]);

        }
        System.out.println(sum);
    }
    public void cost(int priceToFixForDay)
    {
        int sum=0;
        Scanner sc2=new Scanner("injured.txt");
        try {
            FileInputStream in2 = new FileInputStream("injured.txt");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        while(sc2.hasNext())
        {
            String[] in=sc2.nextLine().split("\\s");
            brokendevices.add(new BrokenDevice(in[0], in[1], Integer.parseInt(in[2]), in[3], Integer.parseInt(in[4])));
            sum+=priceToFixForDay*Integer.parseInt(in[4]);

        }
        System.out.println(sum);
    }



}

