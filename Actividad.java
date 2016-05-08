/**
 * Clase abstracta la cual define los atributos y 
 * metodos de las actividades.
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

public abstract class Actividad
{
	private Calendar fecha;
	private float tiempo;
	private float distancia;
	private int tipo;
	protected float calorias;

	/**
	 * Constructor de la clase
	 * 
	 * @param tiempo el tiempo de la actividad
	 * @param distancia la distancia de la actividad
	 */
	public Actividad(float tiempo, float distancia, int tipo)
	{
		this.tipo = tipo;
		this.setFecha();
		this.setTiempo(tiempo);
		this.setDistancia(distancia);
	}

	/**
	 * Metodo que obtiene el tipo de acividad que es
	 * 
	 * @return el tipo de actividad que es
	 */
	public int getTipo()
	{
		return tipo;
	}

	/**
	 * Metodo que obtiene la fecha en la que se realizo una actividad
	 * 
	 */
	public void setFecha()
	{
		this.fecha = Calendar.getInstance();
	}

	/**
	 * Metodo que regresa el dia en que se realizo la actividad
	 * 
	 * @return el dia de la actividad
	 */
	public int getDia()
	{
		return fecha.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * Metodo que regresa el mes en la que se realizo la actividad
	 * 
	 * @return el mes de la actividad
	 */
	public int getMes()
	{
		return fecha.get(Calendar.MONTH);      // 0-11
	}

		/**
	 * Metodo que regresa el ano en el que se realizo una actividad.
	 * 
	 * @return el ano de la actividad
	 */
	public int getAno()
	{
		return fecha.get(Calendar.YEAR);
	}

	/**
	 * Metodo que obtiene el tiempo total de una actividad.
	 * 
	 * @param tiempo el tiempo de la actividad
	 */
	public void setTiempo(float tiempo)
	{
		//El formato es HH.MM
		this.tiempo = tiempo;
	}

	/**
	 * Metodo que regresa el tiempo total de una actividad.
	 * 
	 * @return el tiempo de la actividad
	 */
	public float getTiempo()
	{
		return this.tiempo;
	}

	/**
	 * Metodo que obtiene la distancia recorrida en una actividad.
	 * 
	 * @param distancia el numero de kilometros
	 */
	public void setDistancia(float distancia)
	{
		//El formato es KK.MM
		this.distancia = distancia;
	}

	/**
	 * Metodo que regresa la distancia recorrida en una actividad.
	 * 
	 * @return la distancia de la actividad
	 */
	public float getDistancia()
	{
		return this.distancia;
	}

	/**
	 * Metodo que calcula a cantidad de calorias quemadas en una actividad.
	 * 
	 * @param calorias las calorias de la actividad
	 */
	abstract void setCalorias(float calorias);

	/**
	 * Metodo que regresa la cantidad de calorias quemadas en una actividad.
	 * 
	 * @return las calorias de la actividad
	 */
	public float getCalorias()
	{
		return this.calorias;
	}

	/**
	 * Metodo que regresa un string con todos los valores de la actividad
	 * 
	 * @return el string con los valores
	 */
	public String toString()
	{
		return Integer.toString(getMes())+ "," +
		Integer.toString(getDia())+ "," +
		Integer.toString(getAno())+ "," +
		Integer.toString(getTipo())+ "," +
		Float.toString(getTiempo())+ "," +
		Float.toString(getDistancia())+ "," +
		Float.toString(getCalorias());
	}
}