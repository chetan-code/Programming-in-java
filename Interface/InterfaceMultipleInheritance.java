
/**
 * Using interface for Multiple Inheritance
 * Here we can implements more than one interface in a class
 */
//main class
class InterfaceMultipleInheritance{
    //main method
    public static void main(String args[]){
        //creating objects of clas that implemnts interface
        A a = new A();
        a.printI1();
        a.printI2();
        //we can also print vars of interface here
    }
}


//Interfaces
interface I1{
 //vars
 int x = 5;
 //methods
 void printI1();
}

interface I2{
    //vars
    int y = 10;
    //methods
    void printI2();
}

//we create a class it can implements many interfaces sepercated by comma(,);
class A implements I1,I2{ //<-- we have achievemed multiple inhertance)
    //vars of this class
    int a = 10;
    //we need to implement methods of I1 and I2
    public void printI1(){//<-- methods from interface are awlays public
        System.out.println("printI1() was called");
    }
    
        public void printI2(){//<-- methods from interface are awlays public
        System.out.println("printI2() was called");
    }
    
    //also we have access to all vars of interface
    
}

