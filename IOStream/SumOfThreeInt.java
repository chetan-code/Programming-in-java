 import java.io.*;
 
 class SumOfThreeInt
 {
    public static void main (String args[]){
    
        int x = 0;
        int y = 0;
        int z = 0;
        
        //IO
        try{
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        
        System.out.print("x : ");
        System.out.flush();
        tempString = in.readLine();//reading input as a string
        x = Integer.parseInt(tempString);
        
        System.out.print("y : ");
        System.out.flush();
        tempString = in.readLine();//reading input as a string
        y = Integer.parseInt(tempString);
        
        System.out.print("z : ");
        System.out.flush();
        tempString = in.readLine();//reading input as a string
        z = Integer.parseInt(tempString);

    }catch (IOException e){
         System.out.print(e);
    }
        //Input over : calculate the Interest
        int sum = x + y + z;
        System.out.print(sum);
    
    }

    
    }