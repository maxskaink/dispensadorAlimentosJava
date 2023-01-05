package dispensadorAlimentos;

import clases.Alimento;
import clases.Contenedor;
import clases.administradorAlimentos;
import clases.miError;

public class Main {
    public static void main(String[] args) {
        try {
            administradorAlimentos APP = new administradorAlimentos();

            APP.iniciarSecion(0);
            APP.agregarContenedor("Nevera");
            APP.agregarContenedor("Cojon Amarillo");
            APP.agregarContenedor("Tarro 2");


            APP.agregarAlimentoAdministrador(new Alimento("manzana", "fruta", 0));
            APP.agregarAlimentoAdministrador( new Alimento( "pera", "fruta", 5));
            APP.agregarAlimentoAdministrador( new Alimento( "cebolla", "verdura", 10));
            APP.agregarAlimentoAdministrador( new Alimento( "chocolate", "dulce", 25));

            APP.getContenedores().get(0).agregarAlimento( new Alimento("manzana", "fruta", 2 ));
            APP.getContenedores().get(0).agregarAlimento( new Alimento("manzana", "fruta", 2 ));
            APP.getContenedores().get(1).agregarAlimento(new Alimento( "pera", "fruta", 5));
            APP.getContenedores().get(0).agregarAlimento(new Alimento( "cebolla", "verdura", 10));
            APP.getContenedores().get(2).agregarAlimento(new Alimento( "chocolate", "dulce", 25));


            APP.consumirAlimentoDeContenedor(0, new Alimento("manzana", "fruta", 4));


            APP.getContenedores().forEach( contenedor ->{
                System.out.println("\n- " + contenedor.getNombre());

                contenedor.getAlimentosDisponibles().forEach( alimento -> {
                    System.out.println("   - "+ alimento.getNombre() + " " + alimento.getCantidad());
                } );
            });

        }catch (miError e){
            System.out.println(e.msg);
        }


    }

}