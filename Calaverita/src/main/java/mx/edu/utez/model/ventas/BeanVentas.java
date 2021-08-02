package mx.edu.utez.model.ventas;

public class BeanVentas {
    private int id_venta;
    private int productos_vendidos
    private int subtotal;
    private int descuento;
    private int total_venta
    private String fecha_venta;
    private int id_empleado;

    public BeanVentas(int id_venta, int productos_vendidos, int subtotal, int descuento, int total_venta, String fecha_venta, int id_empleado) {
        this.id_venta = id_venta;
        this.productos_vendidos = productos_vendidos;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.total_venta = total_venta;
        this.fecha_venta = fecha_venta;
        this.id_empleado = id_empleado;
    }

    public BeanVentas() {

    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getProductos_vendidos() {
        return productos_vendidos;
    }

    public void setProductos_vendidos(int productos_vendidos) {
        this.productos_vendidos = productos_vendidos;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(int total_venta) {
        this.total_venta = total_venta;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }
}
