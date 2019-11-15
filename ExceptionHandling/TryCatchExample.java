/**
 * Try and catch help us handle exception better
 * we try to handle as many exception we can
 */

public class TryCatchExample
{
    
    static int anyFunction(int x, int y){
        try{
            int a = x/y; //<-- this operation can create exceptions
            return a;    //such as what if is divided by zero;
        }
        catch(ArithmeticException e){ //<-- catching the exception that may occur
            System.out.print("Division by zero not allowed");//<-- message for user
        }
        //this code will run even after exception occured
        return 0; //<-- the method must have a return value;
    }
    
    
    public static void main(String args[]){
        int a,b , result;
        a = 0;
        b = 0;
        try{
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            //but what if the input we provide is not INTEGER/or we have 3 inputs
        }catch(Exception e){//<-- catching all exception that may occur
                System.out.println(e);
        }
        //this code will run even after exception occurs
        result = anyFunction(a,b);
        System.out.print("result of a + b ; " + result);
    }
}
