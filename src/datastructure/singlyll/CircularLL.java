public class CircularLL{
	class Node{
	int data;
	Node next;
	
	Node(int data){
	this.data=data;
	}
	}
public Node head=null;
public Node tail=null;
public void insert(int data){
Node newnode=new Node(data);
if(head==null){
head=newnode;
tail=newnode;
newnode.next=head;
}
else{
tail.next=newnode;
tail=newnode;
tail.next=head;
}
}
public void display(){
Node current=head;
if(head==null){
System.out.println("list is empty");
}
else{
	do{
	System.out.println(current.data+" ");
	current=current.next;
	}while(current!=head);
	}
}	
public static void main(String[]args){
CircularLL sc=new CircularLL();
sc.insert(1);
sc.insert(2);
sc.insert(3);
sc.insert(4);
sc.insert(5);
sc.insert(6);
sc.display();
}
}
	
	
	
	
		

