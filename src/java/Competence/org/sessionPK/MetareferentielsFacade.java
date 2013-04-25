/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Competence.org.sessionPK;

import Competences.org.entityPK.Metareferentiels;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HAMED
 */
@Stateless
public class MetareferentielsFacade extends AbstractFacade<Metareferentiels> {
    @PersistenceContext(unitName = "GestionCarrierePU")
    private EntityManager em;

    /**
     *
     * @return
     */
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /**
     *
     */
    public MetareferentielsFacade() {
        super(Metareferentiels.class);
    }
    
}
