public class InsertEnd{
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
tail.next=newnode;
tail=newnode;
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
InsertEnd sc=new InsertEnd();
sc.insert(1);
sc.insert(2);
sc.insert(3);
sc.insert(4);
sc.insert(5);
sc.insert(6);
sc.display();
}

