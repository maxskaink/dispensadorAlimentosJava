package dispensadorAlimento;

import java.util.ArrayList;

public class administradorAlimentos {

    private ArrayList<Contenedor> contenedores= new ArrayList<Contenedor>();
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    private ArrayList<listaSemana> listasPorSemana = new ArrayList<listaSemana>();

    private ArrayList<Alimento> AlimentosDisponibles = new ArrayList<Alimento>();
    private Usuario usuarioEnSecion;

    public administradorAlimentos(){
        this.usuarios.add( new Administrador("Padre",0,99,"admin"));
    }

    public void iniciarSecion(int posicionUsuario){
        this.usuarioEnSecion = usuarios.get(posicionUsuario);
    }

    public ArrayList<Contenedor> getContenedores(){
        return contenedores;
    }

    public void consumirAlimentoDeContenedor(int posicionContenedor, String nombreAlimento, int cantidadConusmo){
        contenedores.get(posicionContenedor).quitarAlimento(nombreAlimento, cantidadConusmo);
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
        if (this.usuarioEnSecion.setRol().equals("ADMIN")){
            this.AlimentosDisponibles.add(objAlimento);
        }else {
            throw new RuntimeException();
        }
    }

    public Usuario getUsuarioEnSecion() {
        return usuarioEnSecion;
    }
}
