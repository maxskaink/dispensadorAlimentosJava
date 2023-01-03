package dispensadorAlimento;

import java.util.ArrayList;

public class listaSemana {

    private String descripcion;
    private ArrayList<Alimento> alimentosRef= new ArrayList<Alimento>();
    public listaSemana( String desc ){
        this.descripcion = desc;
    }
    public void quitarAlimentos(String nombreAlimento){
        int i;

        for(i= 0; i< (alimentosRef.size()-1); i++){
            if(alimentosRef.get(i).getNombre().equals(nombreAlimento)){
                alimentosRef.remove(i);
            }
        }
    }
    public void agregarAlimento(Alimento objAlimento){
        this.alimentosRef.add(objAlimento);
    }

    
}
