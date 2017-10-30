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
public class Item {
    private String id_producto;
    private int precio;
    private int cantidad;

    public Item() {
    }

    public Item(String id_producto, int precio, int cantidad) {
        this.id_producto = id_producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Item{" + "id_producto=" + id_producto + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
