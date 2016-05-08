import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


//import java.lang.*;
public class MenuPrincipal extends JFrame{
    //... Components    
    private JButton rutinaDiaria = new JButton("RUTINA");
    private JButton rutinaLibre  = new JButton("PERFIL");
    private JButton historial  = new JButton("HISTORIAL");
    private JButton calculadora = new JButton("CALCULADORA");
    private JButton actividades = new JButton("ACTIVIDADES");
    private JButton monitorPeso = new JButton("CERRAR SESION");
    private JButton opciones = new JButton("OPCIONES");
    private Usuario datos;
    LineBorder line=new LineBorder(Color.black,3,true);

    /**Constructor */
    MenuPrincipal(Usuario datos){
	//.. Componentes graficos
    		
    this.datos = datos;

	JPanel content = new JPanel(); 
      
	content.add(actividades);
	content.setBorder(new EmptyBorder(20, 20, 20, 20));
	content.setLayout(new GridLayout(7,1, 0, 15));
	content.add(rutinaDiaria);
	content.add(rutinaLibre);
	content.add(historial);
	content.add(calculadora);
	content.add(actividades);
	content.add(monitorPeso);
	content.add(opciones);
	rutinaDiaria.setFont(new Font("Serif",Font.PLAIN, 35));
	rutinaLibre.setFont(new Font("Serif",Font.PLAIN, 35));
	historial.setFont(new Font("Serif",Font.PLAIN, 35));
	calculadora.setFont(new Font("Serif",Font.PLAIN, 35));
 	actividades.setFont(new Font("Serif",Font.PLAIN, 35));
	monitorPeso.setFont(new Font("Serif",Font.PLAIN, 35));
	opciones.setFont(new Font("Serif",Font.PLAIN, 35));
	
	//Borde de los Botones
	rutinaDiaria.setBorder(line);
	rutinaLibre.setBorder(line);
	historial.setBorder(line);
	calculadora.setBorder(line);
	actividades.setBorder(line);
	monitorPeso.setBorder(line);
	opciones.setBorder(line);

	//Color Botones
	rutinaDiaria.setBackground(new Color(255,119,10));
	rutinaLibre.setBackground(new Color(255,119,10));
	historial.setBackground(new Color(255,119,10));
	calculadora.setBackground(new Color(255,119,10));
	actividades.setBackground(new Color(255,119,10));
	monitorPeso.setBackground(new Color(255,119,10));
	opciones.setBackground(new Color(255,119,10));
	
	//azul.setFont(new Font("Serif"),font.PLAIN,30);
	//..Escucha botones
	rutinaDiaria.addActionListener(new rutinaDiariaListener());
	rutinaLibre.addActionListener(new rutinaLibreListener());
	historial.addActionListener(new historialListener());
	calculadora.addActionListener(new calculadoraListener());
	actividades.addActionListener(new actividadesListener());
	monitorPeso.addActionListener(new monitorPesoListener());
	opciones.addActionListener(new opcionesListener());

	content.setBackground(new Color(230,230,230));

	this.setResizable(false);
	this.setLocationRelativeTo(null);	
	this.setContentPane(content);
	this.pack();
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Actividades");
	this.setSize(500,700);
    }


	class actividadesListener implements ActionListener{ 
	    public void actionPerformed(ActionEvent e){
			new MainActividades(datos);
			dispose();
	    }
	}

	class rutinaDiariaListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
			new MainRutina(datos);
			dispose();
		}
	}

	class rutinaLibreListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
	    	new MainPerfil(datos);
	    	dispose();
		}
	}
    
	class historialListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Historial");
		}
	}

	class calculadoraListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Calculadora");
		new MainCalculadora(datos);
		dispose();
		}
	}

	class monitorPesoListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Monitor de Peso");
		System.exit(0);
		}
	}

	class opcionesListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Opciones");
		new MainOpciones(datos);
		dispose();
		}
	}

	
}

