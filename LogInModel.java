import java.io.*;

public class LogInModel{

	private Archivos archivo = new Archivos();

	public boolean checaUsuario(String username){
		return archivo.checaExiste(username+".txt");
	}
}
