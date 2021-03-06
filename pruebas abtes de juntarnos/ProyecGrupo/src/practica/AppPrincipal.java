package practica;
import java.util.ArrayList;
public class AppPrincipal {

	public static void main(String[] args) {
		//estudiante
		System.out.println("**Persona Estudiante***");
		Persona perE= new Estudiantes(35664, "Pedro", "Lopez", 25, "Cordoba 349", 101123, "Comunicación Social", 15, 20);
		if(perE.activarActor()) {
			System.out.println("Actor Estudiante Activo");
			}
			else {
				System.out.println("Actor Estudiante INactivo");
			}
		System.out.println(perE.informarQueEs());
		System.out.println(perE.saludar());
		System.out.println(perE.aprender());
		System.out.println(perE.toString());
		
		System.out.println();
		System.out.println("**********************************");
		System.out.println("**Estudiante Estudiante***");
		Estudiantes estudy1 = new Estudiantes(935664, "JAsinto", "Gonzalez", 20, "9 de julio 1387", 234324, "Ingeniería en Mecatrónica", 18, 40);
		if(estudy1.activarActor()) {
			System.out.println("Actor Estudiante Activo");
			}
			else {
				System.out.println("Actor Estudiante INactivo");
			}
		System.out.println(estudy1.informarQueEs());
		System.out.println(estudy1.saludar());
		System.out.println(estudy1.aprender());
		System.out.println(estudy1.toString());
		
		//estudy1.CalcularPorcentaje();
		System.out.println(estudy1.informarPorcentaje());
		estudy1.aprobarMateria();
		System.out.println(estudy1.getMateriasAprobadas());
		System.out.println(estudy1.informarPorcentaje());
		//System.out.println("Porcentaje con la funcion calculaPorcentaje es : " + estudy1.CalcularPorcentaje());
		estudy1.aprobarMateria();
		estudy1.aprobarMateria();
		estudy1.aprobarMateria();
		System.out.println(estudy1.getMateriasAprobadas());
		System.out.println(estudy1.informarPorcentaje());
		
		System.out.println(estudy1.toString());
		
		//profesor
		System.out.println();
		System.out.println("**********************************");
		System.out.println("**profesor***");
		Profesor profe1 = new Profesor();
		profe1.setDni(54654);
		profe1.setNombre("Carlos");
		profe1.setApellido("Flores");
		profe1.setEdad(45);
		profe1.setDireccion("Las Tacureas 267");
		profe1.setSueldoBasico(20000);
		profe1.setAntiguedad(10);
		ArrayList<String> listadoMaterias = new ArrayList<>();
		profe1.setListaDeMaterias(listadoMaterias);
		System.out.println("Las Cantidad de materias agregadas es "+profe1.informarCantMaterias());
		profe1.setTitulo("Profesorado de Historia");
		profe1.agregarMateria("Historia Argentina");
		profe1.agregarMateria("Historia Hispanoamericana");
		profe1.agregarMateria("Histtoria Europea");
		profe1.agregarMateria("PreHistoria");
		profe1.agregarMateria("Ciencia Sociales");
		System.out.println();
		System.out.println("Despues de agrgar materias");
		System.out.println("Las Cantidad de materias agregadas es "+profe1.informarCantMaterias());
		System.out.println(profe1.enseniar());
		System.out.println(profe1.toString());
		System.out.println("El sueldo de "+ profe1.nombre+ " "+profe1.apellido+ " "+"es $"+profe1.calcularSueldo());
		System.out.println(profe1.toString());
	}

}
