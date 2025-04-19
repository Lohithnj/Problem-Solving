package LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head=null;
        this.tail=null;
    }

    public void insert(int val){
        Node newnode=new Node(val);
        if(head== null)
        {
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.next=head;
        tail=newnode;
    }

    public void display(){
        Node temp=head;
        if(temp!=null)
        {
            do{
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            while(temp!=head);
        }
        System.out.println("HEAD");
    }

    public void delete(int value){
        Node temp=head;
        if(head==null)
            return ;
        if(temp.val==value)
        {
            head=head.next;
            tail.next=head;
            return ;
        }
        do{
            Node n=temp.next;
            if(n.val==value){
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }while(temp!=head);
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
