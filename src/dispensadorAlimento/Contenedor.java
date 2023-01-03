package dispensadorAlimento;

import java.util.ArrayList;

public class Contenedor {

    private String nombre;
    private ArrayList<Alimento> alimentosDisponibles = new ArrayList<Alimento>();

    public Contenedor(String nombre){
        this.setNombre(nombre);
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alimento> getAlimentosDisponibles() {
        return alimentosDisponibles;
    }

    public void setAlimentosDisponibles(ArrayList<Alimento> alimentosDisponibles) {
        this.alimentosDisponibles = alimentosDisponibles;
    }
}
