/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Competences.org.entityPK;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HAMED
 */
@Entity
@Table(name = "fournisseursformation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fournisseursformation.findAll", query = "SELECT f FROM Fournisseursformation f"),
    @NamedQuery(name = "Fournisseursformation.findByIdfournisseursformation", query = "SELECT f FROM Fournisseursformation f WHERE f.idfournisseursformation = :idfournisseursformation"),
    @NamedQuery(name = "Fournisseursformation.findByAcceptation", query = "SELECT f FROM Fournisseursformation f WHERE f.acceptation = :acceptation")})
public class Fournisseursformation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfournisseursformation")
    private Integer idfournisseursformation;
    @Column(name = "acceptation")
    private Short acceptation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fournisseursformationIdfournisseursformation")
    private List<Formateurdeformation> formateurdeformationList;
    @JoinColumn(name = "formations_idformations", referencedColumnName = "idformations")
    @ManyToOne(optional = false)
    private Formations formationsIdformations;
    @JoinColumn(name = "fournisseurs_idfournisseurs", referencedColumnName = "idfournisseurs")
    @ManyToOne(optional = false)
    private Fournisseurs fournisseursIdfournisseurs;

    /**
     *
     */
    public Fournisseursformation() {
    }

    /**
     *
     * @param idfournisseursformation
     */
    public Fournisseursformation(Integer idfournisseursformation) {
        this.idfournisseursformation = idfournisseursformation;
    }

    /**
     *
     * @return
     */
    public Integer getIdfournisseursformation() {
        return idfournisseursformation;
    }

    /**
     *
     * @param idfournisseursformation
     */
    public void setIdfournisseursformation(Integer idfournisseursformation) {
        this.idfournisseursformation = idfournisseursformation;
    }

    /**
     *
     * @return
     */
    public Short getAcceptation() {
        return acceptation;
    }

    /**
     *
     * @param acceptation
     */
    public void setAcceptation(Short acceptation) {
        this.acceptation = acceptation;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Formateurdeformation> getFormateurdeformationList() {
        return formateurdeformationList;
    }

    /**
     *
     * @param formateurdeformationList
     */
    public void setFormateurdeformationList(List<Formateurdeformation> formateurdeformationList) {
        this.formateurdeformationList = formateurdeformationList;
    }

    /**
     *
     * @return
     */
    public Formations getFormationsIdformations() {
        return formationsIdformations;
    }

    /**
     *
     * @param formationsIdformations
     */
    public void setFormationsIdformations(Formations formationsIdformations) {
        this.formationsIdformations = formationsIdformations;
    }

    /**
     *
     * @return
     */
    public Fournisseurs getFournisseursIdfournisseurs() {
        return fournisseursIdfournisseurs;
    }

    /**
     *
     * @param fournisseursIdfournisseurs
     */
    public void setFournisseursIdfournisseurs(Fournisseurs fournisseursIdfournisseurs) {
        this.fournisseursIdfournisseurs = fournisseursIdfournisseurs;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfournisseursformation != null ? idfournisseursformation.hashCode() : 0);
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
        if (!(object instanceof Fournisseursformation)) {
            return false;
        }
        Fournisseursformation other = (Fournisseursformation) object;
        if ((this.idfournisseursformation == null && other.idfournisseursformation != null) || (this.idfournisseursformation != null && !this.idfournisseursformation.equals(other.idfournisseursformation))) {
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
        return "Competences.org.entityPK.Fournisseursformation[ idfournisseursformation=" + idfournisseursformation + " ]";
    }
    
}
