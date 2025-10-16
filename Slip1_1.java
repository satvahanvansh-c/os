import java.util.Scanner;

public class Slip1_1

{

    public static void main (String[] args)

    {

            int n=Integer.parseInt(args[0]);

            boolean[] isPrime=new boolean[n];

            int[] ar = new int [n];

            Scanner in = new Scanner (System.in);

            System.out.println("Enter the "+n+" elements of the array: ");

            for(int i=0; i<n; i++)

                ar[i] = in.nextInt();

            for(int i=0; i<ar.length; i++)

    	        isPrime[i] = true;

            for(int k=0;k<n;k++)

            {

                for (int j=2; j<ar[k]; j++)  

                if(ar[k]%j==0)

	        {

                isPrime[k] = false;

                break;

            }

    }

for(int k=0;k<n;k++)

if(isPrime[k])

            System.out.print(ar[k]+" ");

 System.out.print(" are the prime numbers from the array ");

}

}
