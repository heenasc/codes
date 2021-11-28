import java.util.*;
class listcollection{
public static void main(String[]args){
ArrayList<String> list=new ArrayList<String>();
list.add("heena");
list.add("bharat");
list.add("heerat");
Iterator itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
LinkedList<String> al=new LinkedList<String>();
al.add("rajvi");
al.add("sanvi");
al.add("krish");
al.add("sudhama");
Iterator<String> itr1=al.iterator();
while(itr1.hasNext()){
System.out.println(itr1.next());
}
Vector<String> v=new Vector<String>();
v.add("aayushi");
v.add("amit");
v.add("ashish");
v.add("garima");
Iterator<String> itr2=v.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
