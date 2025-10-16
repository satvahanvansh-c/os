import java.util.*;

class College

{

   String cname, caddr;

   int cno;

   College(int cno, String cname, String caddr) 

 {

       this.cno=cno;  

	this.cname=cname;

	this.caddr=caddr;

 }

void display() 

 {

       System.out.println("College No: "+cno+"\nCollege Name: "+cname+"\nCollege Address: "+caddr);        

 }

}

class Department extends College

{

   String dname;

   int dno;

   Department(int cno, String cname, String caddr,int dno, String dname) 

 {

       super(cno,cname,caddr);

	this.dno=dno;  

	this.dname=dname;

	

 }

void display() 

 {

	super.display();

       System.out.println("Dept No: "+dno+"\nDepartment Name: "+dname);        

 }

}

 class Slip12_1

{

 public static void main( String args[] )

 {	

  	Scanner sc=new Scanner(System.in);

	System.out.println("Enter College Number ");

	int cno=sc.nextInt();

	System.out.println("Enter College Name");

	String cn=sc.next();

	System.out.println("Enter College Address ");

	String ca=sc.next();

	System.out.println("Enter Department Number ");

	int dno=sc.nextInt();

	System.out.println("Enter Department  Name");

	String dn=sc.next();

	Department d=new Department(cno,cn,ca,dno,dn);

	d.display();

 }  	

}
