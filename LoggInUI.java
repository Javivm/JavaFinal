import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.lang.*;
import java.awt.event.*;
import java.awt.GridLayout;

class LoggInUI extends JFrame{

    //... Components
    private JTextField usernameTF = new JTextField(50);
    private JTextField passwordTF = new JTextField(20);
    private JButton loggIn = new JButton("Logg In");
    private JButton register = new JButton("Registrarse");
    private LoggInModel model;


    /**Constructor */
    LoggInUI(){
	//.. Logica
	model = new LoggInModel();

	//.. Componentes graficos
	JPanel content = new JPanel();
	content.setBorder(new EmptyBorder(20, 20, 20, 20));
	content.setLayout(new GridLayout(3, 2, 15, 15));
	content.add(new JLabel("Usuario"));
	content.add(usernameTF);
	content.add(new JLabel("Contraseña"));
	content.add(passwordTF);
	content.add(loggIn);
	content.add(register);

	//..Escucha botones
	loggIn.addActionListener(new LoggInListener());
	register.addActionListener(new RegisterListener());

	this.setContentPane(content);
	this.pack();
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("LoggIn");
    }

    public class LoggInListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String username;
			username = usernameTF.getText();
			if(model.checaUsuario(username) == true){
				System.out.println("Existe");
			}else{
				System.out.println("No Existe");
			}
		}
    }


    public class RegisterListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			RegisterUI window = new RegisterUI();
			window.setVisible(true);
		}
    }
}
