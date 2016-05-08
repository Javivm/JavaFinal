/**
 * Subclase de Actividad la cual define especificamente 
 * como calcular las calorias para una actividad en kayak.
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

public class Kayak extends Actividad
{
	/**
	 * Costructor de la clase 
	 * 
	 * @param tiempo el tiempo de la actividad
	 * @param distancia la distancia de la actividad
	 * @param peso el peso del usuario
	 */
	public Kayak(float tiempo, float distancia, float peso)
	{
		super(tiempo, distancia, 5);
		this.setCalorias(peso);
	}

	/**
	 * Metodo que calcula a cantidad de calorias quemadas en una actividad.
	 * 
	 * @param peso el peso del usuario
	 */
	void setCalorias(float peso)
	{
		float tiempo = getTiempo();
		this.calorias = peso * 5.7f * tiempo;
	}
}