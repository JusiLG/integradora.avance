package mx.edu.utez.model.paquetes;

public class BeanPaquetes {
    private int id;
    private String nombre_paquete;
    private int cantidad_productos;
    private String estado;
    private int Precio;

    public BeanPaquetes(int paquete, String nombre_paquete, int cantidad_productos, String estado, int precio) {
        this.id = paquete;
        this.nombre_paquete = nombre_paquete;
        this.cantidad_productos = cantidad_productos;
        this.estado = estado;
        Precio = precio;
    }

    public BeanPaquetes() {

    }

    public int getPaquete() {
        return id;
    }

    public void setPaquete(int paquete) {
        this.id = paquete;
    }

    public String getNombre_paquete() {
        return nombre_paquete;
    }

    public void setNombre_paquete(String nombre_paquete) {
        this.nombre_paquete = nombre_paquete;
    }

    public int getCantidad_productos() {
        return cantidad_productos;
    }

    public void setCantidad_productos(int cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }
}
