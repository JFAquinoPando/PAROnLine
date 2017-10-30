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
public class Productos {
    
    private String id_producto;
    private int cantidad;
    private String descripcion;
    private int precioUnit;
    private String nombre_img;
    private String id_categoria;

    public Productos() {
    }

    public Productos(String id_producto, int cantidad, String descripcion, int precioUnit, String nombre_img, String id_categoria) {
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnit = precioUnit;
        this.nombre_img = nombre_img;
        this.id_categoria = id_categoria;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(int precioUnit) {
        this.precioUnit = precioUnit;
    }

    public String getNombre_img() {
        return nombre_img;
    }

    public void setNombre_img(String nombre_img) {
        this.nombre_img = nombre_img;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    @Override
    public String toString() {
        return "Productos{" + "id_producto=" + id_producto + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", precioUnit=" + precioUnit + ", nombre_img=" + nombre_img + ", id_categoria=" + id_categoria + '}';
    }
    
}
/*
id_producto VARCHAR(30) NOT NULL,
                Cantidad INTEGER NOT NULL,
                descripcion VARCHAR(500) NOT NULL,
                PrecioUnit INTEGER NOT NULL,
                nombre_img VARCHAR(100) NOT NULL,
                id_categoria VARCHAR(30) NOT NULL,
                CONSTRAINT productos_pk PRIMARY KEY (id_producto)
*/