package LAB3;

public class LinkedListOperation {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }}
    private Node head;

    LinkedListOperation(){
        this.head=null;
    }
    public void insertatstart(int data){
        if(head==null){head=new Node(data); return;}
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void insertatend(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        } temp.next=newNode;
    }

    public void deleteatstart(){
        head=head.next;
    }
    public void deleteatend(){
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void insertAtPosition(int data, int position){
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0; i<position-1; i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteAtPosition(int position){
        Node newNode=new Node(head.data);
        Node temp=head;
        for(int i=0; i<position-1; i++){
            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        temp.next=temp.next.next;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null\n");

    }


    public static void main(String[] args) {
        LinkedListOperation list=new LinkedListOperation();
        list.insertatstart(1);
        list.insertatstart(2);
        list.insertatend(3);
        list.insertatstart(4);
        list.insertatend(5);
        list.insertatend(6);
        list.insertAtPosition(9,3);
        list.deleteAtPosition(3);
        list.deleteatend();
        list.deleteatstart();

        list.print();


    }
}