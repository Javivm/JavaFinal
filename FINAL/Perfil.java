//librerias necesarias
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

class Perfil extends JFrame{//implementando el listener de eventos

    Usuario datos;

    Perfil(Usuario datos){

        this.datos = datos;

        JLabel perfil=new JLabel("Perfil");
        JLabel nombre = new JLabel("Nombre: "+datos.getNombre());//+variable
        JLabel edad = new JLabel("Edad: "+datos.getFecha());
        JLabel peso = new JLabel("Peso: "+datos.getPeso());
        JLabel altura = new JLabel("Altura: "+datos.getAltura());
        JLabel nickname = new JLabel("Nickname: "+datos.getNickname());
        JLabel sexo  = new JLabel("Sexo: "+datos.getSexo());
        JLabel email = new JLabel("E-mail: "+datos.getCorreo());
        JLabel fecha_registro = new JLabel("Registrado");
        JLabel vacio=new JLabel(" ");
        JButton regresar = new JButton("Regresar");

        JPanel content = new JPanel();
        LineBorder line=new LineBorder(Color.black,3,true);

        content.setBorder(new EmptyBorder(20, 20, 20, 20));
        content.setLayout(new GridLayout(7,2, 15, 15));


        perfil.setFont(new Font("Serif",Font.ITALIC,50));

    //agregando los Labels
        content.add(perfil);
        content.add(vacio);
        content.add(nombre);
        content.add(edad);
        content.add(peso);
        content.add(altura);
        content.add(nickname);
        content.add(sexo);
        content.add(email);
        content.add(fecha_registro);
        content.add(regresar);

        content.setBackground(new Color(230,230,230));  
      
        regresar.setFont(new Font("Serif",Font.PLAIN,18));
        regresar.setBackground(new Color(255,119,10));
        regresar.setBorder(line);
        nombre.setFont(new Font("Serif",Font.PLAIN,20));
        peso.setFont(new Font("Serif",Font.PLAIN,20));
        edad.setFont(new Font("Serif",Font.PLAIN,20));
        altura.setFont(new Font("Serif",Font.PLAIN,20));
        email.setFont(new Font("Serif",Font.PLAIN,20));
        fecha_registro.setFont(new Font("Serif",Font.PLAIN,20));
        sexo.setFont(new Font("Serif",Font.PLAIN,20));
        nickname.setFont(new Font("Serif",Font.PLAIN,20));

        regresar.addActionListener(new regresarL());
        
        this.setLocationRelativeTo(null);   
        this.setContentPane(content);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MainPerfil");
        this.setSize(500,700);	
        this.setResizable(false);
	}

    class regresarL implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new MainMenuPrincipal(datos);   
            dispose();
        }
    }
}

