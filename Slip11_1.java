interface operation

{

       static double PI=3.14;

       double area();

       double volume();

}


class Cylinder implements operation

{

        int rad;

        int height; 

        Cylinder(int rad,int height)

        {

                this.rad=rad;

                this.height=height;  

        }

        public double  area()

        {

                System.out.print("\nArea of Cylinder:");

		return 2*PI*rad*height + 2*PI*Math.pow(rad,2);                

        }

        public double volume()

        {

   System.out.print("\nVolume of Cylinder:");                  

		  return PI*Math.pow(rad,2)*height;

        }

}

public class Slip11_1

{

        public static void main(String args[])

        {

                operation op = new Cylinder(3,4);            

                System.out.println(op.area()+"........");

                System.out.println(op.volume()+"......");               

        }

}
