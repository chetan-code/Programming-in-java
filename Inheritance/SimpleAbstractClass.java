

/**
 * Example of a Simple abstract class.
 */

//this is the mian class
public class SimpleAbstractClass
{
    public static void main(String args[]){
        //Creating objects of a class
        //Base b = new Base(); //<-- we cant do this
        //IMPORTANT - WE CANT CREATE INSTANCE OF ABSTRACT CLASS 
        
        //we can have refernce of base type
        Base b = new Derived();//correct way 
        Derived d = new Derived();//also correct
        b.fun();
        d.fun();
    }
    
}

//An abstract class
abstract class Base{ //<-- use of "abstract" keyword 
    abstract void fun(); //<- we dont implement methods here we just declare/name them
    //this classes just act as a kind of template
    //we can declare abstract as well as non abstract methods
}


class Derived extends Base { //<-- this class derived from a abstract class
    //thus it has to implement/override methods specified in the abstract(base) class
    void fun(){
        //we here can write any code
        System.out.println("Derived fun() is called");
    }
}


