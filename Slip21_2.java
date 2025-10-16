class Employee

{

    int empid,salary;

    String name,dept;

    static int cnt=0;

    public Employee()

    {

        cnt++;

    }

    public Employee(int empid,String name,String dept,int salary)

    {

        this.empid=empid;

        this.name=name;

	this.dept=dept;

        this.salary=salary;

	cnt++;

    }

	public String toString()

        {

                return "empid: "+empid+" Name : "+name+" Dept : "+dept+" salary : "+salary;

        }

}

class Slip21_2

{

	public static void main(String args[])

        {

		

        Employee e1=new Employee(1,"AAAA","Computer",20000);

	System.out.println("NO. of objects = "+Employee.cnt);

	System.out.println(e1);

	Employee e2=new Employee(2,"BBBB","Computer",25000);

	System.out.println("NO. of objects = "+Employee.cnt);

	System.out.println(e2);

	Employee e3=new Employee(3,"CCCC","Math",21000);

	System.out.println("NO. of objects = "+Employee.cnt);

	System.out.println(e3);

	Employee e4=new Employee(4,"DDDD","Commerce",30000);

	System.out.println("NO. of objects = "+Employee.cnt);

	System.out.println(e4);

        }

}
