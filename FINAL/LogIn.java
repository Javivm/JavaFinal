/**
 * 
 * 
 * @author Armando Azar
 * @author Santiago Menendez
 * @author Luis Padilla
 * @author Javier Vega
 */
import javax.swing.border.LineBorder;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.lang.*;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.*;
import javax.swing.border.LineBorder;

class LogIn extends JFrame{

    //... Components
    private JTextField usernameTF = new JTextField("");
    private JPasswordField passwordTF = new JPasswordField("");
    private JButton loggIn = new JButton("Log In");
    private JButton register = new JButton("Registrarse");
    private LogInModel model;
    private JLabel LOGIN=new JLabel("     LOGIN");
    private JLabel contrasena = new JLabel("Contrasena:");
    private JLabel usuario=new JLabel("Usuario:");

    /**Constructor */
    LogIn(){
	//.. Logica
	model = new LogInModel();

	//.. Componentes graficos

        LineBorder line=new LineBorder(Color.black,3,true);
	
	JPanel content = new JPanel();
	content.setBorder(new EmptyBorder(20, 20, 20, 20));
	content.setLayout(new GridLayout(7,1, 15, 15));
	content.add(LOGIN);
	content.add(usuario);
	content.add(usernameTF);
	content.add(contrasena);
	content.add(passwordTF);
	content.add(loggIn);
	content.add(register);
	content.setBackground(new Color(230,230,230));	
	//fonts
	LOGIN.setFont(new Font("Serif",Font.PLAIN,50));
	loggIn.setFont(new Font("Serif",  Font.PLAIN,  35));
	register.setFont(new Font("Serif",  Font.PLAIN,  35));
	contrasena.setFont(new Font("Serif",  Font.PLAIN,  35));
	usuario.setFont(new Font("Serif",  Font.PLAIN,  35));
	usernameTF.setFont(new Font("Serif",Font.PLAIN,35));
	passwordTF.setFont(new Font("Serif",Font.PLAIN,35));

	loggIn.setBorder(line);
	register.setBorder(line);
	loggIn.setBackground(new Color(255,119,10));
	register.setBackground(new Color(255,119,10));

	//..Escucha botones
	loggIn.addActionListener(new LoggInListener());
	register.addActionListener(new RegisterListener());
	usernameTF.setBorder(line);
	passwordTF.setBorder(line);

	this.setLocationRelativeTo(null);
	this.setContentPane(content);
	this.pack();
	this.setSize(500,700);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("LogIn");
    }

    /**
     * 
     * 
     * @author Armando Azar
     * @author Santiago Menendez
     * @author Luis Padilla
     * @author Javier Vega
     */
    //asn
    
    public class LoggInListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		Archivos arch = new Archivos();
	    String username, password, pswd, nombre, nickname, fecha, genero, correo, registro;
	    float altura, peso;
	    username = usernameTF.getText();
	    password = String.valueOf(passwordTF.getPassword());
	    if(username.equals("")){
		System.out.println("No existe el usuario");
	    }else{
		if(model.checaUsuario(username) == true){
		    pswd = model.leePassword(username);
		    if(pswd.equals(password)){
				nombre = arch.leeNombre(username);
				//System.out.println("Existe");
				nickname = arch.leeNickname(username);
				//System.out.println("Existe");
				fecha = arch.leeFecha(username);
				//System.out.println("Existe");
				genero = arch.leeGenero(username);
				//System.out.println("Existe");
				altura = Float.parseFloat(arch.leeAltura(username));
				//System.out.println("Existe");
				peso = Float.parseFloat(arch.leePeso(username));
				//System.out.println("Existe");
				correo = arch.leeCorreo(username);

				registro = "07/03/2016";
				//System.out.println("Existe");
				//registro = arch.leeRegistro(username);
				//System.out.println("Existe");
				Usuario datos = new Usuario(nombre, nickname, fecha, pswd, genero, altura, peso, correo, registro);
				new MainMenuPrincipal(datos);
				dispose();
		    }else{
			System.out.println("Password incorrecto");
		    }
		}else{
		    System.out.println("No Existe");
		}
	    }
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
	public void actionPerformed(ActionEvent e){
	    new Registro();
	}
    }
}
