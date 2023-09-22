package ejemploPoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException // NUNCA LANZAR EXCP EN EL MAIN
	{
		String nombre;
		String apellido1;
		String apellido2;
		Persona persona;
		PersonaService personaService = new PersonaService();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.printf("Cual es tu nombre?%n");
		nombre = reader.readLine();

		System.out.printf("Cual es tu primer apellido?%n");
		apellido1 = reader.readLine();

		System.out.printf("Cual es tu segundo apellido?%n");
		apellido2 = reader.readLine();

		persona = personaService.crearPersona(nombre, apellido1, apellido2);

		System.out.printf(personaService.devolverInfo(persona));
	}

}
