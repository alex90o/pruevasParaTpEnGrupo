package practica;

public interface Actor {
String SERVIVO= "Es un Ser Vivo";
String MAQUINA= "Es una Maquina";
boolean ACTIVO= true;
boolean INACTIVO= false;
String informarQueEs();
boolean activarActor();
boolean desactivarActor();
}
