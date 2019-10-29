
/**
 * Example of factorial calculation using recursion
 * Recursion is a process in which a method calls itself constinuosly
 * @author - Chetan Sharma
 */

public class RecursiveFactorial{
    int n;
    int factorial(int n) {
        if(n == 0){//terminal condition for recursion
            return (1);
        }
        else 
            return (n * factorial(n-1));
    }   
    
    public static void main (String args[]){
        RecursiveFactorial x = new RecursiveFactorial();
        x.n = Integer.parseInt(args[0]);
        System.out.print("Factorial of " + x.n + " : " + x.factorial(x.n));
    }
}
