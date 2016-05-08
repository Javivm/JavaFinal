

public class CalculadoraModel{
	/*
	Obtener peso * .4536
	Obtener Altura
	Obtener Gender (Masc = 5 Fem = 1)

	MaxBPM = 210 - (Age / 2) - (0.5 * weight) + Gender - 1

	Zone 1 = low value BPM * 0.5 high value BPM * 0.6 
	Zone 2 = low value BPM * 0.6 high value BPM * 0.7
	Zone 3 = low value BPM * 0.7 high value BPM * 0.8
	Zone 4 = low value BPM * 0.8 high value BPM * 0.9
	Zone 5 = low value BPM * 0.9 high value BPM * 0.95
	
	private static int edad, gender, peso;
	private static double maxBPM;
	private static String sexo;
	*/

	private static double maxBPM;
	private static int gender;

	public static double calculaBPM(int edad, int peso, String sexo){

		if(sexo.equals("Masculino")){
			gender = 4;
		}else{
			gender = 0;
		}

		maxBPM = (210 - ((double)edad / 2) - (0.05 * ((double)peso*.04536)) + gender) - 2;

		return maxBPM;
	}

	//0.5 0.6

	public static double[] calculaZona1(){

		double[] zonas = new double[2];

		zonas[0] = maxBPM * 0.5;
		zonas[1] = maxBPM * 0.6;

		return zonas;
	}

	public static double[] calculaZona2(){

		double[] zonas = new double[2];

		zonas[0] = maxBPM * 0.6;
		zonas[1] = maxBPM * 0.7;

		return zonas;
	}

	public static double[] calculaZona3(){

		double[] zonas = new double[2];

		zonas[0] = maxBPM * 0.6;
		zonas[1] = maxBPM * 0.7;

		return zonas;
	}

	public static double[] calculaZona4(){

		double[] zonas = new double[2];

		zonas[0] = maxBPM * 0.8;
		zonas[1] = maxBPM * 0.9;

		return zonas;
	}

	public static double[] calculaZona5(){

		double[] zonas = new double[2];

		zonas[0] = maxBPM * 0.9;
		zonas[1] = maxBPM * 0.95;

		return zonas;
	}
}