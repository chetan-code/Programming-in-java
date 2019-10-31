//Main method
public class VarsAndMethodsOfInterface
{
    public static void main (String args[]){
        //creating objects of class
        A a = new A();
        a.method2();
        a.anotherMethod();
    }
}

//creating a simple interface
interface I{
    public static final double PI = 3.1413434567;//correct
    static final double lambda = 0.04;
    //all vars are public static and final by default - even if u mention it or not
    int x = 100;//correct
    //int y; //declaration of an Instance variable NOT ALLOWED! We need to allocate memory!
    //private static final int p = 444;//private NOT ALLOWED - public by default;
    
    //public static void method1();//static methods are not allowed without body(cant override)
    //public final static void finalMethod();//a method cant be final! Error!
    
    void method2();//public and abstract by default
        
} 


//Class that implements interface I
class A implements I{
    public int a1;
    //we need to ovveride abstract method of interface
    public void method2(){
        System.out.println("method2 of ClassA");
    }
    
    //we can have other methods
    public void anotherMethod(){
        System.out.print("anothermethod of classA was called");
    }
}



