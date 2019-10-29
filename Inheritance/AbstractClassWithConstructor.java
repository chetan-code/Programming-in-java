
/**
 * AN example of a abstract class with its own constructor
 */

//this is main class
public class AbstractClassWithConstructor
{
    public static void main(String args[]){
        //remember we cant instatiate as an abstract class
        Derived d = new Derived();
        d.fun();
        
        //NOTE
        //the constructor of the base class will be called automatically
        //the constructor of the base class can be called by means of derived class only
        
    }
}

abstract class Base{ //use of abstract keyword
    
    //constructor
    Base(){//name should be same as the class
        System.out.println("Base constructor was called");
    }
    
    //abstract method
    abstract void fun();//we just declare methods without implementation
}

class Derived extends Base{
    //constructor
    Derived() {
        System.out.println("Derived constructor was called");
    }
    
    //we need to implement all methods of the abstract super class
    void fun() {
        System.out.println("Derived fun() is called");
    }
}
