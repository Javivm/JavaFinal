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


public class Ayuda extends JFrame{

        private JLabel actividades=new JLabel("Ayuda");
     	private Usuario datos;   
        //CONSTRUCTOR
        public Ayuda(Usuario datos){
        
        this.datos=datos;

        JPanel content = new JPanel();
        JButton regresar = new JButton("Regresar");

        content.setBackground(new Color(200,200,200));  
        actividades.setFont(new Font("Serif",Font.BOLD,40));
        content.add(actividades);
        content.add(new ScrolledPaneAyuda());

        LineBorder line=new LineBorder(Color.black,2,true);

        content.add(regresar);
        regresar.setBackground(new Color(255,119,10));
        regresar.setBorder(line);


        this.setLocationRelativeTo(null);   
        this.setContentPane(content);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ayuda");
        this.setSize(500,700);

        regresar.addActionListener(new regresarListener());
    }
    
    class regresarListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
        new MainOpciones(datos);
        dispose();
        }
    }
}

 
 class ScrolledPaneAyuda extends JPanel
{
    private JScrollPane vertical;
    private JTextArea console;

    public ScrolledPaneAyuda()
    {
        console = new JTextArea("Programa desarrollado por:\n Armando Azar\n Santiago Menendez \n Luis Padilla \n Javier Vega \n Para la clase de Programacion Orientada a Objetos\n UNIVERSIDAD IBEROAMERICANA \n CIUDAD DE MEXICO a 9 Mayo del 2016\n Version alpha 5.2.7",28,28);
        console.setFont(new Font("Serif",Font.PLAIN,15));
        console.setBackground(new Color(255,119,10));
        console.setPreferredSize(new Dimension(700,350));
        console.setEditable(false);
        vertical = new JScrollPane(console);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(vertical);
    }
}