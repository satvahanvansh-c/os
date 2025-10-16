interface PrintNumber

{

public void print(int num1);

}

public class Slip10_1

{

public static void main(String[] a)

{

PrintNumber p = n -> System.out.println("Cube is: "+ n*n*n);

p.print(5);

}

}
