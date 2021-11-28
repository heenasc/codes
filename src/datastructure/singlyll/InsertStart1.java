public class InsertStart{
	class Node{
	int data;
	Node next;
	Node(int data){
	this.data=data;
	this.next=null;
	}
	}
public Node head=null;
public Node tail=null;
public void insert(int data){
Node newnode=new Node(data);
if(head==null){
head=newnode;
tail=newnode;
}
else{
Node temp = head;  
head=newnode;
head.next=temp;
}
}
public void display(){
if(head==null){
System.out.println("list is empty");
}
while(head!=null){
System.out.println(head.data+" ");
head=head.next;
}
}
public static void main(String []args){
InsertStart sc=new InsertStart();
sc.insert(1);
sc.insert(2);
sc.insert(3);
sc.display();
}
}


	
