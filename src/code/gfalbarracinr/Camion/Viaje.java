package code.gfalbarracinr.Camion;

public class Viaje {

    public Viaje (final Coordenada origen, final Coordenada destino){
        this.destino = destino;
        this.origen = origen;
    }

    public Coordenada obtenerDestino() {
        return destino;
    }

    public Coordenada obtenerOrigen() {
        return origen;
    }

    public double distancia(){
        return destino.calcularDistancia(origen);
    }

    private Coordenada origen;
    private Coordenada destino;

}
