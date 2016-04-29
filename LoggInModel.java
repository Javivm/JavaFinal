import java.io.*;

public class LoggInModel{

	private Archivos archivo = new Archivos();

	public boolean checaUsuario(String username){
		return archivo.checaExiste(username+".txt");
	}

	/*FileInputStream in = null;
	FileOutputStream out = null;
	int c = 0;
	try{
	    in = new FileInputStream("input.txt");
	    out = new FileOutputStream("output.txt");
	}catch(FileNotFoundException e){
	    System.out.println("No existe el archivo");
	    System.exit(1);
	}
	try{
	    while((c = in.read()) != -1)
		out.write(c);
	}catch(IOException e){
	}
	finally{
	    try{
		if(in != null)
		    in.close();
		if(out != null)
		    out.close();
	    }catch(IOException e){

	    }
	}*/
}
