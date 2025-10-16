import java.util.Scanner;

public class Slip4_1{

	public static void main(String[] args) 

	{

		int[][] twodm = {

				{10, 20, 30},

				{40, 50, 60}

		};

		System.out.print("Original Array:\n");

		print_array(twodm);

		int[][] newtwodm = new int[twodm[0].length][twodm.length];

		for (int i = 0; i < twodm.length; i++) 

			for (int j = 0; j < twodm[0].length; j++) 

				newtwodm[j][i] = twodm[i][j];

		System.out.println("After changing the rows and columns of the said array:");

		print_array(newtwodm);

	}

	static void print_array(int[][] twodm) 

	{

		for (int i = 0; i < twodm.length; i++) 

		{

			for (int j = 0; j < twodm[0].length; j++) 

			{

				System.out.print(twodm[i][j] + " ");

			}

			System.out.println();

		}

	

	}

}



