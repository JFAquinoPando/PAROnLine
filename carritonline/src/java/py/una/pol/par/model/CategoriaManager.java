/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.par.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.una.pol.par.entities.Categoria;
import py.una.pol.par.util.conectar_db;
/**
 *
 * @author fabricio
 */
public class CategoriaManager {
    
    public boolean insertar(Categoria c) {
        boolean retValue = true;

        Connection conectar = null;
        PreparedStatement pstmt = null;

        try {
            conectar = conectar_db.getConnection();
            pstmt = conectar.prepareStatement("insert into categoria (descripcion) values (?)");
            pstmt.setString(1, c.getDescripcion());
            pstmt.execute();

        } catch (SQLException ex) {
            retValue = false;
            Logger.getLogger(CategoriaManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoriaManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conectar_db.closeConnection(conectar);
        }

        return retValue;
    }

    public boolean update(Categoria c) {
        boolean retValue = true;

        Connection conectar = null;
        PreparedStatement pstmt = null;

        try {
            conectar = conectar_db.getConnection();
            pstmt = conectar.prepareStatement("update categoria set descripcion = ? where id_categoria = ?");
            pstmt.setString(1, c.getDescripcion());
            pstmt.setInt(2, c.getIdCategoria());
            pstmt.execute();

        } catch (SQLException ex) {
            retValue = false;
            Logger.getLogger(CategoriaManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conectar_db.closeConnection(conectar);
        }

        return retValue;
    }

    public boolean delete(Categoria c) {
        boolean retValue = true;

        Connection conectar = null;
        PreparedStatement pstmt = null;

        try {
            conectar = conectar_db.getConnection();
            pstmt = conectar.prepareStatement("delete from categoria where id_categoria = ?");
            pstmt.setInt(1, c.getIdCategoria());
            pstmt.execute();

        } catch (SQLException ex) {
            retValue = false;
            Logger.getLogger(CategoriaManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conectar_db.closeConnection(conectar);
        }

        return retValue;
    }

    public Categoria getCategoriaById(int id) {
        Categoria retValue = null;

        Connection conectar = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conectar = conectar_db.getConnection();
            pstmt = conectar.prepareStatement("select descripcion from categoria where id_categoria = ?");
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                retValue = new Categoria();
                retValue.setIdCategoria(id);
                retValue.setDescripcion(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conectar_db.closeConnection(conectar);
        }

        return retValue;
    }
    
    public ArrayList<Categoria> getAll() {
        ArrayList<Categoria> retValue = new ArrayList<Categoria>();

        Connection conectar = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conectar = conectar_db.getConnection();
            pstmt = conectar.prepareStatement("select id_categoria, descripcion from categoria");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt(1));
                c.setDescripcion(rs.getString(2));
                retValue.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conectar_db.closeConnection(conectar);
        }

        return retValue;
    }
}
