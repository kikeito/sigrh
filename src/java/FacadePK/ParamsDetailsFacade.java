/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePK;

import EntityPk.ParamsDetails;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author uvt
 */
@Stateless
public class ParamsDetailsFacade extends AbstractFacade<ParamsDetails> {
    @PersistenceContext(unitName = "GestionCarrierePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParamsDetailsFacade() {
        super(ParamsDetails.class);
    }
    
}
