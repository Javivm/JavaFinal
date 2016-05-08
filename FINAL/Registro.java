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

public class Registro{
    
    private JTextField nombreTF = new JTextField(20);
    private JTextField nicknameTF = new JTextField(20);
    private JTextField passwordTF = new JTextField(20);
    private JTextField edadTF = new JTextField(20);
    private ButtonGroup sexo = new ButtonGroup();
    private JRadioButton mascRB = new JRadioButton("Masculino");
    private JRadioButton femRB = new JRadioButton("Femenino");
    private JTextField alturaTF = new JTextField(20);
    private JTextField pesoTF = new JTextField(20);
    private JTextField emailTF = new JTextField(40);
    private JButton cancel = new JButton("Cancelar");
    private JButton register = new JButton("Registrarse");
    private JLabel registrate =new JLabel("Registrate");
    private JLabel nombre =new JLabel("Nombre:");
    private JLabel nickname = new JLabel("Nickname:");
    private JLabel contrasena = new JLabel("Contrasena:");
    private JLabel edad = new JLabel("Fecha de Nacimiento(DD/MM/AAAA):");
    private JLabel Sexo = new JLabel("Sexo:");
    private JLabel altura = new JLabel("Altura:");
    private JLabel peso = new JLabel("Peso:");
    private JLabel mail =  new JLabel("Correo Electronico:");
	
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
    
    public Registro(){
		
		frame.setVisible(true);
		
		sexo.add(mascRB);
	    sexo.add(femRB);
		
	    JPanel content = new JPanel();
	    frame.add(content);
		content.setBorder(new EmptyBorder(20, 20, 20, 20));
		content.setLayout(new GridLayout(20, 1, 0, 5));
		content.add(nombre);
		content.add(nombreTF);
		content.add(nickname);
		content.add(nicknameTF);
		content.add(contrasena);
		content.add(passwordTF);
		content.add(edad);
		content.add(edadTF);
		content.add(Sexo);
		content.add(mascRB);
		content.add(femRB);
		content.add(altura);
		content.add(alturaTF);
		content.add(peso);
		content.add(pesoTF);
		content.add(mail);
		content.add(emailTF);
		content.add(register);
		content.add(cancel);
		
		//Propiedades
		//Borde de los Botones
		register.setBorder(line);
		cancel.setBorder(line);
		nombreTF.setBorder(line);
		nicknameTF.setBorder(line);
		passwordTF.setBorder(line);
		edadTF.setBorder(line);
		alturaTF.setBorder(line);
		pesoTF.setBorder(line);
		emailTF.setBorder(line);

		nombreTF.setSize(400,100);
		//Color de los Botones
		register.setBackground(new Color(255,119,10));
		cancel.setBackground(new Color(255,119,10));
		
		//Color de fondo
		frame.setBackground(new Color(230,230,230));

		nombre.setFont(new Font("Serif",Font.PLAIN,20));
		nickname.setFont(new Font("Serif",Font.PLAIN,20));
		contrasena.setFont(new Font("Serif",Font.PLAIN,20));
		edad.setFont(new Font("Serif",Font.PLAIN,20));
		Sexo.setFont(new Font("Serif",Font.PLAIN,20));
		altura.setFont(new Font("Serif",Font.PLAIN,20));
		peso.setFont(new Font("Serif",Font.PLAIN,20));
		mail.setFont(new Font("Serif",Font.PLAIN,20));
		
		//Propiedades de la Ventana
		frame.setSize(500,700);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);	
		frame.setContentPane(content);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Actividades");
		frame.setVisible(true);


		register.addActionListener(new RegisterListener());
		cancel.addActionListener(new CancelListener());
		
		frame.setContentPane(content);
		frame.pack();
    }
    
    /**
     * 
     * 
     * @author Armando Azar
     * @author Santiago Menendez
     * @author Luis Padilla
     * @author Javier Vega
     */
    public class CancelListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
		    frame.dispose();
		}
    }
    
    /**
     * 
     * 
     * @author Armando Azar
     * @author Santiago Menendez
     * @author Luis Padilla
     * @author Javier Vega
     */
    public class RegisterListener implements ActionListener{
		private Archivos arch = new Archivos();
		
		public void actionPerformed(ActionEvent e){
		    String[] fields = new String[8];

		    fields[0] = nombreTF.getText();
		    fields[1] = nicknameTF.getText();
		    fields[2] = passwordTF.getText();
		    fields[3] = edadTF.getText();
		    if(mascRB.isSelected() == true)
				fields[4] = "Masculino";
		    if(femRB.isSelected() == true)
				fields[4] = "Femenino";
		    fields[5] = alturaTF.getText();
		    fields[6] = pesoTF.getText();
		    fields[7] = emailTF.getText();

		    arch.escribeArchivo(fields);

		    frame.dispose();
	    }
    }
}