
/**
 * Example of Fibonacci sequence generation 
 * Each number in the squence is sum of the last two numbers
 * @author - Chetan Sharma
 */
public class RecursiveFibonacci
{
    int n ;
    
    int fibonacci(int n){
        if(n == 0)//terimination condition for recursion
            return 0;
        else if (n == 1)
            return 1;
        else
            return(fibonacci(n - 1) + fibonacci(n -2));//recursion 
    }
    
    public static void main (String args[]){
        RecursiveFibonacci x = new RecursiveFibonacci();
        x.n = Integer.parseInt(args[0]);
        for(int i = 0; i <= x.n; i++){
            System.out.println(x.fibonacci(i));//print to nth fibonacci numbers
        }
    }
    
}
