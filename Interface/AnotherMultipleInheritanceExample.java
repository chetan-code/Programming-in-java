
/**
 * We can inherit from a normal class using (extends)
 * As well as implements an interface with it.
 * So we have acess to the super class well as interface vars and methods
 */

//main method
public class AnotherMultipleInheritanceExample
{
  public static void main (String args[]){
      //objects of classes
      A a = new A();
      a.interfaceMethod();
      a.printA();
  }
}

interface I{
    int i = 10;//static final and public by default
    void interfaceMethod();//abstract and public
} 

class SimpleClass{
    int y = 5;
    void methodSimpleClass(){
        System.out.println("Method of a Simple class");
    }
}

class A extends SimpleClass implements I{//ehere we extends from a class
    //as well as implemnetinh a interface --> MULTIPLE INHERITANCE
    public int a = 101010;
    
    //we nned to implement mwethod of interface
    public void interfaceMethod(){  
        System.out.println("interfacemethod() as called");
    }
    
    public void printA(){
        super.methodSimpleClass();//<- calling emthods in super class(Simple Class)
        interfaceMethod();
    }
    
}
