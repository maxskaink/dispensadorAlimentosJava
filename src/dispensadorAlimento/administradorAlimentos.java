package dispensadorAlimento;

import java.util.ArrayList;

public class administradorAlimentos {

    private ArrayList<Contenedor> contenedores= new ArrayList<Contenedor>();

    private ArrayList<listaSemana> listasPorSemana = new ArrayList<listaSemana>();

    private ArrayList<Alimento> AlimentosDisponibles = new ArrayList<Alimento>();
    private ArrayList<listaSemana> listaPorSemana = new ArrayList<listaSemana>();

    public ArrayList<Contenedor> getContenedores(){
        return contenedores;
    }

    public void borrarAlimentoDeContenedor(int posicionContenedor, String nombreAlimento ){
        contenedores.get(posicionContenedor).quitarAlimento(nombreAlimento);
    }

    public void agregarContenedor(String nombreContenedor){
        contenedores.add(new Contenedor(nombreContenedor));
    }

    public listaSemana getListaPorSemana(){
        try{
            int ultimaLista = listasPorSemana.size();
            return this.listasPorSemana.get(ultimaLista);
        }catch (Exception e){
            return new listaSemana("vacio");
        }
    }

    public void borrarAlimentosAdministrador(String nombreAlimento){
        int i;

        for(i= 0; i< (AlimentosDisponibles.size()-1); i++){
            if(AlimentosDisponibles.get(i).getNombre().equals(nombreAlimento)){
                AlimentosDisponibles.remove(i);
            }
        }
    }
    public void agregarAlimentoAdministrador(Alimento objAlimento){
        this.AlimentosDisponibles.add(objAlimento);
    }

}
