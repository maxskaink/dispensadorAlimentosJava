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
            APP.agregarAlimentoAdministrador(new Alimento("pera", "fruta", 5));
            APP.agregarAlimentoAdministrador(new Alimento("cebolla", "verdura", 10));
            APP.agregarAlimentoAdministrador(new Alimento("chocolate", "dulce", 25));
            APP.agregarAlimentoAdministrador(new Alimento("CarneDeBufalo", "Carnes", 25));

            APP.getContenedores().get(0).agregarAlimento(new Alimento("manzana", "fruta", 2));
            APP.getContenedores().get(0).agregarAlimento(new Alimento("manzana", "fruta", 20));
            APP.getContenedores().get(1).agregarAlimento(new Alimento("pera", "fruta", 5));
            APP.getContenedores().get(0).agregarAlimento(new Alimento("cebolla", "verdura", 10));
            APP.getContenedores().get(2).agregarAlimento(new Alimento("chocolate", "dulce", 25));
            APP.getContenedores().get(2).agregarAlimento(new Alimento("CarneDeBufalo", "Carnes", 20));


            APP.consumirAlimentoDeContenedor(2, new Alimento("chocolate", "dulce", 2));



            APP.agregarComidaListaSemana(new Alimento("manzana", "fruta",10));
            APP.agregarComidaListaSemana(new Alimento("chocolate", "dulce",2));
            APP.agregarComidaListaSemana(new Alimento("pera", "fruta",10));
            APP.agregarComidaListaSemana(new Alimento("cebolla", "verdura",20));
            APP.agregarComidaListaSemana(new Alimento("CarneDeBufalo", "Carnes",40));

            System.out.println("Lista de compras");

            APP.consultarListaDeCompras().forEach( alimento -> {
                System.out.println("- " + alimento.getNombre() + " cantidad faltante " + alimento.getCantidad());
            } );


            System.out.println("Lista por semana");

            APP.getListaPorSemana().forEach( alimento -> {
                System.out.println("- " + alimento.getNombre() + " cantidad: " + alimento.getCantidad());
            } );

            System.out.println("Usuarios creados");
            APP.getUsuarios().forEach( usuario -> {

                System.out.println(usuario);
            });

            System.out.println("Alimentos en contenedores");
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