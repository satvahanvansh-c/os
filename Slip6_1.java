class Employee

{  

 int Empid,Empsal;

 String Empname,Empdesg;  

 

  Employee(int Empid,String Empname,String Empdesg,int Empsal){  

 this.Empid=Empid;  

 this.Empname=Empname;  

 this.Empdesg=Empdesg;

  this.Empsal=Empsal;

 }  

 public String toString()

{

 return Empid+"\t "+Empname+"\t "+Empdesg+"\t "+Empsal;    

  } 

}  

class Slip6_1

{

public static void main(String args[])

{  

   Employee s1=new Employee(101,"abc","Manager",20000);  

   Employee s2=new Employee(102,"def","Fitter",12000);  

    System.out.println("Roll No	  Name	Designation	Salary");   

   System.out.println(s1);

   System.out.println(s2); 

}  }
