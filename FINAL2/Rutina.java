//librerias necesarias
import java.awt.*;
import java.awt.event.*;
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

public class Rutina extends JFrame{//implementando el listener de eventos
    //... Components
    private Usuario datos;
    private JTextField timepoTF = new JTextField(20);
    private JTextField distanciaTF = new JTextField(20);
    private JButton agregar = new JButton("Agregar Actividad");
    private JButton regresar = new JButton("Regresar");
    private JLabel timepo =new JLabel("Tiempo (hh.mm)");
    private JLabel distancia =new JLabel("Distancia (km)");
    private JLabel actividad = new JLabel("Agregar Actividad");
    private JLabel selecciona = new JLabel("Selecciona Actividad");

    private DefaultComboBoxModel actividades = new DefaultComboBoxModel();
    private JComboBox actividadesCombo = new JComboBox(actividades); 

    public JFrame frame = new JFrame();
    LineBorder line=new LineBorder(Color.black,3,true);

    /**Constructor */
    Rutina(Usuario datos){
    	this.datos = datos;

		frame.setVisible(true);

		actividades.addElement("Bicicleta");
    	actividades.addElement("Caminata");
    	actividades.addElement("Carrera");
    	actividades.addElement("Eliptica");
    	actividades.addElement("Kayaking");
      	actividades.addElement("Natacion");
   
      	actividadesCombo.setSelectedIndex(0);

      	JScrollPane actividadesScrollPane = new JScrollPane(actividadesCombo);    
		
	    JPanel content = new JPanel();
	    frame.add(content);
		content.setBorder(new EmptyBorder(20, 20, 20, 20));
	 	content.setLayout(new GridLayout(9, 1, 0, 15));
		content.add(actividad);
		content.add(selecciona);
		content.add(actividadesScrollPane);
		content.add(distancia);
		content.add(distanciaTF);
		content.add(timepo);
		content.add(timepoTF);
		content.add(agregar);
		content.add(regresar);
		//Propiedades
		//Borde de los Botones
		distanciaTF.setBorder(line);
		timepoTF.setBorder(line);
		agregar.setBorder(line);
		regresar.setBorder(line);
		
	       	//Color de los Botones
		agregar.setBackground(new Color(255,119,10));
		regresar.setBackground(new Color(255,119,10));

		//Color de fondo
		frame.setBackground(new Color(230,230,230));

		actividad.setFont(new Font("Serif",Font.PLAIN,50));
		distancia.setFont(new Font("Serif",Font.PLAIN,20));
		timepo.setFont(new Font("Serif",Font.PLAIN,20));
		selecciona.setFont(new Font("Serif",Font.PLAIN,20));
		
		//Propiedades de la Ventana
		this.setSize(500,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);	
		this.setContentPane(content);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Actividades");
		this.setVisible(true);

		agregar.addActionListener(new AgregarListener());
		regresar.addActionListener(new RegresarListener());
		
		this.setContentPane(content);
		this.pack();	    
    }

	class AgregarListener implements ActionListener{
		String actividadS = "";

	    public void actionPerformed(ActionEvent e){

	    	Actividad actividad = null;
	    	int tipoActividad;

	    	if (actividadesCombo.getSelectedIndex() != -1)
    		{                     
        		actividadS = ""+actividadesCombo.getItemAt(actividadesCombo.getSelectedIndex());             
        	} 

	    	if(actividadS.equals("Bicicleta")){
	    		tipoActividad = 1;
	    		actividad = new Bicicleta(Float.parseFloat(timepoTF.getText()), Float.parseFloat(distanciaTF.getText()), datos.getPeso());
	    	}
	    	else if(actividadS.equals("Caminata")){
	    		tipoActividad = 2;
	    		actividad = new Caminata(Float.parseFloat(timepoTF.getText()), Float.parseFloat(distanciaTF.getText()), datos.getPeso());
	    	}
	    	else if(actividadS.equals("Carrera")){
	    		tipoActividad = 3;
	    		actividad = new Carrera(Float.parseFloat(timepoTF.getText()), Float.parseFloat(distanciaTF.getText()), datos.getPeso());
	    	}
	    	else if(actividadS.equals("Eliptica")){
	    		tipoActividad = 4;
	    		actividad = new Eliptica(Float.parseFloat(timepoTF.getText()), Float.parseFloat(distanciaTF.getText()), datos.getPeso());
	    	}
	    	else if(actividadS.equals("Kayaking")){
	    		tipoActividad = 5;
	    		actividad = new Kayak(Float.parseFloat(timepoTF.getText()), Float.parseFloat(distanciaTF.getText()), datos.getPeso());
	    	}
	    	else if(actividadS.equals("Natacion")){
	    		tipoActividad = 6;
	    		actividad = new Natacion(Float.parseFloat(timepoTF.getText()), Float.parseFloat(distanciaTF.getText()), datos.getPeso());
	    	}

			datos.historial.recibe(actividad);
	    }
	}

	class RegresarListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
			new MainMenuPrincipal(datos);
			dispose();
	    }
	}
}