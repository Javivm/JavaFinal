/**
 * Clase que guarda los atributos y 
 * actividades del usuario
 *
 * @author Armando Azar
 * @author Santiago Menendez
 * @author Luis Padilla
 * @author Javier Vega
 * @version %G%, %I%
 */

import java.util.*;
import java.lang.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Usuario
{
	private String nombre;
	private String nickname;
	private Calendar fecha;
	private String password;
	private String sexo;
	private float altura;
	private float peso;
	private String correo;
	private Calendar registro;
	//private Historial historial;

	/**
	 * Constructor de la clase
	 * 
	 * @param 
	 * @param 
	 */
	public Usuario(String nombre, String nickname, String fecha, String password, String sexo, float altura, float peso, String correo, String registro)
	{
		this.nombre = nombre;
		this.nickname = nickname;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.correo = correo;
		this.setFecha(fecha);
		this.setRegistro(registro);
		this.password = password;
		//this.historial = new Historial(nickname);
	}

	/**
	 * Metodo que modifica el nombre del usuario
	 * 
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * Metodo que regresa el nombre del usuario
	 * 
	 * @return el nombre del usuario
	 */
	public String getNombre()
	{
		return this.nombre;
	}

	/**
	 * Metodo que modifica el nickname del usuario
	 * 
	 */
	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	/**
	 * Metodo que regresa el nickname del usuario
	 * 
	 * @return el nickname del usuario
	 */
	public String getNickname()
	{
		return this.nickname;
	}

	/**
	 * Metodo que modifica la fecha de nacimiento del usuario
	 * 
	 */
	public void setFecha(String fecha)
	{
		this.fecha = Calendar.getInstance();

		StringTokenizer tokens = new StringTokenizer(fecha, "/"); //el formato es DD/MM/AAAA
		int dia = Integer.valueOf(tokens.nextToken());
		int mes = Integer.valueOf(tokens.nextToken());
		int ano = Integer.valueOf(tokens.nextToken());
		this.fecha.set(ano, mes, dia);
	}

	/**
	 * Metodo que regresa la edad del usuario
	 * 
	 * @return los anos del usuario
	 */
	public int getFecha()
	{
		Calendar now = Calendar.getInstance();

		int aTotal = now.get(Calendar.YEAR) - this.fecha.get(Calendar.YEAR);  //estos son los anos del usuario
		int mTotal = now.get(Calendar.MONTH) - this.fecha.get(Calendar.MONTH);  //si es negativo no ha cumplido
		int dTotal = now.get(Calendar.DAY_OF_MONTH) - this.fecha.get(Calendar.DAY_OF_MONTH);  //si es negativo no ha cumplido

		if(mTotal == 0)
			if(dTotal == 0 || dTotal > 0)
				aTotal++;
		else if(mTotal > 0)
			aTotal++;

		return aTotal;
	}

	/**
	 * Metodo que regresa la fecha de nacimiento
	 * 
	 * @return la fecha de nacimiento
	 */
	public String getFechaBien()
	{
		return Integer.toString(fecha.get(Calendar.DAY_OF_MONTH))+"/"+Integer.toString(fecha.get(Calendar.MONTH))+"/"+Integer.toString(fecha.get(Calendar.YEAR));
	}

	/**
	 * Metodo que modifica la password del usuario
	 * 
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Metodo que regresa la password del usuario
	 * 
	 * @return el nickname del usuario
	 */
	public String getPassword()
	{
		return this.password;
	}

	/**
	 * Metodo que modifica el sexo del usuario
	 * 
	 */
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}

	/**
	 * Metodo que regresa el sexo del usuario
	 * 
	 * @return el sexo del usuario
	 */
	public String getSexo()
	{
		return this.sexo;
	}

	/**
	 * Metodo que modifica la altura del usuario
	 * 
	 */
	public void setAltura(float altura)
	{
		this.altura = altura;
	}

	/**
	 * Metodo que regresa la altura del usuario
	 * 
	 * @return la altura del usuario
	 */
	public float getAltura()
	{
		return this.altura;
	}
	
	/**
	 * Metodo que modifica el peso del usuario
	 * 
	 */
	public void setPeso(float peso)
	{
		this.peso = peso;
	}

	/**
	 * Metodo que regresa el peso del usuario
	 * 
	 * @return el peso del usuario
	 */
	public float getPeso()
	{
		return this.peso;
	}

	/**
	 * Metodo que modifica el correo del usuario
	 * 
	 */
	public void setCorreo(String correo)
	{
		this.correo = correo;
	}

	/**
	 * Metodo que regresa el correo del usuario
	 * 
	 * @return el correo del usuario
	 */
	public String getCorreo()
	{
		return this.correo;
	}

	/**
	 * Metodo que modifica obtiene la fecha de registro del usuario
	 * 
	 */
	public void setRegistro(String fecha)
	{
		this.registro = Calendar.getInstance();
		StringTokenizer tokens = new StringTokenizer(fecha, "/"); //el formato es DD/MM/AAAA
		int dia = Integer.parseInt(tokens.nextToken());
		int mes = Integer.parseInt(tokens.nextToken());
		int ano = Integer.parseInt(tokens.nextToken());
		this.registro.set(ano, mes, dia);
	}

	/**
	 * Metodo que regresa la fecha en que se registro el usuario
	 * 
	 * @return la fecha de registro
	 */
	public String getRegistro()
	{
		return Integer.toString(this.registro.get(Calendar.DAY_OF_MONTH)) + "/" +
		Integer.toString(this.registro.get(Calendar.MONTH)) + "/" +
		Integer.toString(this.registro.get(Calendar.YEAR));
	}
}