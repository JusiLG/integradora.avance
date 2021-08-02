package mx.edu.utez.model.dulces;

import java.io.File;

public class BeanDulces {
    private int id_dulce;
    private String nombre_producto;
    private String categoria;
    private String marca;
    private int precio;
    private int descuento;
    private String caducidad;
    private int existencia;
    private String foto;
    private int costo_mayoreo;
    private int cantidad_mayoreo;
    private int lote;

    File archivofoto = new File(foto);

    public BeanDulces(int id_dulce, String nombre_producto, String categoria, String marca, int precio, int descuento, String caducidad, int existencia, String foto, int costo_mayoreo, int cantidad_mayoreo, int lote) {
        this.id_dulce = id_dulce;
        this.nombre_producto = nombre_producto;
        this.categoria = categoria;
        this.marca = marca;
        this.precio = precio;
        this.descuento = descuento;
        this.caducidad = caducidad;
        this.existencia = existencia;
        this.foto = foto;
        this.costo_mayoreo = costo_mayoreo;
        this.cantidad_mayoreo = cantidad_mayoreo;
        this.lote = lote;
    }

    public BeanDulces() {

    }

    public int getId_dulce() {
        return id_dulce;
    }

    public void setId_dulce(int id_dulce) {
        this.id_dulce = id_dulce;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getCosto_mayoreo() {
        return costo_mayoreo;
    }

    public void setCosto_mayoreo(int costo_mayoreo) {
        this.costo_mayoreo = costo_mayoreo;
    }

    public int getCantidad_mayoreo() {
        return cantidad_mayoreo;
    }

    public void setCantidad_mayoreo(int cantidad_mayoreo) {
        this.cantidad_mayoreo = cantidad_mayoreo;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }
}
