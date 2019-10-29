//Inheritance example : initialising through constructor//

//I declared main methods first >> skip and look at below class first
class RelationshipBetweenSubAndSuper{
    public static void main(String args[]){
       
        //creating objects of class
        //SubClass
        BoxWeight weightBox = new BoxWeight(2, 3, 4, 0.076);//using constructor of class
        //SuperClass
        Box plainBox = new Box();
        
        //operations on subclass
        double vol;
        vol = weightBox.volume();
        System.out.println("Volume of the weigtBox : " + vol);
        System.out.println("Weight of the weigtBox : " + weightBox.weight);
        System.out.println();
        
        /////////////IMPORTANT PART///////
        //assign boxWeight reference to the Box Reference
        plainBox = weightBox;//<-- Superclass obj = subclass object
        vol = plainBox.volume();//OK! volume defined in the superclass(Box)
        System.out.println("Volume of the box is : " + vol);
        //the superclass doesn't have a weight var so we cant have following
        //System.out.print("Weight of the box : " + plainBox.weight);//Error - var not defined
        
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
    
    //constructor
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;//<-- these three vars are from superclass --> Inheritance yeah!
        weight = m;
    }
}

