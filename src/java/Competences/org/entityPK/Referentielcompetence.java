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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HAMED
 */
@Entity
@Table(name = "referentielcompetence")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Referentielcompetence.findAll", query = "SELECT r FROM Referentielcompetence r"),
    @NamedQuery(name = "Referentielcompetence.findByIdreferentielcompetence", query = "SELECT r FROM Referentielcompetence r WHERE r.idreferentielcompetence = :idreferentielcompetence"),
    @NamedQuery(name = "Referentielcompetence.findByValeurfr", query = "SELECT r FROM Referentielcompetence r WHERE r.valeurfr = :valeurfr"),
    @NamedQuery(name = "Referentielcompetence.findByValeurar", query = "SELECT r FROM Referentielcompetence r WHERE r.valeurar = :valeurar")})
public class Referentielcompetence implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreferentielcompetence")
    private Integer idreferentielcompetence;
    @Size(max = 45)
    @Column(name = "Valeurfr")
    private String valeurfr;
    @Size(max = 45)
    @Column(name = "valeurar")
    private String valeurar;
    @OneToMany(mappedBy = "referentielcompetenceIdreferentielcompetence")
    private List<Referentielcompetence> referentielcompetenceList;
    @JoinColumn(name = "referentielcompetence_idreferentielcompetence", referencedColumnName = "idreferentielcompetence")
    @ManyToOne
    private Referentielcompetence referentielcompetenceIdreferentielcompetence;
    @JoinColumn(name = "modelreferentiels_idmodelreferentiels", referencedColumnName = "idmodelreferentiels")
    @ManyToOne(optional = false)
    private Modelreferentiels modelreferentielsIdmodelreferentiels;
    @JoinColumn(name = "metareferentiels_idmetareferentiels", referencedColumnName = "idmetareferentiels")
    @ManyToOne
    private Metareferentiels metareferentielsIdmetareferentiels;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "referentielcompetenceIdreferentielcompetence")
    private List<Cataloguerefformation> cataloguerefformationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "referentielcompetenceIdreferentielcompetence")
    private List<Attributionrefcomp> attributionrefcompList;

    /**
     *
     */
    public Referentielcompetence() {
    }

    /**
     *
     * @param idreferentielcompetence
     */
    public Referentielcompetence(Integer idreferentielcompetence) {
        this.idreferentielcompetence = idreferentielcompetence;
    }

    /**
     *
     * @return
     */
    public Integer getIdreferentielcompetence() {
        return idreferentielcompetence;
    }

    /**
     *
     * @param idreferentielcompetence
     */
    public void setIdreferentielcompetence(Integer idreferentielcompetence) {
        this.idreferentielcompetence = idreferentielcompetence;
    }

    /**
     *
     * @return
     */
    public String getValeurfr() {
        return valeurfr;
    }

    /**
     *
     * @param valeurfr
     */
    public void setValeurfr(String valeurfr) {
        this.valeurfr = valeurfr;
    }

    /**
     *
     * @return
     */
    public String getValeurar() {
        return valeurar;
    }

    /**
     *
     * @param valeurar
     */
    public void setValeurar(String valeurar) {
        this.valeurar = valeurar;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Referentielcompetence> getReferentielcompetenceList() {
        return referentielcompetenceList;
    }

    /**
     *
     * @param referentielcompetenceList
     */
    public void setReferentielcompetenceList(List<Referentielcompetence> referentielcompetenceList) {
        this.referentielcompetenceList = referentielcompetenceList;
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
    public Modelreferentiels getModelreferentielsIdmodelreferentiels() {
        return modelreferentielsIdmodelreferentiels;
    }

    /**
     *
     * @param modelreferentielsIdmodelreferentiels
     */
    public void setModelreferentielsIdmodelreferentiels(Modelreferentiels modelreferentielsIdmodelreferentiels) {
        this.modelreferentielsIdmodelreferentiels = modelreferentielsIdmodelreferentiels;
    }

    /**
     *
     * @return
     */
    public Metareferentiels getMetareferentielsIdmetareferentiels() {
        return metareferentielsIdmetareferentiels;
    }

    /**
     *
     * @param metareferentielsIdmetareferentiels
     */
    public void setMetareferentielsIdmetareferentiels(Metareferentiels metareferentielsIdmetareferentiels) {
        this.metareferentielsIdmetareferentiels = metareferentielsIdmetareferentiels;
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
    @XmlTransient
    public List<Attributionrefcomp> getAttributionrefcompList() {
        return attributionrefcompList;
    }

    /**
     *
     * @param attributionrefcompList
     */
    public void setAttributionrefcompList(List<Attributionrefcomp> attributionrefcompList) {
        this.attributionrefcompList = attributionrefcompList;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreferentielcompetence != null ? idreferentielcompetence.hashCode() : 0);
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
        if (!(object instanceof Referentielcompetence)) {
            return false;
        }
        Referentielcompetence other = (Referentielcompetence) object;
        if ((this.idreferentielcompetence == null && other.idreferentielcompetence != null) || (this.idreferentielcompetence != null && !this.idreferentielcompetence.equals(other.idreferentielcompetence))) {
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
        return "Competences.org.entityPK.Referentielcompetence[ idreferentielcompetence=" + idreferentielcompetence + " ]";
    }
    
}
