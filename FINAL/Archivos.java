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

	/**
	 * Metodo que escribe los datos del registro del usuario en un archivo
	 * 
	 * @param argumentos los argumentos que se van a guardar en el archivo
	 * @param fileType el tipo de archivo que se va a guardar
	 */
	public void escribeArchivo(String[] argumentos){	

		String enterS = "\n";
		byte[] enterB = enterS.getBytes();

		try{
			out = new FileOutputStream(argumentos[1]+".txt");	
		}catch(FileNotFoundException e){

		}
		try{
			for(int i = 0; i < 9; i++){
				byte[] cB = argumentos[i].getBytes();
				out.write(cB);
				out.write(enterB);
			}			
			if(out != null)
				out.close();	
		}catch(IOException e){

		}
	}

















	/**
	 * Metodo lee el nombre del usuario desde un archivo
	 * 
	 * @param usuario el username del usuario
	 */
	public String leeNombre(String usuario)
	{
		int i = 0;
		try
		{
			file = new FileInputStream(usuario + ".txt");			
		}catch(FileNotFoundException e)
		{

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";
		try
		{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null)
			{
				if(i == 0)
				{
					return line;				
				}
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

	/**
	 * Metodo lee el nickname del usuario
	 * 
	 * @param usuario el username del usuario
	 */
	public String leeNickname(String usuario)
	{
		int i = 0;
		try
		{
			file = new FileInputStream(usuario + ".txt");			
		}catch(FileNotFoundException e)
		{

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";
		try
		{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null)
			{
				if(i == 1)
				{
					return line;				
				}
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

	/**
	 * Metodo lee la contrasena del usuario
	 * 
	 * @param usuario el username del usuario
	 */
	public String leePassword(String usuario)
	{
		int i = 0;
		try
		{
			file = new FileInputStream(usuario + ".txt");			
		}catch(FileNotFoundException e)
		{

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";
		try
		{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null)
			{
				if(i == 2)
				{
					return line;				
				}
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

	/**
	 * Metodo lee la fecha de nacimiento del usuario
	 * 
	 * @param usuario el username del usuario
	 */
	public String leeFecha(String usuario)
	{
		int i = 0;
		try
		{
			file = new FileInputStream(usuario + ".txt");			
		}catch(FileNotFoundException e)
		{

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";
		try
		{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null)
			{
				if(i == 3)
				{
					return line;				
				}
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

	/**
	 * Metodo lee el genero del usuario
	 * 
	 * @param usuario el username del usuario
	 */
	public String leeGenero(String usuario)
	{
		int i = 0;
		try
		{
			file = new FileInputStream(usuario + ".txt");			
		}catch(FileNotFoundException e)
		{

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";
		try
		{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null)
			{
				if(i == 4)
				{
					return line;				
				}
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

	/**
	 * Metodo lee la altura del usuario
	 * 
	 * @param usuario el username del usuario
	 */
	public String leeAltura(String usuario)
	{
		int i = 0;
		try
		{
			file = new FileInputStream(usuario + ".txt");			
		}catch(FileNotFoundException e)
		{

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";
		try
		{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null)
			{
				if(i == 5)
				{
					return line;				
				}
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

	/**
	 * Metodo lee el peso del usuario
	 * 
	 * @param usuario el username del usuario
	 */
	public String leePeso(String usuario)
	{
		int i = 0;
		try
		{
			file = new FileInputStream(usuario + ".txt");			
		}catch(FileNotFoundException e)
		{

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";
		try
		{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null)
			{
				if(i == 6)
				{
					return line;				
				}
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

	/**
	 * Metodo lee el peso del usuario
	 * 
	 * @param usuario el username del usuario
	 */
	public String leeCorreo(String usuario)
	{
		int i = 0;
		try
		{
			file = new FileInputStream(usuario + ".txt");			
		}catch(FileNotFoundException e)
		{

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";
		try
		{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null)
			{
				if(i == 7)
				{
					return line;				
				}
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

	/**
	 * Metodo lee el peso del usuario
	 * 
	 * @param usuario el username del usuario
	 */
	public String leeRegistro(String usuario)
	{
		int i = 0;
		try
		{
			file = new FileInputStream(usuario + ".txt");			
		}catch(FileNotFoundException e)
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
				{
					return line;				
				}
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
	public String[] leeActividad(String usuario)
	{
		int i = 0, j = 0;

		try
		{
			file = new FileInputStream(usuario + ".txt");
		}
		catch(FileNotFoundException e)
		{

		}

		InputStreamReader isr = new InputStreamReader(file);
		String line = "";
		String[] actividades = new String[20];

		try
		{
			buffer = new BufferedReader(isr);
			while((line = buffer.readLine()) != null)
			{
				if(i > 8){
					actividades[j] = line;
					j++;
				}
				i++;
			}
			return actividades;
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
		return null;
	}
}