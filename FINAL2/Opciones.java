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
    
    
    
    private JButton datosL = new JButton("EDITAR DATOS");
    private JButton historial  = new JButton("BORRAR HISTORIAL");
    private JButton baja  = new JButton("DARSE DE BAJA");
    private JButton sesion = new JButton("CERRAR SESION");
    private JButton desarrolladores = new JButton("DESARROLLADORES");
    private JButton ayuda = new JButton("AYUDA");
    private JButton atras = new JButton("ATRAS");
    private Usuario datos;

    LineBorder line=new LineBorder(Color.black,3,true);

    /**Constructor */
    Opciones(Usuario datos){
	//.. Componentes graficos
	    this.datos = datos;
		JPanel content = new JPanel(); 
	      
		content.add(desarrolladores);
		content.setBorder(new EmptyBorder(20, 20, 20, 20));
		content.setLayout(new GridLayout(7,1, 0, 15));
		content.add(datosL);
		content.add(historial);
		content.add(baja);
		content.add(sesion);
		content.add(desarrolladores);
		content.add(ayuda);
		content.add(atras);
		datosL.setFont(new Font("Serif",Font.PLAIN, 35));
		historial.setFont(new Font("Serif",Font.PLAIN, 35));
		baja.setFont(new Font("Serif",Font.PLAIN, 35));
		sesion.setFont(new Font("Serif",Font.PLAIN, 35));
	 	desarrolladores.setFont(new Font("Serif",Font.PLAIN, 35));
		ayuda.setFont(new Font("Serif",Font.PLAIN, 35));
		atras.setFont(new Font("Serif",Font.PLAIN, 35));
		
		//Borde de los Botones
		datosL.setBorder(line);
		historial.setBorder(line);
		baja.setBorder(line);
		sesion.setBorder(line);
		desarrolladores.setBorder(line);
		ayuda.setBorder(line);
		atras.setBorder(line);

		//Color Botones
		datosL.setBackground(new Color(255,119,10));
		historial.setBackground(new Color(255,119,10));
		baja.setBackground(new Color(255,119,10));
		sesion.setBackground(new Color(255,119,10));
		desarrolladores.setBackground(new Color(255,119,10));
		ayuda.setBackground(new Color(255,119,10));
		atras.setBackground(new Color(255,119,10));
		
		//azul.setFont(new Font("Serif"),font.PLAIN,30);
		//..Escucha botones
		datosL.addActionListener(new datosListener());
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
			new MainDesarrolladores(datos);
			dispose();
	    }
	}

	class datosListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new MainEditar(datos);
			dispose();
		}
	}

	class historialListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Rutina Libre");
		}
	}

	class bajaListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Archivos uso = new Archivos();
			uso.borra(datos.getNickname());
			System.exit(0);
		}
	}

	class sesionListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
	        System.exit(0);
	    }
	}

	class ayudaListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new MainAyuda(datos);
			dispose();
		}
	}
    
    class atrasListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
	    	new MainMenuPrincipal(datos);
	    	dispose();
		}
    }
}

