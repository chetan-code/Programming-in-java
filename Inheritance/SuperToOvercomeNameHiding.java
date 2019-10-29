
//Example of super to overcome name hiding

public class SuperToOvercomeNameHiding
{
    public static void main(String args[]){
        //Creating objecst of the class
        B subOb = new B(1, 2);
        subOb.show();
    }
}

class A {
    int i;
}

class B extends A {
    //the problem arises due to same name of variables in sub and super class
    
    int i ; //this i hides the i in the superclass A;
    
    //constructor
    B(int a, int b){
        super.i = a; //here we use super to refer the i(variable) of the superclass A
        i = b; //i of Subclass B;
    }
    
    void show(){
        System.out.println("i in the Superclass A :" + super.i);
        System.out.println("i in the Subclass B :" + i);
    }
}


