

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}



public class LinkedList {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }


    public static void printList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public void result(){

        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(1);
        llist.insertNode(2);
        llist.insertNode(3);
        printList(llist.head);



        SinglyLinkedListNode reversed = reverse(llist.head);

        System.out.println("\nReversed List:");
        printList(reversed);
    }
}




