/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Competences.org.entityPK;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HAMED
 */
@Entity
@Table(name = "metareferentiels")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Metareferentiels.findAll", query = "SELECT m FROM Metareferentiels m"),
    @NamedQuery(name = "Metareferentiels.findByIdmetareferentiels", query = "SELECT m FROM Metareferentiels m WHERE m.idmetareferentiels = :idmetareferentiels"),
    @NamedQuery(name = "Metareferentiels.findByLabelmetatfr", query = "SELECT m FROM Metareferentiels m WHERE m.labelmetatfr = :labelmetatfr"),
    @NamedQuery(name = "Metareferentiels.findByLabelmetatar", query = "SELECT m FROM Metareferentiels m WHERE m.labelmetatar = :labelmetatar")})
public class Metareferentiels implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "idmetareferentiels")
    private String idmetareferentiels;
    @Size(max = 45)
    @Column(name = "labelmetatfr")
    private String labelmetatfr;
    @Size(max = 45)
    @Column(name = "labelmetatar")
    private String labelmetatar;
    @OneToMany(mappedBy = "metareferentielsIdmetareferentiels")
    private List<Metareferentiels> metareferentielsList;
    @JoinColumn(name = "metareferentiels_idmetareferentiels", referencedColumnName = "idmetareferentiels")
    @ManyToOne
    private Metareferentiels metareferentielsIdmetareferentiels;
    @OneToMany(mappedBy = "metareferentielsIdmetareferentiels")
    private List<Referentielcompetence> referentielcompetenceList;

    /**
     *
     */
    public Metareferentiels() {
    }

    /**
     *
     * @param idmetareferentiels
     */
    public Metareferentiels(String idmetareferentiels) {
        this.idmetareferentiels = idmetareferentiels;
    }

    /**
     *
     * @return
     */
    public String getIdmetareferentiels() {
        return idmetareferentiels;
    }

    /**
     *
     * @param idmetareferentiels
     */
    public void setIdmetareferentiels(String idmetareferentiels) {
        this.idmetareferentiels = idmetareferentiels;
    }

    /**
     *
     * @return
     */
    public String getLabelmetatfr() {
        return labelmetatfr;
    }

    /**
     *
     * @param labelmetatfr
     */
    public void setLabelmetatfr(String labelmetatfr) {
        this.labelmetatfr = labelmetatfr;
    }

    /**
     *
     * @return
     */
    public String getLabelmetatar() {
        return labelmetatar;
    }

    /**
     *
     * @param labelmetatar
     */
    public void setLabelmetatar(String labelmetatar) {
        this.labelmetatar = labelmetatar;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Metareferentiels> getMetareferentielsList() {
        return metareferentielsList;
    }

    /**
     *
     * @param metareferentielsList
     */
    public void setMetareferentielsList(List<Metareferentiels> metareferentielsList) {
        this.metareferentielsList = metareferentielsList;
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
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmetareferentiels != null ? idmetareferentiels.hashCode() : 0);
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
        if (!(object instanceof Metareferentiels)) {
            return false;
        }
        Metareferentiels other = (Metareferentiels) object;
        if ((this.idmetareferentiels == null && other.idmetareferentiels != null) || (this.idmetareferentiels != null && !this.idmetareferentiels.equals(other.idmetareferentiels))) {
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
        return "Competences.org.entityPK.Metareferentiels[ idmetareferentiels=" + idmetareferentiels + " ]";
    }
    
}
