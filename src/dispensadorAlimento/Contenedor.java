package dispensadorAlimento;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Contenedor {

    private String nombre;
    private ArrayList<Alimento> alimentosDisponibles = new ArrayList<Alimento>();

    public Contenedor(String nombre){
        this.nombre = nombre;
    }


    public void agregarAlimento(Alimento objAlimento){
        AtomicBoolean existeAlimento= new AtomicBoolean(false);

        alimentosDisponibles.forEach( alimentoDisponible ->{
            if (objAlimento.getNombre().equals(alimentoDisponible.getNombre())){
                alimentosDisponibles.add(objAlimento);
                existeAlimento.set(true);
            }
        } );
        //TODO esta mal corregir
        if(!existeAlimento.get()) throw new RuntimeException();
    }


    public void quitarAlimento(String nombreAlimento, NIño niño, int cantidadConsumo) {
        if (niño.getCantDulces() <= 5) {
            for (int contador = 0; contador < alimentosDisponibles.size(); contador++) {
                if (alimentosDisponibles.get(contador).getNombre().equals(nombreAlimento)) {
                    if (cantidadConsumo <= alimentosDisponibles.get(contador).getCantidad()) {
                        int cantidad = alimentosDisponibles.get(contador).getCantidad() - cantidadConsumo;
                        alimentosDisponibles.get(contador).setCantidad(cantidad);
                        if (alimentosDisponibles.get(contador).getCantidad() == 0) {
                            alimentosDisponibles.remove(contador);
                        }
                    }
                }
            }

        }
    }
    public void quitarAlimento(String nombreAlimento, int cantidadConsumo){

            for (int contador= 0; contador < alimentosDisponibles.size(); contador++ ){
                if(alimentosDisponibles.get(contador).getNombre().equals(nombreAlimento)){
                    if(cantidadConsumo <= alimentosDisponibles.get(contador).getCantidad()){
                        int cantidad = alimentosDisponibles.get(contador).getCantidad() - cantidadConsumo;
                        alimentosDisponibles.get(contador).setCantidad(cantidad);
                        if (alimentosDisponibles.get(contador).getCantidad() == 0){
                            alimentosDisponibles.remove(contador);
                        }
                    }
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
