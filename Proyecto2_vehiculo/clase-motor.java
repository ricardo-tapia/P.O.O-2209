package ico.fes.poo;

/**
 *
 * @author 4dib
 */
public class Motor {
    private String marca;
    private float potencia;
    private String rendimiento;

    

    public Motor(String marca, float potencia, String rendimiento) {
        this.marca = marca;
        this.potencia = potencia;
        this.rendimiento = rendimiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }    
   
}
