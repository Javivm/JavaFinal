import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.BigInteger;

public class MainCalculadora{
    public MainCalculadora(Usuario datos){
		Calculadora window = new Calculadora(datos);
		window.setVisible(true);
    }
}