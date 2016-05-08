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

	Historial(String usuario)
	{
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

		for(i = 0; i < act.length - 3; i++){
			if(act[i] != null){
				//aqui abrir el string y checar el tipo

				tokens = new StringTokenizer(act[i], ",");

				dia = tokens.nextToken();
				mes = tokens.nextToken();
				ano = tokens.nextToken();
				tipo = tokens.nextToken();
				tiempo = tokens.nextToken();
				distancia = tokens.nextToken();
				calorias = tokens.nextToken();

				System.out.println(dia+mes+ano+tipo+tiempo+distancia+calorias);

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
			}
		}
	}

	public void setDia(String dia)
	{
		this.dia = dia;
	}
	public int getDia()
	{
		return Integer.parseInt()
	}
	public void setMes(String mes)
	{
		this.mes = mes;
	}
	public int getMes(){}
	public void setAno(String ano)
	{
		this.ano = ano;
	}
	public int getAno(){}
	public void setTiempo(String tiempo)
	{
		this.tiempo = tiempo;
	}
	public float getTiempo(){}
	public void setDistancia(String distancia)
	{
		this.distancia = distancia;
	}
	public float getDistancia(){}
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	public int getTipo(){}
	public void setCalorias(String calorias)
	{
		this.calorias = calorias;
	}
	public float getCalorias(){}
}