public class myList {
    Node head;
    Node tail;

    private class Node {
        int value;
        Node next;
        Node prev;
    }

    public Node push(int pos, int value) {
        Node node = new Node();
        node.value = value;

        if (pos == 0) {
            if (head != null) {
                node.next = head;
                head.prev = node;
            } else {
                tail = node;
            }
            head = node;
            return node;
        }

        Node current = head;
        int index = 0;
        if (current == null) {
            head = node;
        } else {
            while (current != null && index < pos - 1) {
                current = current.next;
                index++;
            }
            Node next = current.next;
            if (next != null)
                next.prev = node;
            else
                tail = node;
            current.next = node;
            node.next = next;
            node.prev = current;
        }
        return node;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.printf("%d ", current.value);
            System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public void revertPrintList() {
        Node current = tail;
        System.out.println("Reverted linkedList: ");
        while (current != null) {
            System.out.printf("%d ", current.value);
            System.out.print(" -> ");
            current = current.prev;
        }
        System.out.println();
    }
}