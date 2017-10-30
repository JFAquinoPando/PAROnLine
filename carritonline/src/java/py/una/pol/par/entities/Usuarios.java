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
public class Usuarios {
    private int idUsuario; 
    private String nombre;
    private String apellido;
    private String loginName;
    private String contrasena; //No texto plano, en MD5
    private byte tipoUsuario; //0 Admin, 1 Usuario Normal

    public Usuarios() {
    }

    public Usuarios(int id_usuario, String nombre, String apellido, String login_name, String contrasena, byte tipo_usuario) {
        this.idUsuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.loginName = login_name;
        this.contrasena = contrasena;
        this.tipoUsuario = tipo_usuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int id_usuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public byte getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(byte tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
}
