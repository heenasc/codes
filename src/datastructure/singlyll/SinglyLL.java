package datastructure.singlyll;

public class SinglyLL {

    //Represent a node of the singly linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addNode(int data) {
        Node newNode=new Node(data);
        if (head == null) {
        head=newNode;
        tail=newNode;

        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while(head!=null){
                System.out.println(head.data+" ");
                head=head.next;
            }
            //System.out.println();
        }
    }

    public static void main(String[] args) {
        SinglyLL sc=new SinglyLL();
        sc.addNode(1);
        sc.addNode(2);
        sc.addNode(3);
        sc.addNode(4);
        sc.display();
    }
}