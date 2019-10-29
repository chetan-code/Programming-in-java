/** 
 * Example of multilevel inheritance
 * SuperClass --> SubClass A--> Subclass B
 */

//this is main class please
public class MultilevelInheritance
{
        public static void main(String args[]){
        Box b1 = new Box(10,20,15);//super class
        BoxWeight b2 = new BoxWeight(2,3,4, 0.076);//subclass
        Shipment b3 = new Shipment(2,3,4, 0.076, 20);//subclass of a SUBCLASS
        
        double vol;
        vol = b1.volume();
        System.out.println("Volume of b1 :" + vol);
        //remember super class dont have the weight property
        System.out.println();
        
        vol = b2.volume();
        System.out.println("Volume of b2 :" + vol);
        //subclass also has weight
        System.out.println("Weight of b2 :" + b2.weight);
        System.out.println();
        
        
        vol = b3.volume();//it has access to all methods of superclass
        System.out.println("Volume of b3 :" + vol);
        //its has both weight and cost vars
        System.out.println("Weight of b3 :" + b3.weight);
        System.out.println("Cost of b3 :" + b3.cost);
    }
}

//lets declare a superclass
class Box{
    //some variables
    double width, height, depth;
    
    // a default constructor --> constructor help us intiate vars as we create an object
    Box(){ // a constructor name should be same as that of class --> Box 
        width = 0.0;// we are just assigning values to the var in construtor
        height = 0.0;
        depth = 0.0;
    }
    
    //Another constructor which will have some param/args
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    //a method > calculate volume
    double volume(){
        return width * height * depth;
    }
}

// here , boxweight(subclass) extended from box superclass to include another property weight.

class BoxWeight extends Box {
    //since it extends from box it will have access to all its members
    
    //var -> weight of box [+added property]
    double weight;
    
        // default constructor
    BoxWeight(){
        super();//<-- Calls the default constructor of superclass to set values of(w,h,d)
        weight = 0.0f;
    }
    
    //another constructor
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);//<-- calls overloaded constructor to set vlaues of w h d 
        //this saves us from individually assigning each values
        weight = m;
    }
}

///////Important////
//we will make another subclass(Shipment) which derives from a subclass(BoxWeight) of a superclass(Box)
class Shipment extends BoxWeight {
    double cost; //<-- we add another var
    
    //constructor when all params are sopecified
    Shipment(double w,double h,double d, double m, double c ){
        super(w,h,d,m);// call constructor of super class (boxweight)
        cost = c;
    }
    
}
