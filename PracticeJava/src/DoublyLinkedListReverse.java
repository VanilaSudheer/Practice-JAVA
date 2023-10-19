
class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }
}


public class DoublyLinkedListReverse {

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        DoublyLinkedListNode current = llist;
        DoublyLinkedListNode temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            llist = current;
            current = current.prev;
        }

        return llist;
    }


    public static void printList(DoublyLinkedListNode node) {
    while (node != null) {
        System.out.print(node.data + " ");
        node = node.next;
    }
}
    public void result(){

    DoublyLinkedList llist = new DoublyLinkedList();
    llist.insertNode(5);
    llist.insertNode(6);
    llist.insertNode(7);
    printList(llist.head);



    DoublyLinkedListNode reversed = reverse(llist.head);

    System.out.println("\nReversed List:");
    printList(reversed);
}

}
