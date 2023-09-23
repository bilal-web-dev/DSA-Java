import java.util.*;

public class Main {

    public static void display(Student s) {
        System.out.print(s.getName() + "  ");
        System.out.print(s.getId() + "  ");
        System.out.print(s.getCgpa() + "  ");
        System.out.println();

    }

    public static void main(String[] args) {

        Student s1 = new Student("Maha", "FA20-bcs-000");
        Student s2 = new Student("F", "JJJJJ");
        Student s3 = new Student("HHHH", "LLLLLL");
        s1.setCgpa(1.9);
        // display(s1);
        s2.setCgpa(2.0);
        // display(s2);
        s3.setCgpa(2.3);
        // display(s3);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(new Student("Talha", "FA20-bcs-057"));
        list.add(new Student("ALi", "Sp12"));

        list.add(0, new Student("Bilal", "Sp23"));
        list.add(list.size() - 1, new Student("Rabia", "FA213"));

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            display(list.get(i));

        }

    }

}
