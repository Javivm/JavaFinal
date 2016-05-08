 //librerias necesarias
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


class DesNadar extends JFrame{

   private JLabel actividades=new JLabel("NATACION");
	
	//CONSTRUCTOR
    public DesNadar(){
	JPanel content = new JPanel();
    JButton regresar = new JButton("Regresar");

	content.setBackground(new Color(200,200,200));  
	actividades.setFont(new Font("Serif",Font.BOLD,80));
	content.add(actividades);
	content.add(new ScrolledPane());

    LineBorder line=new LineBorder(Color.black,2,true);
    content.add(regresar);
    regresar.setBackground(new Color(255,119,10));
    regresar.setBorder(line);

    this.setLocationRelativeTo(null);   
    this.setContentPane(content);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Actividades");
    this.setSize(500,700);



    }
}

public class MainNadar{
    public static void main(String[] args){
    DesNadar window = new DesNadar();
    window.setVisible(true);
    }
}
 
 class ScrolledPane extends JPanel
{
    private JScrollPane vertical;
    private JTextArea console;

    public ScrolledPane()
    {
        console = new JTextArea("La natación es el movimiento y el desplazamiento \n a través del agua mediante el uso de las \n extremidades corporales y por lo general sin utilizar \n ningún instrumento o apoyo para avanzar. \nSus usos principales son el buceo \n la pesca submarina, el salvamento acuático \n la actividad lúdica, el ejercicio y el deporte.\n La natación es un deporte profesional. \n Las empresas patrocinan a los nadadores \n que están en el nivel internacional \n aunque muchos nadadores compiten con el fin \n de representar a su país de origen en los \n Juegos Olímpicos.\n Los premios en efectivo por batir marcas \n también se dan en muchas de las competiciones \n más importantes \n Los nadadores profesionales también pueden \n ganarse la vida como artistas \n en el caso de la natación sincronizada.",28,28);
		console.setFont(new Font("Serif",Font.PLAIN,15));
		console.setBackground(new Color(255,119,10));
		console.setPreferredSize(new Dimension(700,350));
        console.setEditable(false);
        vertical = new JScrollPane(console);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(vertical);
	}
}
