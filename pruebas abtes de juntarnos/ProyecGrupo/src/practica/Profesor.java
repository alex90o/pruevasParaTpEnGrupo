package practica;

import java.util.ArrayList;

public class Profesor extends Persona {
private double sueldo;
private int antiguadad;
private String titulo;
private ArrayList<String>listaDeMaterias;
public double calcularSueldo()
{
	return sueldo; //falta terminar
};
public int informarCantMaterias() {
	return this.listaDeMaterias.size();
}
public void agregarMateria(String materia) {
	this.listaDeMaterias.add(materia);
}
public String enseniar() {
	return "Dando clases";
}


}
