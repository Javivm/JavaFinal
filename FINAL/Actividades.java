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


public class Actividades extends JFrame{//implementando el listener de eventos
    //... Components
    JButton carrera = new JButton();
    JButton caminata= new JButton();
    JButton natacion= new JButton();
    JButton eliptica= new JButton();
    JButton kayak= new JButton();
    JButton bicicleta= new JButton();
    JButton regresar= new JButton("Regresar");
    JLabel actividades=new JLabel("     Actividades");
    Usuario datos;

    /**Constructor */
    Actividades(Usuario datos){
    	
    this.datos = datos;

	//.. Componentes graficos
        //borde a las imagenes
	LineBorder line=new LineBorder(Color.black,3,true);
	ImageIcon ic1 = new ImageIcon("./imagenes/correr .png");
	ImageIcon ic2 = new ImageIcon("./imagenes/natacion.png");
	ImageIcon ic3 = new ImageIcon("./imagenes/caminar.png");
	ImageIcon ic4 = new ImageIcon("./imagenes/eliptica.png");
	ImageIcon ic5 = new ImageIcon("./imagenes/kayak.png");
	ImageIcon ic6 = new ImageIcon("./imagenes/bicicleta.png");
	carrera = new JButton(ic1);
	natacion = new JButton(ic2);
	caminata = new JButton(ic3);
	eliptica = new JButton(ic4);
	kayak = new JButton(ic5);
	bicicleta = new JButton(ic6);
	


	carrera.setBorder(line);
	natacion.setBorder(line);
	caminata.setBorder(line);
	kayak.setBorder(line);
	eliptica.setBorder(line);
	bicicleta.setBorder(line);
	regresar.setBorder(line);

	carrera.setBackground(new Color(255,119,10));
	natacion.setBackground(new Color(255,119,10));
	caminata.setBackground(new Color(255,119,10));
	eliptica.setBackground(new Color(255,119,10));
	kayak.setBackground(new Color(255,119,10));
	bicicleta.setBackground(new Color(255,119,10));
	regresar.setBackground(new Color(255,119,10));
	
	JPanel content = new JPanel();
	actividades.setFont(new Font("Jokerman",Font.PLAIN,50));
	content.setBackground(new Color(230,230,230));
	
	content.add(actividades);
	content.setBorder(new EmptyBorder(20, 20, 20, 20));
	content.setLayout(new GridLayout(8,1, 0, 15));
	content.add(carrera);
	content.add(caminata);
	content.add(natacion);
	content.add(eliptica);
	content.add(kayak);
	content.add(bicicleta);
	content.add(regresar);
        //azul.setFont(new Font("Serif"),font.PLAIN,30);
	//..Escucha botonesn
	
	regresar.addActionListener(new RegresarL());
	carrera.addActionListener(new carreraListener());
	caminata.addActionListener(new caminataListener());
	natacion.addActionListener(new natacionListener());
	eliptica.addActionListener(new elipticaListener());
	kayak.addActionListener(new kayakListener());
	bicicleta.addActionListener(new bicicletaListener());
	
	this.setLocationRelativeTo(null);   
	this.setContentPane(content);
	this.pack();
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Actividades");
	this.setSize(500,700);
	this.setResizable(false);
    }

	class RegresarL implements ActionListener{
	    public void actionPerformed(ActionEvent e){
			new MainMenuPrincipal(datos);
			dispose();
	    }
	}

	class carreraListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		System.out.println("Carrera");
		new MainCorrer();
		dispose();
	    }
	}

	class caminataListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		System.out.println("Caminata");
		new MainCaminar();
		dispose();
	    }
	}

	class natacionListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		System.out.println("Natacion");
		new MainNadatacion();
		dispose();
	    }
	}

	class elipticaListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		System.out.println("Eliptica");
		new MainEliptica();
		dispose();
	    }
	}

	class kayakListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		System.out.println("kayak");
		new MainKayak();
		dispose();
	    }
	}

	class bicicletaListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		System.out.println("Bicicleta");
		new MainBici();
		dispose();
	    }
	}
}