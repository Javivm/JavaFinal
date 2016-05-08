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


class DescBici extends JFrame{

   private JLabel actividades=new JLabel("CICLISMO");
	private Usuario datos;
	//CONSTRUCTOR
    public DescBici(Usuario datos){

        this.datos = datos;

        JButton regresar = new JButton("Regresar");
        JPanel content = new JPanel();
    	content.setBackground(new Color(200,200,200));  
    	actividades.setFont(new Font("Serif",Font.BOLD,80));
    	content.add(actividades);
    	content.add(new ScrolledPane2());
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

        regresar.addActionListener(new regresarListener());

    }
class regresarListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
	System.out.println("Carrera");
	new MainActividades(datos);
	dispose();
    }
}

}





class ScrolledPane2 extends JPanel
{
    private JScrollPane vertical;
    private JTextArea console;
    public ScrolledPane2()
    {
        console = new JTextArea("El ciclismo es un deporte en el que se utiliza\n una bicicleta para recorrer circuitos al aire libre\n en pista cubierta,o que engloba diferentes especialidades \n como las que se mencionan abajo \n El ciclismo de competicion es un deporte \n en el que se utilizan distintos tipos de bicicletas. \n Hay varias modalidades o disciplinas en el ciclismo \n de competicion como ciclismo en carretera \n ciclismo en pista, ciclismo de montana, trial, ciclocross \n BMX y dentro de ellas varias especialidades. \n El ciclismo de competicion es reconocido \n como un deporte olimpico. \n La Union Ciclista Internacional es el organismo \n gobernante mundial para el ciclismo y eventos \n internacionales de ciclismo de competicion.",28,28);
	console.setFont(new Font("Serif",Font.PLAIN,15));
        console.setBackground(new Color(255,119,10));
        console.setPreferredSize(new Dimension(700,350));
        console.setEditable(false);
        vertical = new JScrollPane(console);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(vertical);
    }
}