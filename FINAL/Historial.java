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
import java.util.Scanner;

public class Historial
{
	ArrayList<Actividad> lista = new ArrayList<Actividad>();

	Historial(String usuario)
	{
		//abre el archivo del usuario
		Archivos archivo = new Archivo();  //se hace el objeto archivo
		String[] listaString = archivo.leeActividad(usuario);  //se manda llamar la funcion que regresa un String[] con las actividades
		//empieza a leer desde la linea 8
		//jala recursivamente un string que es cada una de las actividades
		//por cada sctring jalado se hace un tokenizer [4,8,2016,1,4.3,4.3,1935.0001]
		//dia,mes,ano,tipo,distancia,tiempo,calorias
		StringTokenizer tokens;
		Scanner scanner;
		int basura;
		for(int contador = 0 ; contador <20 ; contador++)
		{
			//aqui abrir el string y checar el tipo
			tokens = new StringTokenizer(listaString[contador], ",");
			scanner = new Scanner(listaString[contador]);
			basura = scanner.nextInt();  //dia
			basura = scanner.nextInt();  //mes
			basura = scanner.nextInt();  //ano

			switch(scanner.next())  //tipo
			{
				case 1:
					lista.add(new Bicicleta(tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken()));
					break;
				case 2:
					lista.add(new Caminata(tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken()));
					break;
				case 3:
					lista.add(new Carrera(tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken()));
					break;
				case 4:
					lista.add(new Eliptica(tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken()));
					break;
				case 5:
					lista.add(new Kayak(tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken()));
					break;
				case 6:
					lista.add(new Natacion(tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken(), tokens.nextToken()));
					break;
			}
		}
	}

	public String toString()
	{
		
	}
}
