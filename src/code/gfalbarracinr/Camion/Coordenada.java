package code.gfalbarracinr.Camion;

public class Coordenada {

    public Coordenada(final int latitud, final int longitud){
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int obtenerLatitud() {
        return latitud;
    }

    public int obtenerLongitud() {
        return longitud;
    }

    public double calcularDistancia (Coordenada punto){
        return Math.sqrt(Math.pow(latitud, 2) - Math.pow(punto.obtenerLatitud(), 2) -
                         Math.pow(longitud, 2) - Math.pow(punto.obtenerLongitud(), 2));
    }
    private int latitud;
    private int longitud;
}
