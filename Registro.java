import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.lang.*;
import java.awt.event.*;
import java.awt.GridLayout;

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
	public JFrame frame = new JFrame();


<<<<<<< HEAD:Registro.java
	public Registro(){
  		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Register");
  		frame.setVisible(true);
=======
    	super("window");
    	//Button Group
    	sexo.add(mascRB);
    	sexo.add(femRB);

		//.. Logica
>>>>>>> 1f27cf6030bd009382c69797a60a8370ffab980c:RegisterUI.java

  		sexo.add(mascRB);
    	sexo.add(femRB);

    	JPanel content = new JPanel();
    	frame.add(content);
		content.setBorder(new EmptyBorder(20, 20, 20, 20));
		content.setLayout(new GridLayout(19, 1, 10, 10));
		content.add(new JLabel("Nombre"));
		content.add(nombreTF);
		content.add(new JLabel("Nickname"));
		content.add(nicknameTF);
		content.add(new JLabel("Contraseña"));
		content.add(passwordTF);
		content.add(new JLabel("Edad"));
		content.add(edadTF);
		content.add(new JLabel("Sexo"));
		content.add(mascRB);
		content.add(femRB);
		content.add(new JLabel("Altura"));
		content.add(alturaTF);
		content.add(new JLabel("Peso"));
		content.add(pesoTF);
		content.add(new JLabel("Correo Electronico"));
		content.add(emailTF);
		content.add(register);
		content.add(cancel);

		register.addActionListener(new RegisterListener());
		cancel.addActionListener(new CancelListener());

		frame.setContentPane(content);
		frame.pack();
	}

	public class CancelListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
<<<<<<< HEAD:Registro.java
			frame.dispose();
		}
    }

	public class RegisterListener implements ActionListener{
=======
			setVisible(false);
		}
    }

    public class RegisterListener implements ActionListener{
>>>>>>> 1f27cf6030bd009382c69797a60a8370ffab980c:RegisterUI.java
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

			arch.escribeArchivo(fields, 1);

<<<<<<< HEAD:Registro.java
			frame.dispose();
=======
			setVisible(false);
>>>>>>> 1f27cf6030bd009382c69797a60a8370ffab980c:RegisterUI.java
    	}
    }
}
