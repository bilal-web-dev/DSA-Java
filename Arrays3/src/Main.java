import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);


        System.out.println("Enter Size of Array;");
        int size = input.nextInt();
        Course[] array = new Course[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Course();
            System.out.println("Enter Course Code:" );
            array[i].setcCode(inputString.nextLine());
            System.out.println("Enter Course Title: ");
            array[i].setcTitle(inputString.nextLine());
            System.out.println("Enter Course Credits: ");
            array[i].setCredits(input.nextInt());

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getcTitle());
            System.out.println(array[i].getcCode());
            System.out.println(array[i].getCredits());
        }


    }
}