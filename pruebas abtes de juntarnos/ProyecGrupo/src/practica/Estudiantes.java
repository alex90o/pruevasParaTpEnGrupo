package practica;

public class Estudiantes extends Persona {
private int legajo;
private String carrera;
private int materiasAprovadas;
private int materiaTotales;

//Constructores -- falta ver si le agregamos mas metodos o atrubutos
public Estudiantes() {
	
}

public Estudiantes(int dni, String nombre, String apellido, int edad, String direccion, int legajo, String carrera,
		int materiasAprovadas, int materiaTotales) {
	super(dni, nombre, apellido, edad, direccion);
	this.legajo = legajo;
	this.carrera = carrera;
	this.materiasAprovadas = materiasAprovadas;
	this.materiaTotales = materiaTotales;
}

}
