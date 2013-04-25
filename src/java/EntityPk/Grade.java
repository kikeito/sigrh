/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityPk;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author uvt
 */
@Entity
@Table(name = "grade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grade.findAll", query = "SELECT g FROM Grade g"),
    @NamedQuery(name = "Grade.findByIdgrade", query = "SELECT g FROM Grade g WHERE g.idgrade = :idgrade")})
public class Grade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgrade")
    private Integer idgrade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gradeIdgrade")
    private Collection<Personnel> personnelCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gradeIdgrade")
    private Collection<GradeLang> gradeLangCollection;

    /**
     *
     */
    public Grade() {
    }

    /**
     *
     * @param idgrade
     */
    public Grade(Integer idgrade) {
        this.idgrade = idgrade;
    }

    /**
     *
     * @return
     */
    public Integer getIdgrade() {
        return idgrade;
    }

    /**
     *
     * @param idgrade
     */
    public void setIdgrade(Integer idgrade) {
        this.idgrade = idgrade;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public Collection<Personnel> getPersonnelCollection() {
        return personnelCollection;
    }

    /**
     *
     * @param personnelCollection
     */
    public void setPersonnelCollection(Collection<Personnel> personnelCollection) {
        this.personnelCollection = personnelCollection;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public Collection<GradeLang> getGradeLangCollection() {
        return gradeLangCollection;
    }

    /**
     *
     * @param gradeLangCollection
     */
    public void setGradeLangCollection(Collection<GradeLang> gradeLangCollection) {
        this.gradeLangCollection = gradeLangCollection;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgrade != null ? idgrade.hashCode() : 0);
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
        if (!(object instanceof Grade)) {
            return false;
        }
        Grade other = (Grade) object;
        if ((this.idgrade == null && other.idgrade != null) || (this.idgrade != null && !this.idgrade.equals(other.idgrade))) {
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
        return "EntityPk.Grade[ idgrade=" + idgrade + " ]";
    }
    
}
