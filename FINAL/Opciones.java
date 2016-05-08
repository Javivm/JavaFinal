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
public class Opciones extends JFrame{
    //... Components
    
    
    
    private JButton datos = new JButton("EDITAR DATOS");
    private JButton historial  = new JButton("BORRAR HISTORIAL");
    private JButton baja  = new JButton("BAJA");
    private JButton sesion = new JButton("SESION");
    private JButton desarrolladores = new JButton("DESARROLLADORES");
    private JButton ayuda = new JButton("MONITOR DE PESO");
    private JButton atras = new JButton("ATRAS");
    LineBorder line=new LineBorder(Color.black,3,true);

    /**Constructor */
    Opciones(){
	//.. Componentes graficos
    		
	JPanel content = new JPanel(); 
      
	content.add(desarrolladores);
	content.setBorder(new EmptyBorder(20, 20, 20, 20));
	content.setLayout(new GridLayout(7,1, 0, 15));
	content.add(datos);
	content.add(historial);
	content.add(baja);
	content.add(sesion);
	content.add(desarrolladores);
	content.add(ayuda);
	content.add(atras);
	datos.setFont(new Font("Serif",Font.PLAIN, 35));
	historial.setFont(new Font("Serif",Font.PLAIN, 35));
	baja.setFont(new Font("Serif",Font.PLAIN, 35));
	sesion.setFont(new Font("Serif",Font.PLAIN, 35));
 	desarrolladores.setFont(new Font("Serif",Font.PLAIN, 35));
	ayuda.setFont(new Font("Serif",Font.PLAIN, 35));
	atras.setFont(new Font("Serif",Font.PLAIN, 35));
	
	//Borde de los Botones
	datos.setBorder(line);
	historial.setBorder(line);
	baja.setBorder(line);
	sesion.setBorder(line);
	desarrolladores.setBorder(line);
	ayuda.setBorder(line);
	atras.setBorder(line);

	//Color Botones
	datos.setBackground(new Color(255,119,10));
	historial.setBackground(new Color(255,119,10));
	baja.setBackground(new Color(255,119,10));
	sesion.setBackground(new Color(255,119,10));
	desarrolladores.setBackground(new Color(255,119,10));
	ayuda.setBackground(new Color(255,119,10));
	atras.setBackground(new Color(255,119,10));
	
	//azul.setFont(new Font("Serif"),font.PLAIN,30);
	//..Escucha botones
	datos.addActionListener(new datosListener());
	historial.addActionListener(new historialListener());
	baja.addActionListener(new bajaListener());
	sesion.addActionListener(new sesionListener());
	desarrolladores.addActionListener(new desarrolladoresListener());
	ayuda.addActionListener(new ayudaListener());
	atras.addActionListener(new atrasListener());

	content.setBackground(new Color(230,230,230));

	this.setResizable(false);
	this.setLocationRelativeTo(null);	
	this.setContentPane(content);
	this.pack();
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Opciones");
	this.setSize(500,700);
    }


	class desarrolladoresListener implements ActionListener{ 
	    public void actionPerformed(ActionEvent e){
			System.out.println("Desarrolladores");
	
	    }
	}

	class datosListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Datos");
		}
	}

	class historialListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Rutina Libre");
		}
	}

	class bajaListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Baja");
		}
	}

	class sesionListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		System.out.println("Cerrar Sesion");
	        System.exit(0);
	    }
	}

	class ayudaListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Ayuda");
		}
	}
    
    class atrasListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
	    System.out.println("Atras");
	    new MainMenuPrincipal();
	    dispose();
	}
    }
    
    
}

