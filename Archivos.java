/**
 * 
 * 
 * @author Armando Azar
 * @author Santiago Menendez
 * @author Luis Padilla
 * @author Javier Vega
 */

//CLASE PARA EL MANEJO DE ARCHIVOS Pureba

import java.io.*;

public class Archivos{
	
	private BufferedReader buffer;
	private FileInputStream file;
	private FileOutputStream out;

	//METODOS A IMPLEMENTAR UE PUEDEN SER UTILES
		//BUSCA Y COMPARA PALABRA

	//CHECAR SI EL ARCHIVO DESEADO EXISTE

	/**
	 * 
	 * 
	 * @author Armando Azar
	 * @author Santiago Menendez
	 * @author Luis Padilla
	 * @author Javier Vega
	 */
	public boolean checaExiste(String archivo){
		try{
			file = new FileInputStream(archivo);
		}catch(FileNotFoundException e){
			return false;
		}finally{
		    	try{
			if(file != null)
			    file.close();
		    }catch(IOException e){

		    }
		}
		return true;
	}

	public String leePassword(String archivo){
		int i = 0;
		try{
			file = new FileInputStream(archivo);			
		}catch(FileNotFoundException e){

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";
		try{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null){
				if(i == 2){
					return line;				
				}
				i++;
			}
		}catch(IOException e){

		}finally{
		    	try{
			if(file != null)
			    file.close();
		    }catch(IOException e){

		    }
		}
		return "";
	}

	//ESCRIBIR ARCHIVO
	//PARAMS: String[] argumentos, arreglo de argumentos en string que se desean escribir
	//PARAMS: int fileType, el tipo de rchivo qu se desea generar
			// fileType = 1, New User
	/**
	 * 
	 * 
	 * @author Armando Azar
	 * @author Santiago Menendez
	 * @author Luis Padilla
	 * @author Javier Vega
	 */
	public void escribeArchivo(String[] argumentos, int fileType){	

		String enterS = "\n";
		byte[] enterB = enterS.getBytes();
		if(fileType == 1){
			try{
				out = new FileOutputStream(argumentos[0]+".txt");	
			}catch(FileNotFoundException e){

			}
			try{
				for(int i = 0; i < 8; i++){
					byte[] cB = argumentos[i].getBytes();
					out.write(cB);
					out.write(enterB);
				}			
				if(out != null)
					out.close();	
			}catch(IOException e){

			}
		}
	}




































	/**
	 * Metodo que guarda una actividad en el archivo de historial del usuario
	 * 
	 * @param usuario el username del usuario
	 * @param actividad el string 
	 */
	public void guardaActividad(String usuario, String actividad)
	{
		BufferedWriter buffer = null;
 
		try
		{
			buffer = new BufferedWriter(new FileWriter(usuario + ".txt", true));
		    buffer.write(actividad);
		    buffer.newLine();
		    buffer.flush();
      	}
      	catch(IOException ioe)
      	{

      	}
      	finally
      	{
	    	if (buffer != null) 
	    		try
	    		{
	        		buffer.close();
     			}
     			catch (IOException ioe2)
     			{

     			}
    	}
	}

	/**
	 * Metodo que lee una actividad en el archivo de historial del usuario
	 * 
	 * @param usuario el username del usuario
	 */
	public String leeActividad(String usuario)
	{
		int i = 0;

		try
		{
			file = new FileInputStream(usuario + ".txt");
		}
		catch(FileNotFoundException e)
		{

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";

		try
		{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null)
			{
				if(i == 8)
					return line;
				i++;
			}
		}
		catch(IOException e)
		{

		}
		finally
		{	
			try
			{
				if(file != null)
			    	file.close();
		    }
		    catch(IOException e)
		    {

		    }
		}
		return "";
	}
}