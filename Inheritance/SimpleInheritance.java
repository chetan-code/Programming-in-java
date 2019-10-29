/* An example of simple inheritance */
//Jo baap k hai vo bete ka bhi hoga *T&K applied*

//please skip this class and read the next class first
class SimpleInheritance{
    public static void main (String args[]){
        
        //creating objects of class
        A superOb = new A();//<-- class A
        B subOb = new B();//<-- class B
        
        //super class can be used by itself --> just consider it as any other class
        superOb.i = 10;
        superOb.j = 20;//just assign any value!
        System.out.println("Contents of SuperOb :");
        superOb.showij();//simply executing its methods
        System.out.println();//line space
        
        // the subclass has access to all the members(methods/vars) of its super class//
        subOb.i = 7;// <-- a vars from superclass 
        subOb.j = 8;// <-- from superclass
        subOb.k = 9;
        System.out.println("Contents of subOb :");
        subOb.showij();//<-- we are using method of the superclass--> oh yeah inheritance
        subOb.showk();// <--- method of subclass
        System.out.println();
        System.out.println("Sum of i,j and k: " );
        subOb.sum();//here we using a method of subclass with vars declared in sub and super both!
        
    }
}


//Create a super class//Baap
class A {
    int i,j; //some variables
    
    void showij(){//a simple method that print vars
        System.out.println("i and j : " + i +" " + j);
    }
}

//create a subclass of the superclass --> Keyword used "extends" // Beta
class B extends A{
    int k;// a new var 
    
    void showk(){//a simple method that prints shit
        System.out.println("K : " + k);
    }
    
    void sum()
    {
        //Imp --> As you can see here the subclass can access/inherit vars of superclass
        System.out.print("i+j+k :" + (i +j + k));
    }
    
}


