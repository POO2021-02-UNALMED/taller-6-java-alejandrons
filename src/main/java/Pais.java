
package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int paisVentas = 0;
    private static ArrayList<Pais> lista = new ArrayList();

    public Pais(String nombre) {
        this.nombre = nombre;
        lista.add(this);
        
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

    public int getPaisVentas() {
        return paisVentas;
    }
    
    public static Pais paisMasVendedor(){
        int max = 0,ind=0;
        for(Pais p : lista){
            if(p.getPaisVentas()>max){
                max = p.getPaisVentas();
                ind = lista.indexOf(p);
            }
        }
        return lista.get(ind);
    }
}
