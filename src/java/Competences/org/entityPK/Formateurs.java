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
@Table(name = "formateurs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formateurs.findAll", query = "SELECT f FROM Formateurs f"),
    @NamedQuery(name = "Formateurs.findByIdformateurs", query = "SELECT f FROM Formateurs f WHERE f.idformateurs = :idformateurs"),
    @NamedQuery(name = "Formateurs.findByNomar", query = "SELECT f FROM Formateurs f WHERE f.nomar = :nomar"),
    @NamedQuery(name = "Formateurs.findByNomfr", query = "SELECT f FROM Formateurs f WHERE f.nomfr = :nomfr"),
    @NamedQuery(name = "Formateurs.findByAdresse", query = "SELECT f FROM Formateurs f WHERE f.adresse = :adresse"),
    @NamedQuery(name = "Formateurs.findByTel", query = "SELECT f FROM Formateurs f WHERE f.tel = :tel")})
public class Formateurs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idformateurs")
    private Integer idformateurs;
    @Size(max = 45)
    @Column(name = "nomar")
    private String nomar;
    @Size(max = 45)
    @Column(name = "nomfr")
    private String nomfr;
    @Size(max = 45)
    @Column(name = "adresse")
    private String adresse;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formateursIdformateurs")
    private List<Formateurdeformation> formateurdeformationList;

    /**
     *
     */
    public Formateurs() {
    }

    /**
     *
     * @param idformateurs
     */
    public Formateurs(Integer idformateurs) {
        this.idformateurs = idformateurs;
    }

    /**
     *
     * @return
     */
    public Integer getIdformateurs() {
        return idformateurs;
    }

    /**
     *
     * @param idformateurs
     */
    public void setIdformateurs(Integer idformateurs) {
        this.idformateurs = idformateurs;
    }

    /**
     *
     * @return
     */
    public String getNomar() {
        return nomar;
    }

    /**
     *
     * @param nomar
     */
    public void setNomar(String nomar) {
        this.nomar = nomar;
    }

    /**
     *
     * @return
     */
    public String getNomfr() {
        return nomfr;
    }

    /**
     *
     * @param nomfr
     */
    public void setNomfr(String nomfr) {
        this.nomfr = nomfr;
    }

    /**
     *
     * @return
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     *
     * @return
     */
    public String getTel() {
        return tel;
    }

    /**
     *
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
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
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idformateurs != null ? idformateurs.hashCode() : 0);
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
        if (!(object instanceof Formateurs)) {
            return false;
        }
        Formateurs other = (Formateurs) object;
        if ((this.idformateurs == null && other.idformateurs != null) || (this.idformateurs != null && !this.idformateurs.equals(other.idformateurs))) {
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
        return "Competences.org.entityPK.Formateurs[ idformateurs=" + idformateurs + " ]";
    }
    
}
