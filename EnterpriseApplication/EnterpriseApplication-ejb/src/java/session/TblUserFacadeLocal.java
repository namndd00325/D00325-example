/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.TblUser;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Nam Nguyen
 */
@Local
public interface TblUserFacadeLocal {

    void create(TblUser tblUser);

    void edit(TblUser tblUser);

    void remove(TblUser tblUser);

    TblUser find(Object id);

    List<TblUser> findAll();

    List<TblUser> findRange(int[] range);

    int count();
    
    boolean checkLogin(String username, String password);
    
}
