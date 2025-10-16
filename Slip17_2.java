import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

	 

	public class Slip17_2 implements ActionListener

	{

	JButton b1,b2;

	JTextField t1,t2,t3;

	    Slip17_2()

	    {

	        JFrame frame = new JFrame("ActionListenerExample");

	        frame.setLayout(new FlowLayout());

		b1=new JButton("Concat");

		b1.addActionListener(this);

		b2=new JButton("Reverse");

		b2.addActionListener(this);

		t1=new JTextField(15);

		t2=new JTextField(15);

		t3=new JTextField(15);

		frame.add(t1);frame.add(t2);

		frame.add(b1);frame.add(b2);

		frame.add(t3);

		frame.setSize(400,300);

	        frame.setVisible(true);

	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	   	}

		public void actionPerformed(ActionEvent ae) 

		{		

 		String s1=t1.getText();

		String s2=t2.getText();

		if(ae.getSource() == b1)

			t3.setText(""+(s1+s2));

		if(ae.getSource() == b2)

		{

			StringBuffer sb=new StringBuffer(s1);

			t3.setText(""+(sb.reverse()));

		}

		}

	    	public static void main(String[] args)

		{	 

			new Slip17_2();

		}

	  }
