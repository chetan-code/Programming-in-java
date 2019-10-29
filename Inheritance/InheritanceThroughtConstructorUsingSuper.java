
public class InheritanceThroughtConstructorUsingSuper
{
    public static void main(String args[]){
        Box b1 = new Box(10,20,15);
        BoxWeight b2 = new BoxWeight(2,3,4, 0.076);
        
        double vol;
        vol = b1.volume();
        System.out.println("Volume of b1 :" + vol);
        //remeber super class dont have the weight property
        System.out.println();
        
        vol = b2.volume();
        System.out.println("Volume of b2 :" + vol);
        //subclass also has weight
        System.out.println("Weight of b2 :" + b2.weight);
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
