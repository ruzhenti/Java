public class Program {
    public static void main(String[] args) {
        myList l = new myList();

        l.push(0, 1); 
        l.push(1, 2);
        l.push(2, 8);
        l.push(3, 64);
        l.push(4, 5);

        System.out.println("Original linkedList: ");
        l.printList();

        l.revertPrintList();
    }
}