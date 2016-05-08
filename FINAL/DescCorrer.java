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


class DescCorrer extends JFrame{

   private JLabel actividades=new JLabel("CORRER");
	
	//CONSTRUCTOR
    public DescCorrer(){

    JButton regresar = new JButton("Regresar");
	JPanel content = new JPanel();
    LineBorder line=new LineBorder(Color.black,2,true);
	content.setBackground(new Color(200,200,200));  
	actividades.setFont(new Font("Serif",Font.BOLD,80));
	content.add(actividades);
	content.add(new ScrolledPane4());
	content.add(regresar);
	regresar.setBackground(new Color(255,119,10));
	regresar.setBorder(line);
	regresar.addActionListener(new regresarListener());
	
    this.setLocationRelativeTo(null);   
    this.setContentPane(content);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Actividades");
    this.setSize(500,700);

    }

class regresarListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
	System.out.println("Carrera");
	new MainActividades();
	dispose();
    }
}    


}


 
 class ScrolledPane4 extends JPanel
{
    private JScrollPane vertical;

    private JTextArea console;

    public ScrolledPane4()
    {
        console = new JTextArea("Correr es un proceso complejo \n coordinado que involucra a todo el cuerpo.\n Cada ser humano corre de una manera diferente \n pero ciertos aspectos generales de los movimientos \n de la carrera son comunes. \n Las carreras a pie son competiciones de atletismo \n para determinar cual de los competidores corre \n una cierta distancia en el menor tiempo. \n Existen campeonatos mundiales de carreras a pie \n entre ellos los Juegos Olimpicos y el Campeonato \n Mundial de Atletismo. \n Para hacer referencia a la carrera a pie \n en espanol se hace un prestamo linguistico del ingles \n utilizando la expresion Footing.\n Se ejecuta como una secuencia de pasos alternados \n de las dos (piernas). \n Cada zancada se puede dividir en tres fases: \n apoyo, impulso y recuperacion. \n El apoyo y el impulso ocurren cuando el pie tiene \n contacto con el suelo. La recuperacion ocurre \n con el pie en el aire. \n Debido a que al correr solamente un pie esta en el suelo,\n siempre hay una pierna en recuperacion mientras \n la otra pasa por las fases de apoyo e impulso. \n Por un instante, mientras el corredor salta, \n ambas piernas estan en recuperacion.",28,28);
		console.setFont(new Font("Serif",Font.PLAIN,15));
		console.setBackground(new Color(255,119,10));
		console.setPreferredSize(new Dimension(700,350));
        console.setEditable(false);
        vertical = new JScrollPane(console);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(vertical);
	}
}