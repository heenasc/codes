package polymorphisms.staticoverloading;
//This example is in method overriding but there was no upcasting.
//same method different implementation is called method overloading
//overloading happens in same class
public class Main {
    public static void main(String args[]){
        Rectangle s=new Rectangle();
        s.draw();
        Circle sc=new Circle();
        sc.draw();
        Triangle scs=new Triangle();
        scs.draw();
    }
}
