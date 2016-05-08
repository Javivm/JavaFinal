

public class Calculadora{
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
	*/
	private static int edad, gender, peso;
	private static double maxBPM;
	private static String sexo;


	public static void main(String[] args){

		sexo = "Masculino";
		edad = 15;
		peso = 70;

		if(sexo.equals("Masculino")){
			gender = 4;
		}else{
			gender = 0;
		}

		maxBPM = (210 - ((double)edad / 2) - (0.05 * ((double)peso*.04536)) + gender) - 2;

		System.out.println(maxBPM);
	}

}