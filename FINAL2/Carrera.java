/**
 * Subclase de Actividad la cual define especificamente 
 * como calcular las calorias para una carrera.
 *
 * @author Armando Azar
 * @author Santiago Menendez
 * @author Luis Padilla
 * @author Javier Vega
 * @version %G%, %I%
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Carrera extends Actividad
{
	/**
	 * Costructor de la clase 
	 * 
	 * @param tiempo el tiempo de la actividad
	 * @param distancia la distancia de la actividad
	 * @param peso el peso del usuario
	 */
	public Carrera(float tiempo, float distancia, float peso)
	{
		super(tiempo, distancia, 3);
		this.setCalorias(peso);
	}

	/**
	 * Costructor que se usa cuando se quiere crear una actividad nueva desde un archivo
	 * 
	 * @param fecha la fecha de la actividad
	 * @param tiempo el tiempo de la actividad
	 * @param distancia la distancia de la actividad
	 * @param tipo el tipo de actividad
	 * @param calorias las calorias quemadas
	 */
	public Carrera(String dia, String mes, String ano, String tiempo, String distancia, String tipo, String calorias)
	{
		super(dia, mes, ano, tiempo, distancia, tipo, calorias);
	}

	/**
	 * Metodo que calcula a cantidad de calorias quemadas en una actividad.
	 * 
	 * @param peso el peso del usuario
	 */
	void setCalorias(float peso)
	{
		float tiempo = getTiempo();
		this.calorias = peso * 7.6f * tiempo;
	}
}