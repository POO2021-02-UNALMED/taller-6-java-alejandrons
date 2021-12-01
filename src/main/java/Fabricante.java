
package vehiculos;

import java.util.ArrayList;


public class Fabricante {
    private String nombre;
    private Pais pais;
    private int fabricaVentas;
    private static ArrayList<Fabricante> listaf;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        if(!listaf.contains(this)){
            listaf.add(this);
        }
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

    public int getFabricaVentas() {
        return fabricaVentas;
    }
    public static Fabricante fabricaMayorVentas(){
        int max = 0,ind=0;
        for(Fabricante f : listaf){
            if(f.getFabricaVentas()>max){
                max = f.getFabricaVentas();
                ind = listaf.indexOf(f);
            }
        }
        return listaf.get(ind);
    }
    
}
