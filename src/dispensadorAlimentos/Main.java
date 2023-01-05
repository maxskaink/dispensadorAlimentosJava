package dispensadorAlimentos;

import clases.*;

public class Main {
    public static void main(String[] args) {
        try {
            administradorAlimentos APP = new administradorAlimentos();

            APP.iniciarSecion(0);
            APP.agregarContenedor("Nevera");
            APP.agregarContenedor("Cajon Amarillo");
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


            //APP.consumirAlimentoDeContenedor(0, new Alimento("manzana", "fruta", 4));


            APP.añadirUsuario(new Administrador("JUlIO", 9, 23, "MADRE ADOPTIVA CON REGALO"));
            APP.iniciarSecion(1);

            APP.añadirUsuario(new Administrador("JUlIO", 9, 23, "MADRE ADOPTIVA CON REGALO"));  

            APP.consumirAlimentoDeContenedor(2,new Alimento( "chocolate", "dulce", 2));

            APP.getUsuarios().forEach( usuario -> {

                System.out.println(usuario);
            });


            APP.getContenedores().forEach( contenedor ->{
                System.out.println("\n- " + contenedor.getNombre());

                contenedor.getAlimentosDisponibles().forEach( alimento -> {
                    System.out.println("   - "+ alimento.getNombre() + " " + alimento.getCantidad());
                } );
            });


            //APP.añadirUsuario();
        }catch (miError e){
            System.out.println(e.msg);
        }


    }

}