/**
 * 
 * 
 * @author Armando Azar
 * @author Santiago Menendez
 * @author Luis Padilla
 * @author Javier Vega
 */

import java.io.*;

public class LogInModel{

	private Archivos archivo = new Archivos();

	public boolean checaUsuario(String username){
		return archivo.checaExiste(username+".txt");
	}

	public String leePassword(String username){
		return archivo.leePassword(username+".txt");
	}
}
