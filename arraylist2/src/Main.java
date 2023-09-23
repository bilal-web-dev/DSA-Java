import java.util.*;
public class Main {


    public static void display(ArrayList<String> students){
        System.out.println(students);
    }

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Ali");
        students.add("Ahmad");
        students.add("Umer");
        students.add("Talha");

        display(students);
        System.out.println();

        students.add("Tooba");
        students.add("waleed");
        display(students);
        System.out.println();

        System.out.println(students.size());
        display(students);
        System.out.println();

        students.add(0, "hamza");
        students.add(1, "Rizwan");
        display(students);
        System.out.println();

        System.out.println("After Sorting");
        Collections.sort(students);
        display(students);
        System.out.println();

        students.remove("Tooba");
        students.remove(students.size() - 1);
        display(students);
        System.out.println();

        System.out.println(students.get(1));
        display(students);
        System.out.println();

        students.set(1, "Muhammad Waleed");
        display(students);
        System.out.println();

        students.remove(0);
        display(students);
        System.out.println();

        students.clear();
        display(students);
        System.out.println();




    }


}