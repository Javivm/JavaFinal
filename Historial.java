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

public class Historial
{
	List<Actividad> listaActividades = new ArrayList<Actividad>();

	/**
	 * Metodo 
	 * 
	 */
	public void setHistorial()
	{
		StringTokenizer tokens = new StringTokenizer(actividad, ",");


		int dia = Integer.valueOf(tokens.nextToken());
		int mes = Integer.valueOf(tokens.nextToken());
		int ano = Integer.valueOf(tokens.nextToken());
		this.fecha.set(ano, mes, dia, 0, 0, 0);

		this
		//4,7,2016,3,1.4,5.6,744.8
		//dia,mes,ano,tipoact,tiempo,distancia,calorias
					String[] fields = new String[8];
			fields[0] = nombreTF.getText();
			fields[1] = nicknameTF.getText();
			fields[2] = passwordTF.getText();
			fields[3] = edadTF.getText();
			if(mascRB.isSelected() == true)
				fields[4] = "Masculino";
			if(femRB.isSelected() == true)
				fields[4] = "Femenino";
			fields[5] = alturaTF.getText();
			fields[6] = pesoTF.getText();
			fields[7] = emailTF.getText();
	}

	/**
	 * Metodo 
	 * 
	 * @return el dia de la actividad
	 */
	public void getHistorial()
	{
		
	}
}