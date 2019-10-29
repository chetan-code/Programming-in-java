
/**
 * An abstract class can have abstract as well as non abtract methods
 * It is not neccessary to implement non abstract methods in derived classes.
 */
public class AbstractClassWithNonAbstractMethod
{
    public static void main(String args[]){
        //instance of the derived object --> we cant have instance of base class (abstract)
        Derived d = new Derived();
        d.fun();
    }
}


//An abstract class with non abstract method
abstract class Base{
    
    //we can have a simple class(non-abstract) inside an asbtract class with its implementation
    void fun(){
        //code
        System.out.println("Base fun() is called");
    }
}

class Derived extends Base{
    //constructor
    Derived(){
        System.out.println("Derived constructor is called");
    }
    
    //NOTE - it is not neccessary to implement a non abstract method unlike abstract method
    //but if we do do - this method will override above fun() method
    //hence base fun() method wont be called.
    void fun(){
        //super.fun();//<-- we can use this to call the fun() of base class.
      System.out.println("Derived fun() was called");
    }
    
}

