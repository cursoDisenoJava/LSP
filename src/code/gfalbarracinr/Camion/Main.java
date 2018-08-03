package code.gfalbarracinr.Camion;

public class Main {

    public static void  main (String args[]){

        Camion camion = new Camion(DISTANCIA_INICIAL, "ABC123");
        //Camion camion = new SubCamion(DISTANCIA_INICIAL, "ABC123");
        camion.añadirViaje(
                new Viaje(
                    new Coordenada(0, 0),
                    new Coordenada(20, 0)
        ));

        if (camion.obtenerOdometro() == DISTANCIA_INICIAL){
            System.out.println("Odemetro es correcto");
        } else{
            System.out.println("El odometro ha sido cambiado");
        }

    }

    public static final double  DISTANCIA_INICIAL = 10000;
}
