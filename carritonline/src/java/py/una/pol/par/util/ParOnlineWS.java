/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.par.util;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author fabricio
 */
@WebService(serviceName = "ParOnlineWS")
public class ParOnlineWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarProducto")
    public String buscarProducto(@WebParam(name = "busquedatxt") String busquedatxt) {
        //TODO write your implementation code here:
        return null;
    }
}
