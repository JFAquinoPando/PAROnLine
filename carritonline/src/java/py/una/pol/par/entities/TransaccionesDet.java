/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package py.una.pol.par.entities;

/**
 *
 * @author fabricio
 */
public class TransaccionesDet {
    private int idTransaccion;
    private int item;
    private int idProducto;
    private int cantidad;
    private int precio;
    private int subTotal;
    
    public TransaccionesDet() {
    }

    public TransaccionesDet(int idTransaccion, int item, int idProducto, int cantidad, int precio, int subTotal) {
        this.idTransaccion = idTransaccion;
        this.item = item;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subTotal = subTotal;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
    
}
