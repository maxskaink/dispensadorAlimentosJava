import dispensadorAlimento.Alimento;
import dispensadorAlimento.administradorAlimentos;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        administradorAlimentos APP = new administradorAlimentos();

        //APP.iniciarSecion(0);
        APP.agregarContenedor("Nevera");

        try {
            APP.agregarAlimentoAdministrador(new Alimento("manzana", "fruta", 0));

        }catch (Exception e){
            System.out.println("No se pudo agregar el alimento");
        }

        APP.getContenedores().get(0).agregarAlimento( new Alimento("manzana", "fruta", 2 ));

        APP.consumirAlimentoDeContenedor(0,"manzana");



    }

}