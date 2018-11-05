/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.TblUser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Nam Nguyen
 */
@Stateless
public class TblUserFacade extends AbstractFacade<TblUser> implements TblUserFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblUserFacade() {
        super(TblUser.class);
    }

    @Override
    public boolean checkLogin(String username, String password) {

        Query query = em.createNamedQuery("TblUser.checkLogin");
        query.setParameter("username", username);
        query.setParameter("password", password);
        try {
            query.getSingleResult();
            return true;
        } catch (Exception e) {
            System.out.println(e);  
        }
        return  false;

    }
}
