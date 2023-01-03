package dispensadorAlimento;

import java.util.ArrayList;

public class administradorAlimentos {

    private ArrayList<Contenedor> contenedores= new ArrayList<Contenedor>();

    private ArrayList<listaSemana> listasPorSemana = new ArrayList<listaSemana>();


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

}
