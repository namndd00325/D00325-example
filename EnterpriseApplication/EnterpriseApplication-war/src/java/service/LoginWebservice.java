/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import session.TblUserFacade;
import session.TblUserFacadeLocal;

/**
 *
 * @author Nam Nguyen
 */
@WebService(serviceName = "LoginWebservice")
public class LoginWebservice {

    /**
     * This is a sample web service operation
     */
    
    @EJB
    private TblUserFacadeLocal tblUserFacadeLocal;
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "checkLogin")
    public boolean checkLogin (@WebParam(name = "username") String username , 
            @WebParam(name = "password") String password) {
        return tblUserFacadeLocal.checkLogin(username, password) ;
    }
}
