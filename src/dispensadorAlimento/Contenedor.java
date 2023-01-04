package dispensadorAlimento;

import java.util.ArrayList;

public class Contenedor {

    private String nombre;
    private ArrayList<Alimento> alimentosDisponibles = new ArrayList<Alimento>();

    public Contenedor(String nombre){
        this.setNombre(nombre);
    }


    public void agregarAlimento(Alimento objAlimento){
        alimentosDisponibles.add(objAlimento);
    }


    public void quitarAlimento(String nombreAlimento, NIño niño){
        if(niño.getCantDulces() <= 5){
            for (int contador= 0; contador < alimentosDisponibles.size(); contador++ ){
                if(alimentosDisponibles.get(contador).getNombre().equals(nombreAlimento)){
                    alimentosDisponibles.remove(contador);
                }
            }
        }

    }
    public void quitarAlimento(String nombreAlimento){
        for (int contador= 0; contador < alimentosDisponibles.size(); contador++ ){
            if(alimentosDisponibles.get(contador).getNombre().equals(nombreAlimento)){
                alimentosDisponibles.remove(contador);
            }
        }
    }

    //GET AND SETTER
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
