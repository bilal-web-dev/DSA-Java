import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }
        // MAX element

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
                maxIndex = i;

            }

        }

        System.out.println(" Maximum Element is :" + max + " At Index: " + maxIndex);

        // Min Element
        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {

                min = arr[i];
                minIndex = i;
            }

        }

        System.out.println("Minimum Element is:" + min + " At index : " + minIndex);

    }
}