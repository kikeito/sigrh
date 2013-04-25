/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Competences.org.entityPK;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HAMED
 */
@Entity
@Table(name = "cataloguerefformation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cataloguerefformation.findAll", query = "SELECT c FROM Cataloguerefformation c"),
    @NamedQuery(name = "Cataloguerefformation.findByIdcataloguerefformation", query = "SELECT c FROM Cataloguerefformation c WHERE c.idcataloguerefformation = :idcataloguerefformation")})
public class Cataloguerefformation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcataloguerefformation")
    private Long idcataloguerefformation;
    @JoinColumn(name = "referentielcompetence_idreferentielcompetence", referencedColumnName = "idreferentielcompetence")
    @ManyToOne(optional = false)
    private Referentielcompetence referentielcompetenceIdreferentielcompetence;
    @JoinColumn(name = "catalogueformations_idcatalogueformations", referencedColumnName = "idcatalogueformations")
    @ManyToOne(optional = false)
    private Catalogueformations catalogueformationsIdcatalogueformations;

    /**
     *
     */
    public Cataloguerefformation() {
    }

    /**
     *
     * @param idcataloguerefformation
     */
    public Cataloguerefformation(Long idcataloguerefformation) {
        this.idcataloguerefformation = idcataloguerefformation;
    }

    /**
     *
     * @return
     */
    public Long getIdcataloguerefformation() {
        return idcataloguerefformation;
    }

    /**
     *
     * @param idcataloguerefformation
     */
    public void setIdcataloguerefformation(Long idcataloguerefformation) {
        this.idcataloguerefformation = idcataloguerefformation;
    }

    /**
     *
     * @return
     */
    public Referentielcompetence getReferentielcompetenceIdreferentielcompetence() {
        return referentielcompetenceIdreferentielcompetence;
    }

    /**
     *
     * @param referentielcompetenceIdreferentielcompetence
     */
    public void setReferentielcompetenceIdreferentielcompetence(Referentielcompetence referentielcompetenceIdreferentielcompetence) {
        this.referentielcompetenceIdreferentielcompetence = referentielcompetenceIdreferentielcompetence;
    }

    /**
     *
     * @return
     */
    public Catalogueformations getCatalogueformationsIdcatalogueformations() {
        return catalogueformationsIdcatalogueformations;
    }

    /**
     *
     * @param catalogueformationsIdcatalogueformations
     */
    public void setCatalogueformationsIdcatalogueformations(Catalogueformations catalogueformationsIdcatalogueformations) {
        this.catalogueformationsIdcatalogueformations = catalogueformationsIdcatalogueformations;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcataloguerefformation != null ? idcataloguerefformation.hashCode() : 0);
        return hash;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cataloguerefformation)) {
            return false;
        }
        Cataloguerefformation other = (Cataloguerefformation) object;
        if ((this.idcataloguerefformation == null && other.idcataloguerefformation != null) || (this.idcataloguerefformation != null && !this.idcataloguerefformation.equals(other.idcataloguerefformation))) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Competences.org.entityPK.Cataloguerefformation[ idcataloguerefformation=" + idcataloguerefformation + " ]";
    }
    
}
