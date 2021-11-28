public class DoublyLinkedList{
	class Node{
	int data;
	Node previous;
	Node next;
	Node(int data){
	this.data=data;
	}
	}
public Node head=null;
public Node tail=null;
public void addNode(int data){
Node newnode=new Node(data);
if(head==null){
head=newnode;
tail=newnode;
head.previous=null;
tail.next=null;
}
else{
tail.next=newnode;
newnode.previous=tail;
tail=newnode;
tail.next=null;
}
}
public void display(){
if(head==null){
System.out.println("list is empty");
}
while(head!=null){
System.out.print(head.data+" ");
head=head.next;
}
}
public static void main(String[]args){
DoublyLinkedList sc=new DoublyLinkedList();
sc.addNode(1);
sc.addNode(2);
sc.addNode(3);
sc.addNode(4);
sc.addNode(5);
sc.display();
}
}
	
