
import java.io.*;

public class Prueba
{
	public static void main(String[] args)
	{
		Carrera carrera = new Carrera(1.4f, 5.6f, 70f);

		System.out.println(carrera.getTipo());
		System.out.println(carrera.getDia());
		System.out.println(carrera.getMes());
		System.out.println(carrera.getAno());
		System.out.println(carrera.getTiempo());
		System.out.println(carrera.getDistancia());
		System.out.println(carrera.getCalorias());

		System.out.println(carrera.toString());

		Archivos archivo = new Archivos();
		archivo.guardaActividad("Armando", carrera.toString());

		System.out.println(archivo.leeActividad("Armando"));
	}
}