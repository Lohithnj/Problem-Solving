package LinkedList;

public class DoublyLL {
    private Node head;
    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node newnode=new Node(val);
        newnode.next=head;
        newnode.prev=null;
        if(head!=null)
        {
            head.prev=newnode;
        }
        head=newnode;
    }

    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last=temp;
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(last!=null)
        {
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("START ");
    }

    public void insertLast(int val){
        Node newnode=new Node(val);
        Node temp=head;
        //newnode.next=null;
        if(head==null)
        {
            head=newnode;
            newnode.prev=null;
            return ;
        }
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        newnode.prev=temp;
        temp.next=newnode;

    }
    public Node find(int value){
        Node temp=head;
        while(temp!=null)
        {
            if(temp.val==value)
            {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void  insertafterVal(int after,int val){
        Node p=find(after);
        if(p==null)
        {
            System.out.println("value not found");
            return;
        }
        Node newnode=new Node(val);
        newnode.next=p.next;
        p.next=newnode;
        newnode.prev=p;
        if(newnode.next!=null){
            newnode.next.prev=newnode;
        }
    }

}
