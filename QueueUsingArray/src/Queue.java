public class Queue {
    static int arr[];
    static int size;
    static int front = -1;
    static int rear = -1;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    public static boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public static boolean isFull() {
        return (rear + 1) % size == front;
    }

    public static void add(int data) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        // if it's the 1st element
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        int res = arr[front];

        // if only 1 element is present
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return res;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        return arr[front];
    }
}
