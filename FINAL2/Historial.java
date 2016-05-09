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
	Archivos arch = new Archivos();
	String[] act = new String[] { };
	int i;
	Usuario datos;

	Historial(String usuario, Usuario datos)
	{
		this.datos = datos;
		act = arch.leeActividad(usuario);
		//System.out.println(act.length);
		//System.out.println("a");
		String dia;
		String mes;
		String ano;
		String tiempo;
		String distancia;
		String tipo;
		String calorias;
		StringTokenizer tokens;

		System.out.println("gola");

		for(i = 0; i < act.length - 3; i++){
			if(act[i] != null){
				//aqui abrir el string y checar el tipo

				tokens = new StringTokenizer(act[i], ",");

				dia = tokens.nextToken();
				mes = tokens.nextToken();
				ano = tokens.nextToken();
				tiempo = tokens.nextToken();
				distancia = tokens.nextToken();
				tipo = tokens.nextToken();
				calorias = tokens.nextToken();

				System.out.println(act.length);

				System.out.println(dia+mes+ano+tiempo+distancia+tipo+calorias);

				System.out.println(tipo);

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
				System.out.println(act[i]);
				System.out.println(i);
			}
		}
	}

	public void recibe(Actividad actividad)
	{
		Archivos archivo = new Archivos();
		//4,8,2016,1,4.3,4.3,1935.0001

		//guardar el archivo
		archivo.guardaActividad(datos.getNickname(), actividad.getCSV());
		//agregarlo a la lista
		lista.add(actividad);
	}
}