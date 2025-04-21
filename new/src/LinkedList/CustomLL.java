package LinkedList;

public class CustomLL {
    private Node head;
    private Node tail;
    private int size;
    //default constructor if no paramatere passed.
    public CustomLL() {
        this.size=0;
    }

    //Node Class
    private class Node {
        private int val;
        private Node next;

        //If they give one parameter it takes this constructor
        public Node(int val) {
            this.val=val;
        }
        //If two then this.
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
    public int delete(int ind){
        if(ind==0)
            return deleteFirst();
        if(ind==size-1)
            return deleteLast();
        Node prev=get(ind-1);
        int val=prev.next.val;
        prev.next=prev.next.next;

         return val;
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
    public Node get(int ind){ //This function gives index and will return the node in that index.
        Node node=head;
        for(int i=0;i<ind;i++)
        {
            node=node.next;
        }
        return node;
    }

    public int deleteLast(){ //return the deleted val which is last
        if(size<=1)
            return deleteFirst();
        Node secondLast=get(size-2);
        int val=tail.val; //it store last node's val to be return.
        tail=secondLast;
        tail.next=null;

        return val;

    }
    public int deleteFirst()
    {
        int val=head.val;
        head=head.next;
        if(head==null)//if there is only one elementits pointing to head and tail
        {
            tail=null;
        }
        size--;
        return val;
    }
    public void insert(int val , int ind){
        if(ind==0)
        {
            insertAtFirst(val);
            return;
        }

        if(ind==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<ind;i++)
        {
            temp=temp.next;//This will stop before the index to be inserted .
        }
        Node node2=new Node(val , temp.next); //This will allocate new node with Val=given And node2.next will be temp.next node.
        temp.next=node2;
        size++;
    }

    public void insertLast(int val) {
        if(tail==null) {
            insertAtFirst(val);
            return;
        }
        Node node1=new Node(val);
        tail.next=node1;
        tail=node1;
        size++;
    }
    public void display() {

        Node temp = head;
        while (temp !=null)  {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertAtFirst(int val)
    {
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;

        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }



}

