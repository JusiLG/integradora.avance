package mx.edu.utez.model.empleados;

import mx.edu.utez.model.caja.BeanCaja;
import mx.edu.utez.model.dulces.BeanDulces;
import mx.edu.utez.model.paquetes.BeanPaquetes;
import mx.edu.utez.model.ventas.BeanVentas;
import mx.edu.utez.service.ConnectionMySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoEmpleados {

    /*Aqui se va a mandar a llamar la conexion*/
    Connection con;
    CallableStatement cstm;  /*Manejo de procedimientos almacenados*/
    ResultSet rs; /*Este es para recuperar la informacion*/

    /*Consulta de usuarios o empleados*/

    public List<BeanEmpleados> findAll(){
        List<BeanEmpleados> listEmpleados = new ArrayList<>();
        try{
            con = ConnectionMySQL.getConnection();
            cstm = con.prepareCall("{call sp_findAll}");
            rs = cstm.executeQuery();

            Connection con = ConnectionMySQL.getConnection();
            Statement stm = con.createStatement();
         while (rs.next()){
             BeanCaja caja = new BeanCaja();
             BeanDulces dulces = new BeanDulces();
             BeanEmpleados empleados = new BeanEmpleados();
             BeanPaquetes paquetes = new BeanPaquetes();
             BeanVentas ventas = new BeanVentas();
             /*Para  esto funciono nuestro constructor vacio*/

             /*Aqui vamos a recibir los valores de todas las tablas */

             caja.setId_caja(rs.getInt("idCaja"));
             caja.setSaldo_inicial(rs.getInt("SaldoInicial"));
             caja.setSaldo_Final(rs.getInt("SaldoFinal"));

             dulces.setId_dulce(rs.getInt("idDulce"));
             dulces.setNombre_producto(rs.getString("nombreProducto"));
             dulces.setCategoria(rs.getString("categoria"));
             dulces.setMarca(rs.getString("marca"));
             dulces.setPrecio(rs.getInt("precio"));
             dulces.setDescuento(rs.getInt("descuento"));
             dulces.setCaducidad(rs.getString("caducidad"));
             dulces.setExistencia(rs.getInt("existencia"));
             dulces.setFoto(rs.getString(rs.getString("foto")));
             dulces.setCosto_mayoreo(rs.getInt("costoMayoreo"));
             dulces.setCantidad_mayoreo(rs.getInt("cantidadMayoreo"));
             dulces.setLote(rs.getInt("lote"));

             empleados.setId_empleado(rs.getInt("idEmpleado"));
             empleados.setNombre(rs.getString("nombre"));
             empleados.setApellidos(rs.getString("apellidos"));
             empleados.setUsuario(rs.getString("Usuario"));
             empleados.setContrasena(rs.getString("contrasena"));

             paquetes.setPaquete(rs.getInt("idPaquete"));
             paquetes.setNombre_paquete(rs.getString("nombrePaquete"));
             paquetes.setEstado(rs.getString("estado"));
             paquetes.setPrecio(rs.getInt("precio"));

             ventas.setId_venta(rs.getInt("venta"));
             ventas.setProductos_vendidos(rs.getInt("productosVendidos"));
             ventas.setSubtotal(rs.getInt("subtotal"));
             ventas.setDescuento(rs.getInt("descuento"));
             ventas.setTotal_venta(rs.getInt("totalVenta"));
             ventas.setFecha_venta(rs.getString("fechaVenta"));

             /*listEmpleados.add(empleados);*/

         }

        }catch (SQLException e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }finally {
            ConnectionMySQL.closeConnection(con,cstm,rs);
        }

        return listEmpleados;

    }/*return listEmpleados;*/



}
