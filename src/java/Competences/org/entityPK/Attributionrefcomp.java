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
@Table(name = "attributionrefcomp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Attributionrefcomp.findAll", query = "SELECT a FROM Attributionrefcomp a"),
    @NamedQuery(name = "Attributionrefcomp.findByIdattributionrefcomp", query = "SELECT a FROM Attributionrefcomp a WHERE a.idattributionrefcomp = :idattributionrefcomp")})
public class Attributionrefcomp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idattributionrefcomp")
    private Long idattributionrefcomp;
    @JoinColumn(name = "referentielcompetence_idreferentielcompetence", referencedColumnName = "idreferentielcompetence")
    @ManyToOne(optional = false)
    private Referentielcompetence referentielcompetenceIdreferentielcompetence;
    @JoinColumn(name = "attributions_idattributions", referencedColumnName = "idattributions")
    @ManyToOne(optional = false)
    private Attributions attributionsIdattributions;

    /**
     *
     */
    public Attributionrefcomp() {
    }

    /**
     *
     * @param idattributionrefcomp
     */
    public Attributionrefcomp(Long idattributionrefcomp) {
        this.idattributionrefcomp = idattributionrefcomp;
    }

    /**
     *
     * @return
     */
    public Long getIdattributionrefcomp() {
        return idattributionrefcomp;
    }

    /**
     *
     * @param idattributionrefcomp
     */
    public void setIdattributionrefcomp(Long idattributionrefcomp) {
        this.idattributionrefcomp = idattributionrefcomp;
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
    public Attributions getAttributionsIdattributions() {
        return attributionsIdattributions;
    }

    /**
     *
     * @param attributionsIdattributions
     */
    public void setAttributionsIdattributions(Attributions attributionsIdattributions) {
        this.attributionsIdattributions = attributionsIdattributions;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idattributionrefcomp != null ? idattributionrefcomp.hashCode() : 0);
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
        if (!(object instanceof Attributionrefcomp)) {
            return false;
        }
        Attributionrefcomp other = (Attributionrefcomp) object;
        if ((this.idattributionrefcomp == null && other.idattributionrefcomp != null) || (this.idattributionrefcomp != null && !this.idattributionrefcomp.equals(other.idattributionrefcomp))) {
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
        return "Competences.org.entityPK.Attributionrefcomp[ idattributionrefcomp=" + idattributionrefcomp + " ]";
    }
    
}
