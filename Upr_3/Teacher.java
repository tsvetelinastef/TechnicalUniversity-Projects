package Upr_3;

public class Teacher extends Person {
    // име на преподавател
    // име на дисциплина

    private Subject1 s;


    public Teacher(String name, String egn, Subject1 s) {
        super(name, egn);
        this.s = s;
    }

    public Subject1 getSubject1() {
        return this.s;
    }

    public void setSubject1(String s) {

        this.s.setSubject1(s);
    }

}
