/* use of break in a loop */
class BreakInLoop{
    
    public static void main (String args[]){
        for (int i = 1;  ; i++)//no termination condition in loop
        {
            if(i%10 == 0) break;//terminate the loop
            System.out.println("i : " + i);
        }
        System.out.println("Loop completed");
     
    }

}
