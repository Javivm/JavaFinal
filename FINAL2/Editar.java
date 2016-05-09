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
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;

class Editar extends JFrame{//implementando el listener de eventos

    JTextArea nombreE;
    JTextArea edadE;
    JTextArea pesoE;
    JTextArea alturaE;
    JTextArea nicknameE;
    JTextArea emailE;

    Usuario datos;
    //Perfil(Usuario datos){
    Editar(Usuario datos){
        this.datos = datos;
        JLabel perfil=new JLabel("Editar tu");
        JLabel nombre = new JLabel("Nombre: ");//+datos.getNombre());//+variable
        JLabel edad = new JLabel("Nacimiento: ");//+datos.getFecha());
        JLabel peso = new JLabel("Peso: ");//+datos.getPeso());
        JLabel altura = new JLabel("Altura: ");//+datos.getAltura());
        JLabel nickname = new JLabel("Nickname: ");//+datos.getNickname());
        JLabel email = new JLabel("E-mail: ");//+datos.getCorreo());
        nombreE = new JTextArea(datos.getNombre());//+datos.getNombre());//+variable
        edadE = new JTextArea(datos.getFechaBien());//+datos.getFecha());     ----------
        pesoE = new JTextArea(Float.toString(datos.getPeso()));//+datos.getPeso());
        alturaE = new JTextArea(Float.toString(datos.getAltura()));//+datos.getAltura());
        nicknameE = new JTextArea(datos.getNickname());//+datos.getNickname());
        emailE = new JTextArea(datos.getCorreo());//+datos.getCorreo());
        
        JLabel vacio=new JLabel("Perfil");
        JButton guardar = new JButton("Guardar");
        JButton regresar = new JButton("Regresar");

        JPanel content = new JPanel();
        LineBorder line=new LineBorder(Color.black,3,true);
        content.add(perfil);
        content.setBorder(new EmptyBorder(20, 20, 20, 20));
        content.setLayout(new GridLayout(14,2, 15, 15));


        perfil.setFont(new Font("Serif",Font.ITALIC,45));
        vacio.setFont(new Font("serif",Font.ITALIC,45));
    //agregando los Labels
        content.add(vacio);
        content.add(nombre);
        content.add(nombreE);
        content.add(edad);
        content.add(edadE);
        content.add(peso);
        content.add(pesoE);
        content.add(altura);
        content.add(alturaE);
        content.add(nickname);
        content.add(nicknameE);
        content.add(email);
        content.add(emailE);
        content.add(guardar);
        content.add(regresar);
        content.setBackground(new Color(230,230,230));  
      
        regresar.setFont(new Font("Serif",Font.PLAIN,18));
        regresar.setBackground(new Color(255,119,10));
        regresar.setBorder(line);
        guardar.setFont(new Font("Serif",Font.PLAIN,18));
        guardar.setBackground(new Color(255,119,10));
        guardar.setBorder(line);
        nombre.setFont(new Font("Serif",Font.PLAIN,20));
        nombre.setBackground(new Color(255,119,10));

        peso.setFont(new Font("Serif",Font.PLAIN,20));
        peso.setBackground(new Color(255,119,10));
        edad.setFont(new Font("Serif",Font.PLAIN,20));
        edad.setBackground(new Color(255,119,10));
        altura.setFont(new Font("Serif",Font.PLAIN,20));
        altura.setBackground(new Color(255,119,10));
        email.setFont(new Font("Serif",Font.PLAIN,20));
        email.setBackground(new Color(255,119,10));
        nickname.setFont(new Font("Serif",Font.PLAIN,20));
        nickname.setBackground(new Color(255,119,10));

        regresar.addActionListener(new regresarL());
        guardar.addActionListener(new GuardarListener());

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
            new MainOpciones(datos);   
            dispose();
        }
    }

    class GuardarListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            datos.setNombre(nombreE.getText());
            datos.setNickname(nicknameE.getText());
            datos.setPeso(Float.valueOf(pesoE.getText()));
            datos.setAltura(Float.valueOf(alturaE.getText()));
            datos.setCorreo(emailE.getText());
            datos.setFecha(edadE.getText());

            String[] fields = new String[9];

            fields[0] = nombreE.getText();
            fields[1] = nicknameE.getText();
            fields[2] = datos.getPassword();
            fields[3] = edadE.getText();
            fields[4] = datos.getSexo();
            fields[5] = alturaE.getText();
            fields[6] = pesoE.getText();
            fields[7] = emailE.getText();
            fields[8] = datos.getRegistro();

            Archivos arch = new Archivos();
            arch.escribeArchivo(fields);

            new MainOpciones(datos);  
            dispose();
        }
    }
}