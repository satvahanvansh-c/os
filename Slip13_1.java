import java.io.*;

class Slip13_1

{

	public static void main(String args[]) throws IOException

	{

		String line,dirname=args[0];

		int ch,i,cnt=0,lcnt=0;

		File f1=new File(dirname);

		if(f1.isFile() && f1.exists())

		{

			BufferedReader br = new BufferedReader(new FileReader(f1));  

         		while((line = br.readLine()) != null) 

			{  

			lcnt++;

            		String words[] = line.split("");  

               		cnt = cnt + words.length;  

			}

		}

	System.out.println("Total Number Of Lines:"+lcnt);

	System.out.println("Total Number Of Words:"+cnt);

}

}
