import java.io.*;
import java.util.*;
import java.nio.file.Files;

public class Prueba{

	public static void main(String[] args) {
		List<String> lines = Files.readAllLines("meni.txt");
		lines.set(1, "hola");
		Files.write("meni.txt", lines); // You can add a charset and other options too
	}

}