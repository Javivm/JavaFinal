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

public class Calculadora extends JFrame{
    
    private JTextField pesoTF = new JTextField(20);
    private JTextField edadTF = new JTextField(20);
    private ButtonGroup sexo = new ButtonGroup();
    private JRadioButton mascRB = new JRadioButton("Masculino");
    private JRadioButton femRB = new JRadioButton("Femenino");
    private JButton calc = new JButton("Calcular");
    private JButton calcPerfil = new JButton("Calcular con Mi Perfil");
    private JButton regresar = new JButton("Regresar");
    private JLabel calculadora =new JLabel("Calculadora");
    private JLabel edad =new JLabel("Edad:");
    private JLabel genero = new JLabel("Genero:");
    private JLabel peso = new JLabel("Peso:");
	
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
    
    public Calculadora(){
		
		frame.setVisible(true);
		
		sexo.add(mascRB);
	    sexo.add(femRB);
		
	    JPanel content = new JPanel();
	    frame.add(content);
		content.setBorder(new EmptyBorder(20, 20, 20, 20));
	 	content.setLayout(new GridLayout(11, 1, 0, 5));
		content.add(calculadora);
		content.add(peso);
		content.add(pesoTF);
		content.add(edad);
		content.add(edadTF);
		content.add(genero);
		content.add(mascRB);
		content.add(femRB);
		content.add(calc);
		content.add(calcPerfil);
		content.add(regresar);
		
		//Propiedades
		//Borde de los Botones
		pesoTF.setBorder(line);
		edadTF.setBorder(line);
		calc.setBorder(line);
		calcPerfil.setBorder(line);
		regresar.setBorder(line);
		
	       	//Color de los Botones
		calc.setBackground(new Color(255,119,10));
		calcPerfil.setBackground(new Color(255,119,10));
		regresar.setBackground(new Color(255,119,10));
		
		//Color de fondo
		frame.setBackground(new Color(230,230,230));

		calculadora.setFont(new Font("Serif",Font.PLAIN,50));
		peso.setFont(new Font("Serif",Font.PLAIN,20));
		edad.setFont(new Font("Serif",Font.PLAIN,20));
		genero.setFont(new Font("Serif",Font.PLAIN,20));
		pesoTF.setFont(new Font("Serif",Font.PLAIN,20));
		edadTF.setFont(new Font("Serif",Font.PLAIN,20));
		
		//Propiedades de la Ventana
		this.setSize(500,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);	
		this.setContentPane(content);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Actividades");
		this.setVisible(true);

		
		calc.addActionListener(new CalcListener());
		calcPerfil.addActionListener(new CalcPerfilListener());
		regresar.addActionListener(new RegresarListener());
		
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

	class CalcListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
	    	int edad, peso;
	    	double maxBPM;
	    	double[] zona1 = new double[2];
	    	double[] zona2 = new double[2];
	    	double[] zona3 = new double[2];
	    	double[] zona4 = new double[2];
	    	double[] zona5 = new double[2];
	    	String sexo = "", sedad, speso;
	    	sedad = edadTF.getText();
	    	speso = pesoTF.getText();
			edad = Integer.parseInt(sedad);
			peso = Integer.parseInt(speso);

			if(mascRB.isSelected() == true)
				sexo = "Masculino";
			if(femRB.isSelected() == true)
				sexo = "Femenino";
			maxBPM = CalculadoraModel.calculaBPM(edad, peso, sexo);
			zona1 = CalculadoraModel.calculaZona1();
			zona2 = CalculadoraModel.calculaZona2();
			zona3 = CalculadoraModel.calculaZona3();
			zona4 = CalculadoraModel.calculaZona4();
			zona5 = CalculadoraModel.calculaZona5();
			new MainResultados(maxBPM, zona1, zona2, zona3, zona4, zona5);
	    }
	}

	class CalcPerfilListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
	    	
	    }
	}

	class RegresarListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		
	    }
	}
}
    
