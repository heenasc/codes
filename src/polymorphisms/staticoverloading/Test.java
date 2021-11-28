package polymorphisms.staticoverloading;
//same method name with different parameter known as method overloading
//java identify by method signature
public class Test {
    public void sum(int a,int b){
        int result=a+b;
        System.out.println("int result is "+result);
    }
    public void sum(float a,float b){
        float result=a+b;
        System.out.println("float result is "+result);
    }
    public void sum(double a,double b){
        double result=a+b;
        System.out.println("double result is "+result);
    }
    public void sum(long a,long b){
        long result=a+b;
        System.out.println("long result is "+result);
    }

    public static void main(String[] args) {
        Test sc=new Test();
        sc.sum(10,20);
        sc.sum(2.5,2.5);
    }
}
