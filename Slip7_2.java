import java.io.*;

class Slip7_2 

{

public static void main(String args[]) throws Exception 

{

FileReader fr = new FileReader("Sample.txt");

BufferedReader br = new BufferedReader(fr);

String s,s1="";

while((s = br.readLine()) != null) 

{

s1+=s+"\n";

}

System.out.println("********File content in reverse order********");

StringBuffer sb=new StringBuffer(s1);

System.out.println(sb.reverse());

System.out.println("********File content in Upper case********");

System.out.println(s1.toUpperCase());

fr.close();

}

}
