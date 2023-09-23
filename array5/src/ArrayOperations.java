public class ArrayOperations {
    private int[] array;
    private int size;

    // Constructor to create an array of given size
    public ArrayOperations(int size) {
        this.array = new int[size];
        this.size = array.length;
    }

    // Method to traverse the array and print all elements
    public void traverse() {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to insert an element at given index
    public void insert(int index, int element) {
        int count = 0;
        // Check if index is valid
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
            if (count == array.length) {
                System.out.println("The Array is Full");
                return;

            }

        }

        // Shift elements to the right to create space for new element

        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        // Insert new element at given index
        array[index] = element;
        System.out.println("Element " + element + " inserted at index " + index);
    }

    // Method to delete an element at given index
    public void delete(int index) {
        // Check if index is valid
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        // Shift elements to the left to remove element at given index
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        if (index == size - 1) {
            array[index] = 0;

        }

        System.out.println("Element at index " + index + " deleted");
    }

    // Method to search for an element by index
    public int searchByIndex(int index) {
        // Check if index is valid
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return -1;
        }
        return array[index];
    }

    // Method to search for an element by value
    public int searchByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        System.out.println("Element not found!");
        return -1;
    }

    // Method to update an element at given index
    public void update(int index, int element) {
        // Check if index is valid
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        array[index] = element;
        System.out.println("Element at index " + index + " updated to " + element);
    }

    public int length() {
        return array.length;
    }

    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(3);

        arr.insert(0, 10);
        arr.insert(1, 20);
        arr.insert(2, 30);

        arr.traverse();
        arr.delete(2);
        arr.traverse();
        arr.insert(1, 40);
        System.out.println("Element at index 2: " + arr.searchByIndex(2));
        System.out.println("Element 30 found at index: " + arr.searchByValue(30));
        arr.update(1, 50);
        arr.traverse();

    }
}
