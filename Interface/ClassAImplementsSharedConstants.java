
/**
 * Here we are just explaing how many classes can implements an interface
 * to have access to all its variables
 * so we need not declare them in all classes one by one
 */

import myInterface.*;//we are importing all the classes of myInterface package
import java.util.*;

public class ClassAImplementsSharedConstants implements SharedConstants
{
    //we can havve many classes like this 
    
    
    public static void main(String args[]){
        
        //we can access all the memebers of interface here
        
        System.out.println("constant values of YES from interface : " + YES);
        System.out.println("constant values of NO from interface : " + NO);
    }
}
