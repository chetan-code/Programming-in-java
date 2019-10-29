 import java.io.*;
 
 class InterestCalculator
 {
    public static void main (String args[]){
    
        Float principalAmount = new Float(0);
        Float rateOfInterest = new Float (0);
        Float numberOfYears = new Float (0);
        
        //IO
        try{
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        
        System.out.print("Enter Principal Amount : ");
        System.out.flush();
        tempString = in.readLine();//reading input as a string
        principalAmount = Float.valueOf(tempString);
        
        System.out.print("Enter Rate of Interest : ");
        System.out.flush();
        tempString = in.readLine();//reading input as a string
        rateOfInterest = Float.valueOf(tempString);
        
        System.out.print("Enter Number of Years : ");
        System.out.flush();
        tempString = in.readLine();//reading input as a string
        numberOfYears = Float.valueOf(tempString);
    }catch (Exception e){
         System.out.print(e);
    }
        //Input over : calculate the Interest
        Float interestTotal = principalAmount * rateOfInterest* numberOfYears;
        System.out.print("Total Interest = " + interestTotal);
    
    }

    
    }