package code.gfalbarracinr.Camion;

public class SubCamion extends Camion {
    public SubCamion( final double odometro, final String plato ){
        super(odometro, plato);
    }

     /* public void añadirViaje(Viaje viaje){
        super.añadirViaje(viaje);
        // Esta clase no se puede sobreescribir ya que en la
        // clase padre la función es final, asegurando el
        // cumplimiento del principio de Liskov


     }
     */
}
