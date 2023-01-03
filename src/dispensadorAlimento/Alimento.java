package dispensadorAlimento;

public class Alimento {

    private String nombre;
    private int cantidad;
    private String categoria;

    public Alimento(String nombre, String categoria, int cantidad){
        this.setNombre(nombre);
        this.setCantidad(cantidad);
        this.setCategoria(categoria);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}