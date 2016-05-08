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
import java.util.StringTokenizer;

public class Historial
{
	ArrayList<Actividad> lista = new ArrayList<Actividad>();

	Historial(String usuario)
	{
		//abre el archivo del usuario
		Archivos archivo = new Archivos();  //se hace el objeto archivo
		String[] listaString = archivo.leeActividad(usuario);  //se manda llamar la funcion que regresa un String[] con las actividades
		//empieza a leer desde la linea 8
		//jala recursivamente un string que es cada una de las actividades
		//por cada sctring jalado se hace un tokenizer [4,8,2016,1,4.3,4.3,1935.0001]
		//dia,mes,ano,tipo,distancia,tiempo,calorias

		String dia;
		String mes;
		String ano;
		String tiempo;
		String distancia;
		String tipo;
		String calorias;

		StringTokenizer tokens;
		int size = listaString.length;
		for(int contador = 0 ; contador < size ; contador++)
		{
			//aqui abrir el string y checar el tipo
			tokens = new StringTokenizer(listaString[contador], ",");

			mes = tokens.nextToken();
			dia = tokens.nextToken();
			mes = tokens.nextToken();
			ano = tokens.nextToken();
			tiempo = tokens.nextToken();
			distancia = tokens.nextToken();
			tipo = tokens.nextToken();
			calorias = tokens.nextToken();


			switch(Integer.parseInt(tipo)) //tipo
			{
				case 1:
					lista.add(new Bicicleta(dia, mes, ano, tiempo, distancia, tipo, calorias));
					break;
				case 2:
					lista.add(new Caminata(dia, mes, ano, tiempo, distancia, tipo, calorias));
					break;
				case 3:
					lista.add(new Carrera(dia, mes, ano, tiempo, distancia, tipo, calorias));
					break;
				case 4:
					lista.add(new Eliptica(dia, mes, ano, tiempo, distancia, tipo, calorias));
					break;
				case 5:
					lista.add(new Kayak(dia, mes, ano, tiempo, distancia, tipo, calorias));
					break;
				case 6:
					lista.add(new Natacion(dia, mes, ano, tiempo, distancia, tipo, calorias));
					break;
			}
		}
	}
}
