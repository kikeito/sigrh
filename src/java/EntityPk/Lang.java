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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author uvt
 */
@Entity
@Table(name = "lang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lang.findAll", query = "SELECT l FROM Lang l"),
    @NamedQuery(name = "Lang.findByIdlang", query = "SELECT l FROM Lang l WHERE l.idlang = :idlang"),
    @NamedQuery(name = "Lang.findByIsoCode", query = "SELECT l FROM Lang l WHERE l.isoCode = :isoCode"),
    @NamedQuery(name = "Lang.findByIntitule", query = "SELECT l FROM Lang l WHERE l.intitule = :intitule"),
    @NamedQuery(name = "Lang.findByActive", query = "SELECT l FROM Lang l WHERE l.active = :active"),
    @NamedQuery(name = "Lang.findByAtrdefault", query = "SELECT l FROM Lang l WHERE l.atrdefault = :atrdefault"),
    @NamedQuery(name = "Lang.findByDeleted", query = "SELECT l FROM Lang l WHERE l.deleted = :deleted")})
public class Lang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idlang")
    private Integer idlang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "iso_code")
    private String isoCode;
    @Size(max = 100)
    @Column(name = "intitule")
    private String intitule;
    @Column(name = "active")
    private Short active;
    @Column(name = "atrdefault")
    private Short atrdefault;
    @Column(name = "deleted")
    private Short deleted;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "langIdlang")
    private Collection<ParamsLang> paramsLangCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "langIdlang")
    private Collection<GradeLang> gradeLangCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "langIdlang")
    private Collection<PersonnelLang> personnelLangCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "langIdlang")
    private Collection<ColumnsLang> columnsLangCollection;

    /**
     *
     */
    public Lang() {
    }

    /**
     *
     * @param idlang
     */
    public Lang(Integer idlang) {
        this.idlang = idlang;
    }

    /**
     *
     * @param idlang
     * @param isoCode
     */
    public Lang(Integer idlang, String isoCode) {
        this.idlang = idlang;
        this.isoCode = isoCode;
    }

    /**
     *
     * @return
     */
    public Integer getIdlang() {
        return idlang;
    }

    /**
     *
     * @param idlang
     */
    public void setIdlang(Integer idlang) {
        this.idlang = idlang;
    }

    /**
     *
     * @return
     */
    public String getIsoCode() {
        return isoCode;
    }

    /**
     *
     * @param isoCode
     */
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    /**
     *
     * @return
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     *
     * @param intitule
     */
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    /**
     *
     * @return
     */
    public Short getActive() {
        return active;
    }

    /**
     *
     * @param active
     */
    public void setActive(Short active) {
        this.active = active;
    }

    /**
     *
     * @return
     */
    public Short getAtrdefault() {
        return atrdefault;
    }

    /**
     *
     * @param atrdefault
     */
    public void setAtrdefault(Short atrdefault) {
        this.atrdefault = atrdefault;
    }

    /**
     *
     * @return
     */
    public Short getDeleted() {
        return deleted;
    }

    /**
     *
     * @param deleted
     */
    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public Collection<ParamsLang> getParamsLangCollection() {
        return paramsLangCollection;
    }

    /**
     *
     * @param paramsLangCollection
     */
    public void setParamsLangCollection(Collection<ParamsLang> paramsLangCollection) {
        this.paramsLangCollection = paramsLangCollection;
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
    @XmlTransient
    public Collection<PersonnelLang> getPersonnelLangCollection() {
        return personnelLangCollection;
    }

    /**
     *
     * @param personnelLangCollection
     */
    public void setPersonnelLangCollection(Collection<PersonnelLang> personnelLangCollection) {
        this.personnelLangCollection = personnelLangCollection;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public Collection<ColumnsLang> getColumnsLangCollection() {
        return columnsLangCollection;
    }

    /**
     *
     * @param columnsLangCollection
     */
    public void setColumnsLangCollection(Collection<ColumnsLang> columnsLangCollection) {
        this.columnsLangCollection = columnsLangCollection;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlang != null ? idlang.hashCode() : 0);
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
        if (!(object instanceof Lang)) {
            return false;
        }
        Lang other = (Lang) object;
        if ((this.idlang == null && other.idlang != null) || (this.idlang != null && !this.idlang.equals(other.idlang))) {
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
        return "EntityPk.Lang[ idlang=" + idlang + " ]";
    }
    
}
