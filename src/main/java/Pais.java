
package vehiculos;

public class Pais {
    private String nombre;
    private int paisVentas;

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void acumulaVentas(){
        this.paisVentas+=1;
    }
}
