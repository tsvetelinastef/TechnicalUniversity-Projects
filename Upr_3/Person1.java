package Upr_3;

public class Person1 {
    private String name;
    private String egn;

    public Person1() {
        this.name="";
        this.egn="";
    }

    public Person1(String name,String egn) {
        this.name=name;
        this.egn=egn;
    }

    public String getName() {
        return this.name;
    }

    public  void setName(String name) {
        this.name=name;
    }
    public String getEgn() {
        return egn;
    }

    public void setEgn() {
        this.egn=egn;
    }

}
