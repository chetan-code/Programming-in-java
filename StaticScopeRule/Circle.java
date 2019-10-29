//Example of static variables and static methods
public class Circle{
    //only single instance of this variable will be maintained 
    //Irrespective of the number of objects created from it.(static keyword)
    static int circlecount = 0; //class variable
    //Every new object will have a new instance of this object
    public double x,y,r;//instance variable
    public Circle (double x, double y, double r){//constructor
        this.x = x; this.y = y; this.r = r;
    }
    
    public Circle (double r){
       this(0.0,0.0,r);//calling the first/main constructor
       circlecount ++;
    }
    
    public Circle (Circle c){
        this(c.x,c.y,c.r);
        circlecount ++;
    }
    
    public Circle(){
        this(0.0, 0.0, 0.1);//we can have multiple constructor with diff param
        circlecount++;
    }
    
    //instance method
    public double circumference() {
        return (2 * 3.14159 * r);
    }
    //instance method
    public double area(){
     return (3.14159 * r * r);
    }
    //instance method --> return bigger of 2 circles
    public Circle bigger (Circle c){
        if(c.r > r) return c;
        else return this;
    }
    //A Class method : return the bigger of two classes
    public static Circle bigger (Circle a, Circle b){
        if (a.r > b.r) return a;
        else return b;
    }
    
    public static void main (String args[]){
        //Resultls of static vraiables 
        Circle c1 = new Circle();
        System.out.println("C1# " + c1.circlecount);
        
        Circle c2 = new Circle(5.0);
        System.out.println("C2# " + c2.circlecount);
        
        Circle c3 = new Circle();
        System.out.println("C3# " + c3.circlecount);
        
        System.out.println("Total number of circles :" + c1.circlecount);
        
        
        //Result of staic methods and how to call them
        Circle a = new Circle (2.0);
        Circle b = new Circle(3.0);
        //clalling a instance method
        Circle c = a.bigger (b);//c = the bigger cicle between a and b
        //calling a class method
        Circle d = Circle.bigger (a,b);// d = the bigger cicle between a and b
        
        System.out.println("Area of circle c(instance method) : " + c.area());
        System.out.println("Area of circle d(class method) : " + d.area());
    
    }

}


