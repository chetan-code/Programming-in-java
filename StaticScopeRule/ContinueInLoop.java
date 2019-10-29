/* example of use of continue in a loop */
class ContinueInLoop{

    public static void main (String args[]){
        for(int i = 0; i < 10; i++){
         System.out.print(i + " ");
         if(i%2 == 0) continue;
         //continue will result in next iteration of loop
         //so the code below wont be execcuted
         System.out.println(" ");
        }
    }

}