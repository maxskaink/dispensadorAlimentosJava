package clases;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private int cantComida;
    private int edad;
    private ArrayList<Alimento>  AlimentoRef= new ArrayList<Alimento>();

    public Usuario (String nom, int cant, int ed){
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
    public int getCantComida() {
        return cantComida;
    }
    public void setCantComida(int cantComida) {
        this.cantComida = cantComida;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getRol(){
        return "USUARIO";
    }

    public int getCantDulces() {
        return 0;
    }
}
