import java.text.SimpleDateFormat;

import java.util.Date;

public class Slip13_2

{


    public static void main(String args[]) 

{

     

        // This is how to get today's date in Java

        Date today = new Date();

            

      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

       String date = df.format(today);

       System.out.println ("\nCurrent Date is : " + date);

     

  //Another Example of formatting Date in Java using SimpleDateFormat

        df = new SimpleDateFormat("MM-dd-yyyy");

        date = df.format(today);

        System.out.println("\nCurrent Date is : " + date);


             

     //formatting Date with time information

        df = new SimpleDateFormat("EEEEE d MMM yyyy");

        date = df.format(today);

        System.out.println("\nCurrent Date is : " + date);


 //If you print Date, you will get un formatted output

        System.out.println("\nCurrent Date and Time is: " + today);


        //formatting Date with time information

        df = new SimpleDateFormat("dd/MM/yy HH:mm:ss aaaZ");

        date = df.format(today);

        System.out.println("\nCurrent Date and Time is : " + date);

     

        //SimpleDateFormat example - Date with timezone information

        df = new SimpleDateFormat("HH:mm:SS");

        date = df.format(today);

        System.out.println("\nCurrent Time is : " + date);


     df = new SimpleDateFormat("w");

        date = df.format(today);

        System.out.println("\nCurrent week of year is : " + date);


df = new SimpleDateFormat("W");

        date = df.format(today);

        System.out.println("\nCurrent week of month : " + date);

 

df = new SimpleDateFormat("D");

        date = df.format(today);

        System.out.println("\nCurrent day of the year is : " + date);


df = new SimpleDateFormat("d");

        date = df.format(today);

        System.out.println("\nCurrent day of the month is : " + date);

    }

}
