  
/**
 * class that will implement the interface we created in other package (folder)
 */

import myInterface.*;//import statement for package

public class ClassImplementsMyInterface implements anInterface //<-- use of 'implements' keyword
{
 //since we are implemeting a interface we need to implement all its method
 public void display(){
            System.out.println("Fine! Interface is Implemented");
    }
 
 //main method   
 public static void main(String args[]){
       //creating object of this class
       ClassImplementsMyInterface Obj = new ClassImplementsMyInterface();
       Obj.display();//calling the method
       //we have access to methods and vars of interface
       System.out.println("The final value of var a in myInterface = " + a);
    }   
    
    
}
