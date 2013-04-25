/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Competence.org.sessionPK;

import Competences.org.entityPK.Attributionrefcomp;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HAMED
 */
@Stateless
public class AttributionrefcompFacade extends AbstractFacade<Attributionrefcomp> {
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
    public AttributionrefcompFacade() {
        super(Attributionrefcomp.class);
    }
    
}
