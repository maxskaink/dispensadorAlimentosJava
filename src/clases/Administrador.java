package clases;

public class   Administrador  extends Usuario{
    private String rol;
    public Administrador(String nom, int cant, int ed, String rol) {
        super(nom, cant, ed);
        this.setRol(rol);

    }



    //GIT AND GETTERS
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String setRol(){
        return "ADMIN";
    }
}
