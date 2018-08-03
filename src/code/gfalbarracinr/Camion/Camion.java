package code.gfalbarracinr.Camion;

import java.util.ArrayList;
import java.util.List;


public class Camion {

    public Camion (final double odometro, final String plato){

        this.odometro = odometro;
        this.plato = plato;
        viajes = new ArrayList<>();
    }

    public final double obtenerOdometro(){
        return this.odometro;
    }

    public final String obtenerPlato(){
        return this.plato;
    }

    public final List<Viaje> obtenerViajes(){

        return new ArrayList<>(viajes);
    }

    public final void añadirViaje (final Viaje viaje){
        viajes.add(viaje);
    }

    private List<Viaje> viajes;
    private double odometro;
    private String plato;



}
