public class SinglyLL {

    Node head;
    int size;

    class Node {

        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLL() {
        size = 0;
    }

    public void addAtStart(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtEnd(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        size++;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("Null");
        System.out.println();

    }

    public void deleteAtStart() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        head = head.next;
        size--;

    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node last = head.next;
        Node secondLast = head;
        while (last.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;

    }

    public int getSize() {
        System.out.println(size);
        return size;
    }

    public void deleteAtIndex(int index) {
        if (head == null || index >= size) {
            System.out.println("Invalid Index or The list is Empty");
            return;
        }

        if (index == 0) {
            deleteAtStart();
            size--;
            return;
        }

        int i = 0;
        Node node = head;
        while (i < index - 1) {
            node = node.next;
            i++;
        }
        node.next = node.next.next;
        size--;

    }

    public void insertAtIndex(int index, String data) {

        if (index > size) {
            System.out.println("Invalid Index");
            return;

        }

        if (index == 0) {
            addAtStart(data);
            return;
        }

        if (index == size) {
            addAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        int i = 0;
        Node node = head;
        while (i < index - 1) {
            node = node.next;
            i++;
        }
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.addAtStart("12");

        ll.addAtStart("13");

        ll.addAtEnd("11");
        ll.addAtEnd("75");
        ll.addAtEnd("19");

        ll.insertAtIndex(3, "74");

        ll.insertAtIndex(0, "0");

        ll.insertAtIndex(1, "454");

        ll.insertAtIndex(8, "54");
        ll.getSize();
        ll.traverse();

        // ll.insertAtIndex(9, "454");
        // ll.traverse();

        // ll.deleteAtIndex(2);
        // ll.traverse();

        // ll.deleteAtStart();
        // ll.traverse();
        //
        // ll.deleteAtEnd();
        // ll.traverse();
        // ll.getSize();
    }

}