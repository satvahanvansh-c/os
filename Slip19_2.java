import java.util.*;

public class Slip19_2

{

   public static void main(String[] args) 

	{

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter size of the matrix ");

	int r=sc.nextInt();

	int c=sc.nextInt();

      int[][] m = new int[r][c];

      int sum=0;

      System.out.println("Enter the matrix elements : ");

      for (int i = 0; i < r; i++) 

	{

         for (int j = 0; j < c; j++)

	  {

		m[i][j]=sc.nextInt();

		if(i==j)

		sum+=m[i][j];

	   }

	}

        System.out.println(" The sum of diagonal elements of the matrix is: " + sum);

   }   }
