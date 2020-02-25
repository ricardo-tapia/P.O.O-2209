package ico.fes.poo;

/**
 *
 * @author 4dib
 */
public class IcoFesPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Vehiculo vehiculo = new Vehiculo();
    vehiculo.setMarca("Toyota");
    vehiculo.setLlan1(new Llanta("Negro", 205f, "Tornel"));
    vehiculo.setMot(new Motor ("Toyota", 128f, "combinado 17-19 km/l"));
  System.out.println(vehiculo.getMot().getMotor()); 
    }

}
