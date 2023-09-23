import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.println("Enter no of rows:");
        int rows = input.nextInt();
        System.out.println("Enter no of columns:");
        int cols = input.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                numbers[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number to find");
        int x = input.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x)
                    System.out.println("X found at: " + i + "*" + j);
            }
        }

        /*
         * System.out.println("Enter Size of the Array");
         * int size = input.nextInt();
         * 
         * int[] numbers = new int[size];
         * 
         * 
         * for (int i=0; i <numbers.length; i++){
         * System.out.println("Enter numbers in array");
         * numbers[i] = input.nextInt();
         * 
         * }
         * 
         * for (int i = 0; i < numbers.length; i++){
         * System.out.println("Number" + (i+1) + "is:"+ numbers[i]);
         * 
         * 
         * }
         * 
         * System.out.println("Enter the number you want to find: ");
         * int x = input.nextInt();
         * 
         * // binary search
         * for (int i = 0; i < numbers.length; i++){
         * if (numbers[i] == x){
         * System.out.println("X found at index " + i);
         * }
         * 
         * }
         */

        // Student Class Object and printing
        /*
         * Scanner input = new Scanner(System.in);
         * Scanner inputString = new Scanner(System.in);
         * 
         * Student s = new Student();
         * System.out.println("Enter your id:");
         * s.setId(input.nextInt());
         * 
         * System.out.println("Enter your Name:");
         * s.setName(inputString.nextLine());
         * 
         * System.out.println(s.getName());
         * System.out.println(s.getId());
         */

    }

}