package Upr_3;

public class Student extends Person {
    private String Fnum;

    public Student() {
        super();
        this.Fnum=" ";
    }
    public Student(String name,String egn,String Fnum) {
        super(name,egn);
        this.Fnum=Fnum;
    }
    public String getFnum() {
        return this.Fnum;
    }
    public void setFnum(String Fnum	) {
        this.Fnum=Fnum;

    }
    public static void sayHI() {
        System.out.println("Hello");
    }
    public void printFnum() {
        System.out.println(this.Fnum);
    }
}
