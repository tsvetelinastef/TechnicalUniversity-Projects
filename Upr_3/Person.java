package Upr_3;

public class Person {

    private String name;
    private String egn;

    public Person() {  // името му трябва да е = на името на класа
        this.name = " ";
        this.egn = " ";
    }

    public Person(String name, String egn) {  // променливи, конструктор с параметри
        this.name = name;
        this.egn = egn;
    }

    public String getName() { return  this.name; }

    public  void setName(String name) { this.name = name; }

    public  String getEgn() { return  this.egn; }

// аксесори и мутатори

    public  void setEgn(String egn) { this.egn = egn; }
}
