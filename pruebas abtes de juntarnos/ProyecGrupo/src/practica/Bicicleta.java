package practica;
//esta class es una que hicimos en clases le falta agregar nuestro metodos y atributos
public class Bicicleta {
//atributos
private float velocidadActual;
private int platoActual;
private int pinionActual;

public Bicicleta(float velo, int pla, int pin) {
    velocidadActual = velo;
    platoActual = pla;
    pinionActual = pin;
}
public Bicicleta() {

}
public float getVelocidadActual() {
    return velocidadActual;
}
//metodos
public void informar() {
    System.out.println("La velocidad actual es de " + velocidadActual + ", platos " + platoActual + " y pinion " + pinionActual);
}
public void acelerar() {
    velocidadActual*=2;
    System.out.println("Acelerando " + velocidadActual);
}
public void frenar() {
    velocidadActual/=2;
    System.out.println("frenando " + velocidadActual);
}
public void cambiarPlato(int plato) {
    platoActual = plato;
    System.out.println("Actualizamos el/los platos a " 
    + platoActual);
}
public void cambiarPinion(int pinion) {
    pinionActual = pinion;
    System.out.println("Actualizamos los piniones a "
            + pinionActual);
}
}
