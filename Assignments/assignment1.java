
package Assignments;

public class assignment1 {
    int data;
    assignment1 next;

    public assignment1(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    private assignment1 head;
    public LinkedList(){
        this.head=null;
    }

    //Insert at the start function
    public void insertAtStart(int data){
        assignment1 newNode=new assignment1(data);
        newNode.next=head;
        head =newNode;
    }
    //Delete at the start function
    public void deleteAtStart(){
        if (head!= null){
            head= head.next;
        } else {
            System.out.println("Empty list");
        }
    }
    //Display the whole linked list function
    public void display(){
        if (head==null){
            System.out.println("empty list");
            return;
        }
        assignment1 current=head;
        while (current!=null){
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("null");
    }

    //delete at the end
    public void deleteAtEnd(){
        if (head==null){
            System.out.println("List is empty.");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        assignment1 current=head;
        while (current.next.next!=null){
            current=current.next;
        }
        current.next=null;
    }
    //insert at the end
    public void insertAtEnd(int data){
        assignment1 newNode=new assignment1(data);
        if (head==null){
            head=newNode;
            return;
        }
        assignment1 current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    //total size of list
    public int size(){
        int count=0;
        assignment1 current=head;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    //Calling all the function in below MAIN method
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertAtStart(3);
        list.insertAtStart(6);
        list.insertAtStart(9);

        System.out.println("inserting elements at start:");
        list.display(); //displaying list

//inserting elements at end
        list.insertAtEnd(12);
        list.insertAtEnd(15);
        System.out.println("inserting at end:");
        list.display();

//deleting elements at start
        list.deleteAtStart();
        System.out.println("list after deleting at start:");
        list.display();

//deleting elements at end
        list.deleteAtEnd();
        System.out.println("deleting at end:");
        list.display();
//size of list
        System.out.println("size of list: " + list.size());
    }
}
