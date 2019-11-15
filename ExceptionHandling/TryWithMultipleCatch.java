
/**
 * We can have multiple Catch statement for handling each kind of exception
 * that may occur
 */
public class TryWithMultipleCatch
{
    
    public static void main(String args[]){
    try{
        int i = args.length;
        String myString[] = new String[i];
        if(myString[0].equals("Java")){
            System.out.println("First Word is Java");
        }        
    }
    catch(ArithmeticException e){//catching arithematic exception
        System.out.print("Arithematic Exception : " + e);
        //we can write code to handle exception here
    }
    catch(NullPointerException e){//what if null pointer occcur
      System.out.println("NullPointerException : " + e);
      //handle here
    }
    catch(ArrayIndexOutOfBoundsException e){//what if array exception occur
      System.out.print("Array Exception");
    }
   
}
}

