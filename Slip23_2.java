import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

import java.text.DecimalFormat;


public class Slip23_2 extends JFrame{

    

    // Conversion rates

     double USD_TO_SGD = 1.41;

     double USD_TO_EUR = 0.92;

     double SGD_TO_EUR = 0.65;

     JLabel sgdLabel,usdLabel,eurLabel;

     JTextField usdField,sgdField,eurField ;

    public static void main(String[] args) 

	{

		new  Slip23_2();

	}


        // Create a new frame (window)

        Slip23_2()

	{

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 200);       

        sgdLabel = new JLabel("Singapore Dollars");

        sgdField = new JTextField();       

        usdLabel = new JLabel("US Dollars");

        usdField = new JTextField();

        usdField.setEditable(false); 

        eurLabel = new JLabel("Euros");  

        eurField = new JTextField();  

        eurField.setEditable(false); 

	setLayout(new GridLayout(3,2,5,5)); 

     

        sgdField.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                try {

                    double sgdAmount = Double.parseDouble(sgdField.getText());


                    // Perform conversions

                    double usdAmount = sgdAmount / USD_TO_SGD;

                    double eurAmount = sgdAmount * SGD_TO_EUR;


                    // Format the output to two decimal places

                    DecimalFormat df = new DecimalFormat("#.00");

                    usdField.setText(df.format(usdAmount));

                    eurField.setText(df.format(eurAmount));

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");

                }

            }

        });

       	add(sgdLabel);

        add(sgdField);

        add(usdLabel);

        add(usdField);

        add(eurLabel);

        add(eurField);

        setVisible(true);

    }

}


