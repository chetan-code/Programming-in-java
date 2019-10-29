
/**
 * An abstract class can have abtsract as well as non abtract methods
 * 
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
      System.out.println("Derived fun() was called");
    }
    
}

