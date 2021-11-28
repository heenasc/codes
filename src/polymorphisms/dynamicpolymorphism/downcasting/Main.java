package polymorphisms.dynamicpolymorphism.downcasting;
//same method signature but different implementation is called method overriding
//overriding haens in different class
public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        Tata tata = new Tata();
        tesla.StartEngine();
        tata.StartEngine();
    }
}
