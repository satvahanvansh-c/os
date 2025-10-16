import java.util.Scanner;  

interface Slip9_2
{

}

public class Product implements Slip9_2  

{

static int cnt;  

int pid,qty;  

String pname;  

double pcost;  

public Product (int pid, String pname, double pcost, int qty)  

{  

cnt++;

this.pid = pid;  

this.pname = pname;  

this.pcost = pcost;

this.qty=qty;  

} 

public Product ()  

{ 

cnt++; 

this.pid = 0;  

this.pname = "";  

this.pcost = 0;

this.qty=0;  

} 

public String toString()   

{  

return pid+"\t"+pname+"\t"+pcost+"\t"+qty; 

}  

public static void main (String args[])    

{  

//reading values of the product from the user  

Scanner sc = new Scanner(System.in);  


System.out.println("Enter Total No. of Product");

                int n=sc.nextInt();

		Product[] p=new Product [n];

                 

	for(int i=0;i<n;i++)

	{

	   	System.out.print("Enter product ID: ");  

		int pid = sc.nextInt();  

		System.out.print("Enter product name: ");  

		String pname = sc.next();  

		System.out.print("Enter product Cost: ");  

		double pcost = sc.nextDouble();  

		System.out.print("Enter product Quantity: ");  

		int q = sc.nextInt(); 

		p[i]=new Product(pid, pname, pcost,q);

	}

	System.out.println("-------Product Detail--------");  

	System.out.println("Id	Name	Cost	Quantity"); 

	for(int i=0;i<n;i++)

		System.out.println(p[i]);

//invoking the method to print detail  

System.out.println("Total no. of. Product objects = "+Product.cnt);

}  

}  
