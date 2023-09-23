import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.println("Enter No of Students: ");
        int size = input.nextInt();
        Student[] s = new Student[size];
        // Address[] arr;

        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
            s[i].setName(inputString.nextLine());
            s[i].setId(input.nextInt());
            System.out.println("Enter Number of Address Student have:");
            int n = input.nextInt();
            s[i].arr = new Address[n];
            for (int j = 0; j < s.length; j++) {
                System.out.println("Enter City and Country");
                s[i].arr[j] = new Address();
                s[i].arr[j].setCity(inputString.nextLine());
                s[i].arr[j].setCountry(inputString.nextLine());

            }

        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName());
            for (int j = 0; j < s.length; j++) {
                System.out.println(s[i].arr[j].getCity());

            }

        }

    }
}