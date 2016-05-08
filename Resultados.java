/**
 * 
 * 
 * @author Armando Azar
 * @author Santiago Menendez
 * @author Luis Padilla
 * @author Javier Vega
 */

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.lang.*;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.*;

public class Resultados extends JFrame{
 
    private JLabel titulo =new JLabel("Resultados");

    public JFrame frame = new JFrame();

    LineBorder line=new LineBorder(Color.black,3,true);
    
    
    
    /**
     * 
     * 
     * @author Armando Azar
     * @author Santiago Menendez
     * @author Luis Padilla
     * @author Javier Vega
     */
    
    public Resultados(double maxBPN, double[] zone1, double[] zone2, double[] zone3, double[] zone4, double[] zone5){
		
        JLabel ppm = new JLabel("PpM = "+String.valueOf(maxBPN));
	    JLabel zona1 = new JLabel("Zona 1 (50-60%) = min:"+String.valueOf(zone1[0])+" max:"+String.valueOf(zone1[1]));    
	   	JLabel zona2 = new JLabel("Zona 2 (60-70%) = min:"+String.valueOf(zone2[0])+" max:"+String.valueOf(zone2[1]));    
	   	JLabel zona3 = new JLabel("Zona 3 (70-80%) = min:"+String.valueOf(zone3[0])+" max:"+String.valueOf(zone3[1]));    
	    JLabel zona4 = new JLabel("Zona 4 (80-90%) = min:"+String.valueOf(zone4[0])+" max:"+String.valueOf(zone4[1]));    
	    JLabel zona5 = new JLabel("Zona 5 (90-95%) = min:"+String.valueOf(zone5[0])+" max:"+String.valueOf(zone5[1]));    


		frame.setVisible(true);
    
	    JPanel content = new JPanel();
	    frame.add(content);
		content.setBorder(new EmptyBorder(20, 20, 20, 20));
	 	content.setLayout(new GridLayout(7, 1, 0, 5));
		content.add(titulo);
		content.add(ppm);
		content.add(zona1);
		content.add(zona2);
		content.add(zona3);
		content.add(zona4);
		content.add(zona5);
		
		//Propiedaes
		
		//Color de fondo
		frame.setBackground(new Color(230,230,230));

		titulo.setFont(new Font("Serif",Font.PLAIN,50));
		ppm.setFont(new Font("Serif",Font.PLAIN,20));
		zona1.setFont(new Font("Serif",Font.PLAIN,20));
		zona2.setFont(new Font("Serif",Font.PLAIN,20));
		zona3.setFont(new Font("Serif",Font.PLAIN,20));
		zona4.setFont(new Font("Serif",Font.PLAIN,20));
		zona5.setFont(new Font("Serif",Font.PLAIN,20));

		//Propiedades de la Ventana
		this.setSize(500,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);	
		this.setContentPane(content);
		this.pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Resultados");
		this.setVisible(true);

	       
		
		this.setContentPane(content);
		this.pack();	    
    }

	    /**
	     * 
	     * 
	     * @author Armando Azar
	     * @author Santiago Menendez
	     * @author Luis Padilla
	     * @author Javier Vega
	     */

}