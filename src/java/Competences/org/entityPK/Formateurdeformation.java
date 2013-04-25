/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Competences.org.entityPK;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HAMED
 */
@Entity
@Table(name = "formateurdeformation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formateurdeformation.findAll", query = "SELECT f FROM Formateurdeformation f"),
    @NamedQuery(name = "Formateurdeformation.findByIdformateurdeformation", query = "SELECT f FROM Formateurdeformation f WHERE f.idformateurdeformation = :idformateurdeformation")})
public class Formateurdeformation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idformateurdeformation")
    private Long idformateurdeformation;
    @JoinColumn(name = "fournisseursformation_idfournisseursformation", referencedColumnName = "idfournisseursformation")
    @ManyToOne(optional = false)
    private Fournisseursformation fournisseursformationIdfournisseursformation;
    @JoinColumn(name = "formateurs_idformateurs", referencedColumnName = "idformateurs")
    @ManyToOne(optional = false)
    private Formateurs formateursIdformateurs;

    /**
     *
     */
    public Formateurdeformation() {
    }

    /**
     *
     * @param idformateurdeformation
     */
    public Formateurdeformation(Long idformateurdeformation) {
        this.idformateurdeformation = idformateurdeformation;
    }

    /**
     *
     * @return
     */
    public Long getIdformateurdeformation() {
        return idformateurdeformation;
    }

    /**
     *
     * @param idformateurdeformation
     */
    public void setIdformateurdeformation(Long idformateurdeformation) {
        this.idformateurdeformation = idformateurdeformation;
    }

    /**
     *
     * @return
     */
    public Fournisseursformation getFournisseursformationIdfournisseursformation() {
        return fournisseursformationIdfournisseursformation;
    }

    /**
     *
     * @param fournisseursformationIdfournisseursformation
     */
    public void setFournisseursformationIdfournisseursformation(Fournisseursformation fournisseursformationIdfournisseursformation) {
        this.fournisseursformationIdfournisseursformation = fournisseursformationIdfournisseursformation;
    }

    /**
     *
     * @return
     */
    public Formateurs getFormateursIdformateurs() {
        return formateursIdformateurs;
    }

    /**
     *
     * @param formateursIdformateurs
     */
    public void setFormateursIdformateurs(Formateurs formateursIdformateurs) {
        this.formateursIdformateurs = formateursIdformateurs;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idformateurdeformation != null ? idformateurdeformation.hashCode() : 0);
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
        if (!(object instanceof Formateurdeformation)) {
            return false;
        }
        Formateurdeformation other = (Formateurdeformation) object;
        if ((this.idformateurdeformation == null && other.idformateurdeformation != null) || (this.idformateurdeformation != null && !this.idformateurdeformation.equals(other.idformateurdeformation))) {
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
        return "Competences.org.entityPK.Formateurdeformation[ idformateurdeformation=" + idformateurdeformation + " ]";
    }
    
}
