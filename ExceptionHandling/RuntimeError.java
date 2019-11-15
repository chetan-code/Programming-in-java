
/**
 * Runtime Error occur when the programming is running - its often due to
 * some wrong operation or some wrong input or some wromg conversion in program
 */

public class RuntimeError
{
    public static void main (String args[]){
         int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);
         
         int c = a/b;
         
         System.out.println("Value of c = " + c);        
    }
    
    /**
    Its runs with input 1 2
    Error - input - 10 20 30 
    Error - input - 40
    Error - input - 4.5 5
    */
}
