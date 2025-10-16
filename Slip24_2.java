import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Slip24_2 extends JFrame 

{

    public Slip24_2() 

    {

        setTitle("Concentric Circles");

        setSize(400, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null); 

        addMouseListener(new MouseAdapter() 

	{        

            public void mouseClicked(MouseEvent e) {

                int x = e.getX();

                int y = e.getY();

                // Draw circles based on mouse click position

                getGraphics().clearRect(0, 0, getWidth(), getHeight()); // Clear the previous circles

                drawConcentricCircles(x, y);

            }

        });

        setVisible(true);

    }

    public void drawConcentricCircles(int x, int y) {

        Graphics g = getGraphics();

        g.setColor(Color.LIGHT_GRAY);

        g.fillOval(x - 50, y - 50, 100, 100); 

        g.setColor(Color.GRAY);

        g.fillOval(x - 35, y - 35, 70, 70); 

        g.setColor(Color.DARK_GRAY);

        g.fillOval(x - 20, y - 20, 40, 40); 

    }


    public static void main(String[] args) 

    {

        new Slip24_2();

    }

}
