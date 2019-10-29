  
/**
 * An example of an abstract class with final method
 * if a method declare final we cant ovveride that method
 * final methods are declared an implmented only once --> no change possible
 */

//this is main class
public class FinalMethod
{
    public static void main (String args[]){
        //creating objects of class
        Base b = new Derived();
        b.fun();//calling final method
    }
}

//an abstract class with final method
abstract class Base{
    //a final method
    final void fun() {
      System.out.println("Final fun() is called");//its cant be ovverriden 
    }
}

//a derived class or subclass
class Derived extends Base{
    //here we cant ovveride fun method like
    //void fun (){//code here} since its final
}


