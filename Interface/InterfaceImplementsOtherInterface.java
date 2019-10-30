/**
 * A normal class can implement an interface but an interface can't implement another interface
 *
 */


public interface InterfaceImplementsOtherInterface
{
    //any class can implement interface
}

//Interface
interface I1{
    int x = 555;//public static and final by defualt
    void method();//public and abstract by default
}

//The following code is not possible

//interface I2 implements I1{  // a inerface cant implement other interface
    //static final int j = 10;
    //void anotherMethod();
//}


