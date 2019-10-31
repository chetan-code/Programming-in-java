
/**
 * Another class that implemets shared constants interface
 * many classes can implemenst the interface to have access all interface
 * 
 */

import myInterface.SharedConstants;//import package

public class ClassBImplementsSharedConstants implements SharedConstants
{
    public static void main(String args[]){
        // wecan use the constant of interface here
        System.out.print("value of SOOn from interface : " + SOON);
    }
}
