/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePK;

import EntityPk.PersonnelLang;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author uvt
 */
@Stateless
public class PersonnelLangFacade extends AbstractFacade<PersonnelLang> {
    @PersistenceContext(unitName = "GestionCarrierePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonnelLangFacade() {
        super(PersonnelLang.class);
    }
    
}
