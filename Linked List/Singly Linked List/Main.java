public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 10; i > 0; i--) {
            list.insertFirst(i);
        }

        list.insert(12, 3);

        System.out.print("The list before deletion and after insertions : ");
        list.display();
        System.out.println("Value deleted from the head : " + list.deleteHead());
        System.out.println("Value delted from the end : " + list.deleteLast());
        System.out.println("Value delted at the given index from Linked list : "+list.delete(3));
        //list.insertLast(11); insert at last
        // list.insertFirst(8);
        // list.insertFirst(7);
        // list.insertFirst(6);
        // list.insertFirst(5);
        // list.insertFirst(4);
        // list.insertFirst(3);

        System.out.println("After deletions : " );
        list.display();
        
    }
}
