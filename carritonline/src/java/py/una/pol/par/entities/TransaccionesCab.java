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
public class TransaccionesCab {
    private int ID_Transacción; 
    private String Fecha;
    private int Id_Usuario;
    private int Total;
    private String Direccion_de_envio;
    private byte Id_Medio_Pago; //0 Efectivo, 1 Tarjeta de Credito
    private int NroTarjeta; //solo si id_medio_pago == 1
    private String Estado; //I Ingresado

    public TransaccionesCab() {
    }

    public TransaccionesCab(int ID_Transacción, String Fecha, int Id_Usuario, int Total, String Direccion_de_envio, byte Id_Medio_Pago, int NroTarjeta, String Estado) {
        this.ID_Transacción = ID_Transacción;
        this.Fecha = Fecha;
        this.Id_Usuario = Id_Usuario;
        this.Total = Total;
        this.Direccion_de_envio = Direccion_de_envio;
        this.Id_Medio_Pago = Id_Medio_Pago;
        this.NroTarjeta = NroTarjeta;
        this.Estado = Estado;
    }

    public int getID_Transacción() {
        return ID_Transacción;
    }

    public void setID_Transacción(int ID_Transacción) {
        this.ID_Transacción = ID_Transacción;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public String getDireccion_de_envio() {
        return Direccion_de_envio;
    }

    public void setDireccion_de_envio(String Direccion_de_envio) {
        this.Direccion_de_envio = Direccion_de_envio;
    }

    public byte getId_Medio_Pago() {
        return Id_Medio_Pago;
    }

    public void setId_Medio_Pago(byte Id_Medio_Pago) {
        this.Id_Medio_Pago = Id_Medio_Pago;
    }

    public int getNroTarjeta() {
        return NroTarjeta;
    }

    public void setNroTarjeta(int NroTarjeta) {
        this.NroTarjeta = NroTarjeta;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
