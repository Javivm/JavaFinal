import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.BigInteger;

public class MainResultados{
    public MainResultados(double maxBPN, double[] zone1, double[] zone2, double[] zone3, double[] zone4, double[] zone5){
		Resultados window = new Resultados(maxBPN, zone1, zone2, zone3, zone4, zone5);
		window.setVisible(true);
    }
}