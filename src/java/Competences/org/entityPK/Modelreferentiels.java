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
import javax.persistence.Lob;
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
@Table(name = "modelreferentiels")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modelreferentiels.findAll", query = "SELECT m FROM Modelreferentiels m"),
    @NamedQuery(name = "Modelreferentiels.findByIdmodelreferentiels", query = "SELECT m FROM Modelreferentiels m WHERE m.idmodelreferentiels = :idmodelreferentiels"),
    @NamedQuery(name = "Modelreferentiels.findByNommodelref", query = "SELECT m FROM Modelreferentiels m WHERE m.nommodelref = :nommodelref"),
    @NamedQuery(name = "Modelreferentiels.findByNommodelrefar", query = "SELECT m FROM Modelreferentiels m WHERE m.nommodelrefar = :nommodelrefar")})
public class Modelreferentiels implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmodelreferentiels")
    private Integer idmodelreferentiels;
    @Size(max = 512)
    @Column(name = "nommodelref")
    private String nommodelref;
    @Size(max = 45)
    @Column(name = "nommodelrefar")
    private String nommodelrefar;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Lob
    @Size(max = 65535)
    @Column(name = "descriptionar")
    private String descriptionar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modelreferentielsIdmodelreferentiels")
    private List<Referentielcompetence> referentielcompetenceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modelreferentielsIdmodelreferentiels")
    private List<Postes> postesList;

    /**
     *
     */
    public Modelreferentiels() {
    }

    /**
     *
     * @param idmodelreferentiels
     */
    public Modelreferentiels(Integer idmodelreferentiels) {
        this.idmodelreferentiels = idmodelreferentiels;
    }

    /**
     *
     * @return
     */
    public Integer getIdmodelreferentiels() {
        return idmodelreferentiels;
    }

    /**
     *
     * @param idmodelreferentiels
     */
    public void setIdmodelreferentiels(Integer idmodelreferentiels) {
        this.idmodelreferentiels = idmodelreferentiels;
    }

    /**
     *
     * @return
     */
    public String getNommodelref() {
        return nommodelref;
    }

    /**
     *
     * @param nommodelref
     */
    public void setNommodelref(String nommodelref) {
        this.nommodelref = nommodelref;
    }

    /**
     *
     * @return
     */
    public String getNommodelrefar() {
        return nommodelrefar;
    }

    /**
     *
     * @param nommodelrefar
     */
    public void setNommodelrefar(String nommodelrefar) {
        this.nommodelrefar = nommodelrefar;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public String getDescriptionar() {
        return descriptionar;
    }

    /**
     *
     * @param descriptionar
     */
    public void setDescriptionar(String descriptionar) {
        this.descriptionar = descriptionar;
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
    @XmlTransient
    public List<Postes> getPostesList() {
        return postesList;
    }

    /**
     *
     * @param postesList
     */
    public void setPostesList(List<Postes> postesList) {
        this.postesList = postesList;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmodelreferentiels != null ? idmodelreferentiels.hashCode() : 0);
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
        if (!(object instanceof Modelreferentiels)) {
            return false;
        }
        Modelreferentiels other = (Modelreferentiels) object;
        if ((this.idmodelreferentiels == null && other.idmodelreferentiels != null) || (this.idmodelreferentiels != null && !this.idmodelreferentiels.equals(other.idmodelreferentiels))) {
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
        return "Competences.org.entityPK.Modelreferentiels[ idmodelreferentiels=" + idmodelreferentiels + " ]";
    }
    
}
