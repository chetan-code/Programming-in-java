/**
 * Here we attempt to create an object of interface
 * Interface just like an abstract class cant be instantiated 
 * We can declare its as a object but cant instantiate;
 */

public class AnObjectOfInterface
{
    public static void main(String args[]){
        //so lets try to create a normal object
        //SimpleInterface i = new SimpleInterface();
        //Result : Compiler Error - Interface is abstract cant be instantiated
        
        //simple declaration;
        SimpleInterface i;//possible as we are not instantiating it (not alloacting new memory)
        //Result : No errors!
        
        //An array of Interface
        SimpleInterface arrayOfInterface[] = new SimpleInterface[3];//possible
        //here we are not instatiating interface but are instantiating an array
        //Result : No errors!
        
    }
}
