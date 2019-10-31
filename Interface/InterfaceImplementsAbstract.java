/**
 * A class can implement interface 
 * but and interface can't implement any class (its invalid)
 */
//main class
public class InterfaceImplementsAbstract
{
    public static void main(String args[]){
     //// some code
    }
}

abstract class C{
    public static int j = 111;
    void print (){
        System.out.print("Geek1");
    }
}

//the following code is invalid --> an interface cant implement other class or interface

//interface I implements C{
    //public static int j = 222;
    //void print(){
        //System.out.print("this is invalid!");
    //}
//}
