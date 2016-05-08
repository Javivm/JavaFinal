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


class DescNatacion extends JFrame{

   private JLabel actividades=new JLabel("NATACION");
	
	//CONSTRUCTOR
    public DescNatacion(){
	JPanel content = new JPanel();
    JButton regresar = new JButton("Regresar");

	content.setBackground(new Color(200,200,200));  
	actividades.setFont(new Font("Serif",Font.BOLD,80));
	content.add(actividades);
	content.add(new ScrolledPane1());

    LineBorder line=new LineBorder(Color.black,2,true);
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
	System.out.println("Bicicleta");
	new MainActividades();
	dispose();
    }
}

}
 
 class ScrolledPane1 extends JPanel
{
    private JScrollPane vertical;
    private JTextArea console;

    public ScrolledPane1()
    {
        console = new JTextArea("La natacion es el movimiento y el desplazamiento \n a traves del agua mediante el uso de las \n extremidades corporales y por lo general sin utilizar \n ningun instrumento o apoyo para avanzar. \nSus usos principales son el buceo \n la pesca submarina, el salvamento acuatico \n la actividad ludica, el ejercicio y el deporte.\n La natacion es un deporte profesional. \n Las empresas patrocinan a los nadadores \n que estan en el nivel internacional \n aunque muchos nadadores compiten con el fin \n de representar a su pais de origen en los \n Juegos Olimpicos.\n Los premios en efectivo por batir marcas \n tambien se dan en muchas de las competiciones \n mas importantes \n Los nadadores profesionales tambien pueden \n ganarse la vida como artistas \n en el caso de la natacion sincronizada.",28,28);
		console.setFont(new Font("Serif",Font.PLAIN,15));
		console.setBackground(new Color(255,119,10));
		console.setPreferredSize(new Dimension(700,350));
        console.setEditable(false);
        vertical = new JScrollPane(console);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(vertical);
	}
}