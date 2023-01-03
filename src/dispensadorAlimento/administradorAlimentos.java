package dispensadorAlimento;

import java.util.ArrayList;

public class administradorAlimentos {

    private ArrayList<Contenedor> contenedores= new ArrayList<Contenedor>();

    private ArrayList<listaSemana> listaPorSemana = new ArrayList<listaSemana>();


    public ArrayList<Contenedor> getContenedores(){
        return contenedores;
    }

    public void borrarAlimento(){}

}
