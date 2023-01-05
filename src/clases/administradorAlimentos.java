package clases;

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

    public void consumirAlimentoDeContenedor(int posicionContenedor,Alimento alimentoAConsumir){

        if(this.usuarioEnSecion.getRol().equals("NIÑO")){
            if( (this.usuarioEnSecion.getCantDulces() + alimentoAConsumir.getCantidad() > 5 && alimentoAConsumir.getCategoria().equals("dulce"))){
                throw new miError("Un usuario tipo niño no puede consumir mas de 5 dulces");
            }
        }
        contenedores.get(posicionContenedor).quitarAlimento(alimentoAConsumir);
    }

    public void agregarContenedor(String nombreContenedor){

        contenedores.add(new Contenedor(nombreContenedor, this));
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
        if(this.usuarioEnSecion == null) throw new miError("Antes de agregar alimentos al admin inicie secion como admin ");
        if (this.usuarioEnSecion.getRol().equals("ADMIN")){
            this.AlimentosDisponibles.add(objAlimento);
        }else {
            throw new miError("Para poder agregar alimentos al admin debe ser admin");
        }
    }

    public ArrayList<Alimento> getAlimentosDisponibles(){
        return this.AlimentosDisponibles;
    }

    public Usuario getUsuarioEnSecion() {
        return usuarioEnSecion;
    }

    public void añadirUsuario(Usuario usuarioA) {
        if (!this.usuarioEnSecion.getRol().equals("ADMIN"))
            throw new miError("USTED NO ES ADMIN, no puede agregar usuarios");

        this.usuarios.add(usuarioA);

    }
    public void eliminarUsuarios(Usuario usuarioA){
        if (!this.usuarioEnSecion.getRol().equals("ADMIN"))
            throw new miError("USTED NO ES ADMIN, no puede BORRAR usuarios");

        boolean seBorroUsuario = this.usuarios.remove(usuarioA);

        if(!seBorroUsuario) throw new miError("No se encontro el usuario para borrar");

    }
    public ArrayList<Usuario> getUsuarios(){ return this.usuarios; }


}
