package dispensadorAlimento;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String cantComida;
    private int edad;
    private ArrayList<Alimento>  AlimentoRef= new ArrayList<Alimento>();

    public Usuario (String nom, String cant, int ed){
        this.cantComida = cant;
        this.edad = ed;
        this.nombre = nom;
    }

    public void AgregarAlimento(Alimento a){
        AlimentoRef.add(a);
    }


    //GET AND SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCantComida() {
        return cantComida;
    }
    public void setCantComida(String cantComida) {
        this.cantComida = cantComida;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
