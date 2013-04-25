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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HAMED
 */
@Entity
@Table(name = "typeformation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Typeformation.findAll", query = "SELECT t FROM Typeformation t"),
    @NamedQuery(name = "Typeformation.findByIdtypeformation", query = "SELECT t FROM Typeformation t WHERE t.idtypeformation = :idtypeformation"),
    @NamedQuery(name = "Typeformation.findByLabeltypeformationfr", query = "SELECT t FROM Typeformation t WHERE t.labeltypeformationfr = :labeltypeformationfr"),
    @NamedQuery(name = "Typeformation.findByLabeltypeformationar", query = "SELECT t FROM Typeformation t WHERE t.labeltypeformationar = :labeltypeformationar")})
public class Typeformation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "idtypeformation")
    private String idtypeformation;
    @Size(max = 512)
    @Column(name = "labeltypeformationfr")
    private String labeltypeformationfr;
    @Size(max = 45)
    @Column(name = "labeltypeformationar")
    private String labeltypeformationar;
    @Lob
    @Size(max = 65535)
    @Column(name = "descriptiontypeform")
    private String descriptiontypeform;
    @Lob
    @Size(max = 65535)
    @Column(name = "descritptiontypeformar")
    private String descritptiontypeformar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeformationIdtypeformation")
    private List<Formations> formationsList;

    /**
     *
     */
    public Typeformation() {
    }

    /**
     *
     * @param idtypeformation
     */
    public Typeformation(String idtypeformation) {
        this.idtypeformation = idtypeformation;
    }

    /**
     *
     * @return
     */
    public String getIdtypeformation() {
        return idtypeformation;
    }

    /**
     *
     * @param idtypeformation
     */
    public void setIdtypeformation(String idtypeformation) {
        this.idtypeformation = idtypeformation;
    }

    /**
     *
     * @return
     */
    public String getLabeltypeformationfr() {
        return labeltypeformationfr;
    }

    /**
     *
     * @param labeltypeformationfr
     */
    public void setLabeltypeformationfr(String labeltypeformationfr) {
        this.labeltypeformationfr = labeltypeformationfr;
    }

    /**
     *
     * @return
     */
    public String getLabeltypeformationar() {
        return labeltypeformationar;
    }

    /**
     *
     * @param labeltypeformationar
     */
    public void setLabeltypeformationar(String labeltypeformationar) {
        this.labeltypeformationar = labeltypeformationar;
    }

    /**
     *
     * @return
     */
    public String getDescriptiontypeform() {
        return descriptiontypeform;
    }

    /**
     *
     * @param descriptiontypeform
     */
    public void setDescriptiontypeform(String descriptiontypeform) {
        this.descriptiontypeform = descriptiontypeform;
    }

    /**
     *
     * @return
     */
    public String getDescritptiontypeformar() {
        return descritptiontypeformar;
    }

    /**
     *
     * @param descritptiontypeformar
     */
    public void setDescritptiontypeformar(String descritptiontypeformar) {
        this.descritptiontypeformar = descritptiontypeformar;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Formations> getFormationsList() {
        return formationsList;
    }

    /**
     *
     * @param formationsList
     */
    public void setFormationsList(List<Formations> formationsList) {
        this.formationsList = formationsList;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtypeformation != null ? idtypeformation.hashCode() : 0);
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
        if (!(object instanceof Typeformation)) {
            return false;
        }
        Typeformation other = (Typeformation) object;
        if ((this.idtypeformation == null && other.idtypeformation != null) || (this.idtypeformation != null && !this.idtypeformation.equals(other.idtypeformation))) {
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
        return "Competences.org.entityPK.Typeformation[ idtypeformation=" + idtypeformation + " ]";
    }
    
}
