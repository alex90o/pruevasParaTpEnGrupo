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

//Set y Get
public int getLegajo() {
	return legajo;
}

public void setLegajo(int legajo) {
	this.legajo = legajo;
}

public String getCarrera() {
	return carrera;
}

public void setCarrera(String carrera) {
	this.carrera = carrera;
}

public int getMateriasAprovadas() {
	return materiasAprovadas;
}

public void setMateriasAprovadas(int materiasAprovadas) {
	this.materiasAprovadas = materiasAprovadas;
}

public int getMateriaTotales() {
	return materiaTotales;
}

public void setMateriaTotales(int materiaTotales) {
	this.materiaTotales = materiaTotales;
}

//metodos de estdiante
public void aprobarMateria() {
	if((this.materiaTotales-this.materiasAprovadas)>0) {
		this.materiasAprovadas++;
	}
	//else { 
	//	System.out.println("No puede aprobar mas materias ya aprobo todas las maaterias");
	//}
	
}

public double CalcularPorcentaje() {
	return ((this.materiasAprovadas*this.materiaTotales)/100);
}

public String informarPorcentaje() {
	return ("El procentaje aprobado es: "+this.CalcularPorcentaje()+"%");
}

//toString()
@Override
public String toString() {
	return "Estudiantes [legajo=" + legajo + ", carrera=" + carrera + ", materiasAprovadas=" + materiasAprovadas
			+ ", materiaTotales=" + materiaTotales + "]";
}



}
