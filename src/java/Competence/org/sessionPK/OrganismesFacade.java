/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Competence.org.sessionPK;

import Competences.org.entityPK.Organismes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HAMED
 */
@Stateless
public class OrganismesFacade extends AbstractFacade<Organismes> {
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
    public OrganismesFacade() {
        super(Organismes.class);
    }
    
}
