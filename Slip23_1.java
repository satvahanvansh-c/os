class MyNumber

{

private int no;

MyNumber()

{

no=5;

}

MyNumber(int no)

{

this.no=no;

}

public void isNegative()

{

if(no<0)

System.out.println("Given number is negative");

}

public void isPositive()

{

if(no>0)

System.out.println("Given number is Positive");

}

public void isZero()

{

if(no==0)

System.out.println("Given number is Zero");

}

public void isOdd()

{

if(no%2!=0)

System.out.println("Given number is Odd");

}

public void isEven()

{

if(no%2==0)

System.out.println("Given      is Even");

}

 public static void main(String args[]) 

{

MyNumber n1=new MyNumber();

System.out.println(n1.no+" Details");

n1.isNegative();

n1.isPositive();

n1.isZero();

n1.isOdd();

n1.isEven();

int n=Integer.parseInt(args[0]);


MyNumber n2=new MyNumber(n);

System.out.println(n2.no+" Details");

n2.isNegative();

n2.isPositive();

n2.isZero();

n2.isOdd();

n2.isEven();    

}

}
