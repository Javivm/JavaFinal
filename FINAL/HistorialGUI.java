//librerias necesarias
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Color; 
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout; 
import java.util.ArrayList; 
import java.util.Collection; 
import java.util.Collections; 
import java.util.Iterator; 
import java.util.List; 
import java.util.Vector; 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.Box; 
import javax.swing.BoxLayout; 
import javax.swing.JFrame; 
import javax.swing.JList; 
import javax.swing.JPanel; 
import javax.swing.JScrollPane; 
import javax.swing.ListSelectionModel; 
import javax.swing.plaf.basic.BasicArrowButton; 
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
 
class HistorialGUI extends JFrame
{

    private JLabel historial = new JLabel("HISTORIAL");
    private JLabel graficas = new JLabel ("Grafica:");

    JPanel content = new JPanel();
    JButton gtiempo= new JButton("Tiempo");
    JButton gDistancia= new JButton("Distancia");
    JButton gCalorias= new JButton("Calorias");
    JButton gActividades= new JButton("Actividades");
    BasicArrowButton regresar=new BasicArrowButton(BasicArrowButton.WEST);
    Usuario datos;
    
    //Constructor
    HistorialGUI(Usuario datos)
    {
        this.datos = datos;
        LineBorder line=new LineBorder(Color.black,2,true);
        ScrolledPaneHistorial panel = new ScrolledPaneHistorial(datos);

        content.setBackground(new Color(200,200,200));  
        historial.setFont(new Font("Serif",Font.PLAIN,60));
        graficas.setFont(new Font("Serif",Font.PLAIN,30));
        regresar.setBounds(20,30,60,30);
        content.add(regresar);
        content.add(historial);
        content.add(panel);   ///////////////////
        content.add(graficas);
        content.add(gtiempo);
        content.add(gDistancia);
        content.add(gActividades);
        content.add(gCalorias);
        gtiempo.setBackground(new Color(255,119,10));
        gtiempo.setBorder(line);
        gActividades.setBackground(new Color(255,119,10));
        gActividades.setBorder(line);
        gCalorias.setBackground(new Color(255,119,10));
        gCalorias.setBorder(line);
        gDistancia.setBackground(new Color(255,119,10));
        gDistancia.setBorder(line);
        //    regresar.setBackground(new Color(255,119,10));
        //  regresar.setBorder(line);
        this.setLocationRelativeTo(null);   
        this.setContentPane(content);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Actividades");
        this.setSize(500,700);
        this.setResizable(false);

        gtiempo.addActionListener(new GTiempoListener());
        gDistancia.addActionListener(new GDistanciaListener());
        gCalorias.addActionListener(new GCaloriasListener());
        gActividades.addActionListener(new GActividadesListener());

        //en esta mierda tienes que pinches poner el historial primero
        //ScrolledPaneHistorial();
        //despues lo quitas con las madres de abajo
	}

    class GTiempoListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new MainMenuPrincipal(datos);   
            dispose();
        }
    }

    class GDistanciaListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new MainMenuPrincipal(datos);   
            dispose();
        }
    }

    class GCaloriasListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new MainMenuPrincipal(datos);   
            dispose();
        }
    }

    class GActividadesListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            new MainMenuPrincipal(datos);   
            dispose();
        }
    }
}

class ScrolledPaneHistorial extends JPanel
{
    private JScrollPane vertical;
    private JTextArea console;

    public ScrolledPaneHistorial(Usuario datos)
    {
        //hacer un ciclo para sacar cada string de la lista
        //dar formato al string
        //meterlo en un superstring

        Historial hist = datos.historial();
        int tam = hist.lista.size();
        for(int contador = 0; contador < tam; contador++)
        {
System.out.println("f");
        }

        console = new JTextArea(28,28);//AQUI VA EL TEXTPO PUTOS 
		console.setFont(new Font("Serif",Font.PLAIN,15));
		console.setBackground(new Color(255,119,10));
		console.setPreferredSize(new Dimension(400,400));
        console.setEditable(false);
        vertical = new JScrollPane(console);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(vertical);
	}
}