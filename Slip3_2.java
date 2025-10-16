import java.util.*;

public class Slip3_2
{
    // Inner Exception class (same file)
    static class CovidPositiveException extends Exception 
    {
        public CovidPositiveException() 
        {
            System.out.println("Patient is Covid Positive(+) and Need to Hospitalized");
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many patients you want to insert:");
        int n = sc.nextInt();

        // Arrays for patient data
        String[] name = new String[n];
        int[] age = new int[n];
        int[] oxylevel = new int[n];
        int[] HRCTreport = new int[n];

        // Input
        for(int j = 0; j < n; j++)
        {
            System.out.println("\nEnter Name:");
            name[j] = sc.next();

            System.out.println("Enter Age:");
            age[j] = sc.nextInt();

            System.out.println("Enter Oxygen level:");
            oxylevel[j] = sc.nextInt();

            System.out.println("Enter HRCT report:");
            HRCTreport[j] = sc.nextInt();
        }

        // Processing
        for(int j = 0; j < n; j++)
        {
            if(oxylevel[j] < 95 && HRCTreport[j] > 10)
            {
                try
                {
                    throw new CovidPositiveException();
                }
                catch(CovidPositiveException e)
                {
                    // Message already printed in exception constructor
                }
            }
            else
            {
                System.out.println("\nName: " + name[j]);
                System.out.println("Age: " + age[j]);
                System.out.println("Oxygen Level: " + oxylevel[j]);
                System.out.println("HRCT Report: " + HRCTreport[j]);
            }
        }
    }
}

