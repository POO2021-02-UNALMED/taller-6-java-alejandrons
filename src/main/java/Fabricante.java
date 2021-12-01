
package vehiculos;


public class Fabricante {
    private String nombre;
    private Pais pais;
    private int fabricaVentas;

    public Fabricante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public void generarVenta(){
        this.fabricaVentas +=1;
    }
    
}
