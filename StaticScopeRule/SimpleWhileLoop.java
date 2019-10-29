//demonstatrating simple while loop
class SimpleWhileLoop{
    public static void main (String args[]){
        System.out.println("Printing first 10 odd numbers");
        int i = 1;
        while (i < 11){
           System.out.print(" " + ((2*i) - 1));
           i++;
        }
    }
}