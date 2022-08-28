package Upr_3;

public class test {
    public static void main(String[] args) {

        Person p = new Person("Ivan", "01...");
        // new - заделя се памет в Heep- а за отделен обект

        p.setName("Tsvety");
        System.out.println(p.getName());

        Student.sayHI();
        Student stu = new Student("Mark", "01", "123456789");
        stu.printFnum();

        Subject1 sub1 = new Subject1("Math1");
        Subject1 sub2 = new Subject1("Math2");
        Subject1 sub3 = new Subject1("OIP3");
        Subject1 sub4 = new Subject1("OIP4");
        Subject1 sub5 = new Subject1("OIP5");

        Teacher t1 = new Teacher("Filip1", "101", sub1);
        Teacher t2 = new Teacher("Filip2", "102", sub2);
        Teacher t3 = new Teacher("Filip3", "103", sub3);
        Teacher t4 = new Teacher("Filip4", "104", sub4);
        Teacher t5 = new Teacher("Filip5", "105", sub5);

        System.out.println(sub1.getSubject1());
        System.out.println(sub2.getSubject1());

        Teacher[] arr = new Teacher[]{t1, t2, t3, t4, t5};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s -> %s %n", arr[i].getName(), arr[i].getSubject1().getSubject1());
        }


    }
}
