public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    public void deleteAtStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            currentNode.next = head;
            tail = currentNode;
        }
        size--;
    }

    public void insertAtIndex(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
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
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            deleteAtStart();
            return;
        }
        if (index == size - 1) {
            deleteAtEnd();
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        size--;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        System.out.print(currentNode.data + "->");
        currentNode = currentNode.next;
        while (currentNode != head) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void reversePrintList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = tail;
        do {
            System.out.print(currentNode.data + " ");
            currentNode = getPreviousNode(currentNode);
        } while (currentNode != tail);
        System.out.println();
    }

    private Node getPreviousNode(Node node) {
        Node currentNode = head;
        while (currentNode.next != node) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }





    public static void main(String[] args) {
        CircularLinkedList ll = new CircularLinkedList();

        ll.insertAtStart(10);
        ll.printList();

        ll.insertAtEnd(12);
        ll.printList();

        ll.insertAtIndex(14, 1);
        ll.printList();
        ll.reversePrintList();

        ll.deleteAtEnd();
        ll.printList();

        ll.deleteAtStart();
        ll.printList();

        ll.insertAtIndex(15, 1);
        ll.printList();

        ll.deleteAtIndex(1);
        ll.printList();



    }




}