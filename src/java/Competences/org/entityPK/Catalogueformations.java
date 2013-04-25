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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HAMED
 */
@Entity
@Table(name = "catalogueformations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catalogueformations.findAll", query = "SELECT c FROM Catalogueformations c"),
    @NamedQuery(name = "Catalogueformations.findByIdcatalogueformations", query = "SELECT c FROM Catalogueformations c WHERE c.idcatalogueformations = :idcatalogueformations")})
public class Catalogueformations implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcatalogueformations")
    private Integer idcatalogueformations;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catalogueformationsIdcatalogueformations")
    private List<Cataloguerefformation> cataloguerefformationList;
    @JoinColumn(name = "formations_idformations", referencedColumnName = "idformations")
    @ManyToOne(optional = false)
    private Formations formationsIdformations;

    /**
     *
     */
    public Catalogueformations() {
    }

    /**
     *
     * @param idcatalogueformations
     */
    public Catalogueformations(Integer idcatalogueformations) {
        this.idcatalogueformations = idcatalogueformations;
    }

    /**
     *
     * @return
     */
    public Integer getIdcatalogueformations() {
        return idcatalogueformations;
    }

    /**
     *
     * @param idcatalogueformations
     */
    public void setIdcatalogueformations(Integer idcatalogueformations) {
        this.idcatalogueformations = idcatalogueformations;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Cataloguerefformation> getCataloguerefformationList() {
        return cataloguerefformationList;
    }

    /**
     *
     * @param cataloguerefformationList
     */
    public void setCataloguerefformationList(List<Cataloguerefformation> cataloguerefformationList) {
        this.cataloguerefformationList = cataloguerefformationList;
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
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcatalogueformations != null ? idcatalogueformations.hashCode() : 0);
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
        if (!(object instanceof Catalogueformations)) {
            return false;
        }
        Catalogueformations other = (Catalogueformations) object;
        if ((this.idcatalogueformations == null && other.idcatalogueformations != null) || (this.idcatalogueformations != null && !this.idcatalogueformations.equals(other.idcatalogueformations))) {
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
        return "Competences.org.entityPK.Catalogueformations[ idcatalogueformations=" + idcatalogueformations + " ]";
    }
    
}
