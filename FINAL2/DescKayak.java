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


class DescKayak extends JFrame{

   private JLabel actividades=new JLabel("KAYAK");
	private Usuario datos;
	//CONSTRUCTOR
    public DescKayak(Usuario datos){

        this.datos = datos;

	JPanel content = new JPanel();
    JButton regresar = new JButton("Regresar");

	content.setBackground(new Color(200,200,200));  
	actividades.setFont(new Font("Serif",Font.BOLD,80));
	content.add(actividades);
	content.add(new ScrolledPane6());

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
	new MainActividades(datos);
	dispose();
    }
}

}

 
 class ScrolledPane6 extends JPanel
{
    private JScrollPane vertical;
    private JTextArea console;

    public ScrolledPane6()
    {
        console = new JTextArea("El kayak es una variedad de piragua de uno, dos \n o cuatro tripulantes cuyo uso es fundamentalmente \n deportivo. En su origen eran de un solo tripulante \n y se usaban para pescar y cazar. \n El tripulante o palista se acomoda sentado y orientado \n en direccion al avance, a diferencia de las \n embarcaciones de remo, propulsando la embarcacion \n mediante una pala de doble hoja o cuchara que \n no necesita de apoyo sobre el casco. \n Es una embarcacion larga (eslora) y estrecha (manga).\n En sus disenos tradicionales es de cubierta cerrada \n solo abierta en la 'banera' donde se situan el \n o los palistas. ",28,28);
		console.setFont(new Font("Serif",Font.PLAIN,15));
		console.setBackground(new Color(255,119,10));
		console.setPreferredSize(new Dimension(700,350));
        console.setEditable(false);
        vertical = new JScrollPane(console);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(vertical);
    }
}