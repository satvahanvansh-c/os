interface PrintNumber

{

public void print(int num1);

}

public class Slip16_1

{

public static void main(String[] a)

{

PrintNumber p = n -> System.out.println("Square is: "+ n*n);

p.print(25);

}

}
