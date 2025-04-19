package LinkedList;

public class Main {
    public static void main(String[] args) {
        //SINGLY LINKED LIST
//        CustomLL list=new CustomLL();
//        list.insertAtFirst(10);
//        list.insertAtFirst(20);
//        list.insertAtFirst(30);
//        list.insertAtFirst(40);
//        list.display();
//        list.insertLast(50);
//        list.display();
//        list.insert(60,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.get(3)); //This will give the node of that index.
//        System.out.println(list.deleteLast());//Delete last node.
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//
        //DOUBLY LL
//        DoublyLL list=new DoublyLL();
//        list.insertFirst(10);
//        list.insertFirst(20);
//        list.insertFirst(30);
//        list.insertFirst(40);
//        list.insertLast(99);
//        list.insertafterVal(99,300);
//        list.display();

        //CLL
        CLL list=new CLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        list.delete(30);
        list.display();

    }

}
