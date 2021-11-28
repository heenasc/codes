package polymorphisms.dynamicpolymorphism.upcasting;
//upcasting
//here all class are object
//reference of parent class refers to object of child class is called upcasting
//if m using reference of parent class then extra methods of child class can not accesible
class Splendor extends Bike{
    void run(){
        System.out.println("running safely with 60km");
    }
    void jump(){

        System.out.println("i am jumping");
    }
    public static void main(String args[]){
        Bike b = new Splendor();//upcasting  "child obj use reference of parent"
        b.run();
        // b.jump();//it saws me error because m using object of parent class so extra method of child not accesible
        Splendor sc=new Splendor();
        sc.jump();//it will run properly with child class object
        sc.run(); //i also can call by child class obj but its not upcasting

    }
}



