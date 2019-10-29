
/**
 * Final Class Inheritance example
 * If we declare a class final we can't inherit from it.//No Inheritance is possible
 * banjh class --> you cant extend from this class 
 * It provides strict restriction feature
 * we can use final keyword for class ,method and vars.
 */

//this is main class
public class FinalClassInheritance
{
    public static void main(String args[]){
        
        //we can create instance of a final class but we cant inherit from it
        Bike bike = new Bike();
        bike.run();
        
        //Honda honda = new Honda();//invalid code
        //honda.run();//invalid code 
    }
}

//A final class
final class Bike{ //<- use of 'final' keyword
    //any code here
    void run (){
        System.out.print("Run of Final class bike was called");
    }
}

//We cant inherit from a final class
//following code will give compiler error if uncommented

//class Honda extends Bike{
    //void run(){
        //System.out.println("Ruuning oh yeah!");
    //}
//}


