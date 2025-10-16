import java.util.*;

class Customer 

{

   String cname;

   int pno;

   Customer(String cname,int pno) 

 {       

	this.cname=cname;

	this.pno=pno;  

 }

void display() 

 {

       System.out.println("Customer Name: "+cname+"\nPhone No: "+pno);        

 }

}

class Depositor extends Customer 

{

   int accno , balance;

   Depositor(String cname,int pno,int accno, int  balance) 

 {

       	super(cname,pno);

	this.accno=accno;  

	this.balance=balance;

	

 }

void display() 

 {

	super.display();

       System.out.println("Account No : "+accno+"\nBalance: "+balance);        

 }

}

class Borrower extends Depositor

{

   int loanno, loanamt;

   Borrower(String cname,int pno,int accno, int  balance,int loanno, int loanamt) 

 {

       super(cname,pno, accno,balance);

	this.loanno=loanno ;  

	this.loanamt=loanamt;

	

 }

void display() 

 {

	super.display();

       System.out.println("Loan No  : "+loanno+"\nLoan amt: "+loanamt);        

 }

}


 class Slip17_1

{

 public static void main( String args[] )

 {	

  	Borrower acc=new Borrower("abc",123456789,5000,1000,2000,1000);

	acc.display();

 }  	

}
