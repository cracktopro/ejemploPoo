package ejemploPoo;

public class PersonaService {

	public Persona crear(String nombre, String apellido1, String apellido2) {
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setApellido1(apellido1);
		persona.setApellido2(apellido2);

		return persona;
	}

	public String devolverInfo(Persona persona) {

		return String.format("Bienvenido, %s %s %s", persona.getNombre(), persona.getApellido1(),
				persona.getApellido2());
	}

}
