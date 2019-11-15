
/**
 * inally block is a block that is used to execute important code 
 * such as closing connection, stream etc. 
 * Java finally block is always executed
 * whether exception is handled or not. 
 * Java finally block follows try or catch block.
 * IMORTANT- The statements present in the finally block execute even 
 * if the try block contains control transfer statements 
 * like return, break or continue.
 * 
 */
public class TryCatchFinally
{
    public static void main(String args[]){
    
         try{  
	 int num=121/0;  
	 System.out.println(num);  
      }  
      catch(ArithmeticException e){
         System.out.println("Number should not be divided by zero");
      }  
      /* Finally block will always execute
       * even if there is no exception in try block
       */
      finally{
	 System.out.println("This is finally block");
      }  
      System.out.println("Out of try-catch-finally");  
    
    }
}
