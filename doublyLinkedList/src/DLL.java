public class DLL{

    private Node head;
    private Node tail;
    private int size;

private class Node {
    private int data;
    private Node prev;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}

    public DLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void deleteAtStart() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void deleteAtEnd() {
        if (tail == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void printListReverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.prev;
        }
        System.out.println("Null");
    }

    public void insertAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            insertAtStart(data);
            return;
        }
        if (index == size) {
            insertAtEnd(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.prev = current;
        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            deleteAtStart();
            return;
        }
        if (index == size - 1) {
            deleteAtEnd();
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    public static void main(String[] args) {
        DLL dll = new DLL();



        dll.insertAtStart(1);
        dll.insertAtStart(2);
        dll.insertAtStart(3);
        dll.insertAtStart(4);
        dll.insertAtEnd(0);
        dll.printList();

        dll.insertAtIndex(2, 40);
        dll.printList();

        dll.deleteAtEnd();
        dll.printList();

        dll.deleteAtIndex(2);
        dll.printList();


        dll.insertAtEnd(10);
        dll.printList();





    }

}







