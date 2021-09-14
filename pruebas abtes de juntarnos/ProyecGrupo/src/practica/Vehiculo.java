package practica;

import java.util.function.DoubleUnaryOperator;

public class Vehiculo implements ObjetoInerte, Actor {
    protected String duenio;
    protected int cantRuedas;
    protected String color;
    protected String marca;
    protected int anio;
    protected String modelo;
    protected float velocidad;
    protected int asientos;
    protected int asientosDisponibles;
    protected int asientosOcupados;

    //contructores // sobre carga de contructores cuando hay mas de uno
    public Vehiculo() {

    };
    
    public Vehiculo(String duenio, int cantidadDeRuedas, int anio, String color, String marca, String modelo, float velocidad, int asientos, int asientosDisponibles, int asientosOcupados){
        this.duenio = duenio;
        this.cantRuedas = cantidadDeRuedas;
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.asientos = asientos;
        this.asientosDisponibles = asientosDisponibles;
        this.asientosOcupados = asientosOcupados;
    }

    public Vehiculo(String duenio, int anio, String color, String marca, String modelo, int asientos){
        this.duenio = duenio;
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.asientos = asientos;
        this.asientosDisponibles = asientos;
        this.asientosOcupados = 0;
    }
    
   
    //Set y Get
    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int cantidadDeRuedas() {
        return cantRuedas;
    }

    public void setCantidadDeRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
    
    public String getDuenio() {
        return duenio;
    }
    
    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAsientos() {
        return asientos;
    }
    
    public void setAsientos (int asientos) {
        this.asientos = asientos;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }
    
    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }
    
    public void setAsientosOcupados (int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }

    // Set to
    @Override
    public String toString() {
	    return "Vehiculo [Duenio = " + duenio + ", cantidad de ruedas = " + cantRuedas + ", color = " + color + ", marca = " + marca + ", año = " + anio + ", modelo = " + modelo + ", velocidad = " + velocidad + ", asientos = " + asientos + ", asientos disponibles = " + asientosDisponibles + ", asientos ocupados = " + asientosOcupados + "]";
    }

    //ahora saco los atributos, los pongo para guiarme
   //DALE  a lo de la interface todavia por las dudas no hay que ahcerlo todavia no la creamos o ya la hicite a 
   // objeto inerte?
    //metodos de la interface-- objeto inerte -- REVISAR
    @Override
    public boolean esInerte() {
	    return true;
    }

    @Override
    public boolean esNatural() {
	    return false;
	}

    @Override
    public boolean esArtificial() {
        return true;
    }

    @Override
    public String informar() {
        return INERTE;
    }

     //metodos de la interface ACTOR
    @Override
    public String informarQueEs() {
	    return MAQUINA;
    }
    @Override
    public boolean activarActor() {
	    return Vehiculo.ACTIVO;
	}
    @Override
    public boolean desactivarActor() {
        return Vehiculo.INACTIVO;
    }

    //METODOS CREADOS POR NOSOTROS 

       /* public Void informarVelocidad() {
        System.out.println("La velocidad es de " + this.velocidad);
    }
    */

    public float Velocidad() {
        return(velocidad);
    }
    public String informarVelocidad() {
        return("La velocidad maxima es " +velocidad);
    }
    public void acelerar() {
        velocidad*=2;
        System.out.println("Acelerando. Velocidad actual: " + velocidad);        
    }
    
    public void frenar() {
        velocidad/=2;
        System.out.println("Frenando. Velocidad actual: " + velocidad);
    }
    
    public boolean disponibilidad() {
        if asientosDisponibles > 0 {
            System.out.println("Hay asientos disponibles: " + asientosDisponibles + " y asientos ocupados: " + asientosOcupados);
        }
        if asientosOcupados == asientos or asientosDisponibles == 0 {
            System.out.println("No hay asientos disponibles, están todos ocupados.");
        }
    }


}
