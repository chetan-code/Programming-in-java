/**
 * Simple inheritance in a interface
 * An interface acts like a class
 * So we can do everything as we do with class(like inheritance) except objce t creation
 */

//main class
public class InterfaceInheritance
{
    public static void main(String args[]){
         // remeber we cant create instance of a interface
         //but we can create instance of a class that implements it..
         A a = new A();
         a.methodI1();
         a.methodI2();
         //also a has access to all the vars of the interface
         System.out.println("Im a varaible from interface x: " + a.x);
         System.out.println("Im a varaible from interface y: " + a.y);
    }
}

interface I1{
    //some vars
    double x = 4.44;
    void methodI1();
}

//an interface can inherit from other interface just like a class
interface I2 extends I1{
    double y = 2.22;//public static and final
    void methodI2();//public and abstarct by default
    
    //we need not to oveeride the method of I2 as it inherits , not implements I1
}


class A implements I2{//I2 has access to method and vars of I1 due to inheritance
    public int a = 4;
    
    //we need to implemts mwthod of I2 (as well as I1);
    public void methodI1(){ //<-- ovveriding methods of interface should always be PUBLIC
      System.out.println("Method I1");
    }
    
    public void methodI2(){//<-- methods from interface are Public
        System.out.println("MethodI2");
    }
    
}

