public class Queue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public Queue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue!");
            return;
        }
        rear++;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue!");
            return -1;
        }
        int data = arr[front];
        front++;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot peek!");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Element at front: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Element at front: " + queue.peek());
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Element at front: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Element at front: " + queue.peek());
    }
}
