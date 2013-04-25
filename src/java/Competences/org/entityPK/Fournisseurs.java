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
@Table(name = "fournisseurs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fournisseurs.findAll", query = "SELECT f FROM Fournisseurs f"),
    @NamedQuery(name = "Fournisseurs.findByIdfournisseurs", query = "SELECT f FROM Fournisseurs f WHERE f.idfournisseurs = :idfournisseurs"),
    @NamedQuery(name = "Fournisseurs.findByNomar", query = "SELECT f FROM Fournisseurs f WHERE f.nomar = :nomar"),
    @NamedQuery(name = "Fournisseurs.findByNomfr", query = "SELECT f FROM Fournisseurs f WHERE f.nomfr = :nomfr"),
    @NamedQuery(name = "Fournisseurs.findByAdresse", query = "SELECT f FROM Fournisseurs f WHERE f.adresse = :adresse"),
    @NamedQuery(name = "Fournisseurs.findByTel", query = "SELECT f FROM Fournisseurs f WHERE f.tel = :tel"),
    @NamedQuery(name = "Fournisseurs.findByDomaine", query = "SELECT f FROM Fournisseurs f WHERE f.domaine = :domaine"),
    @NamedQuery(name = "Fournisseurs.findByStatutguridique", query = "SELECT f FROM Fournisseurs f WHERE f.statutguridique = :statutguridique")})
public class Fournisseurs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfournisseurs")
    private Integer idfournisseurs;
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
    @Size(max = 45)
    @Column(name = "domaine")
    private String domaine;
    @Size(max = 45)
    @Column(name = "statutguridique")
    private String statutguridique;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fournisseursIdfournisseurs")
    private List<Fournisseursformation> fournisseursformationList;

    /**
     *
     */
    public Fournisseurs() {
    }

    /**
     *
     * @param idfournisseurs
     */
    public Fournisseurs(Integer idfournisseurs) {
        this.idfournisseurs = idfournisseurs;
    }

    /**
     *
     * @return
     */
    public Integer getIdfournisseurs() {
        return idfournisseurs;
    }

    /**
     *
     * @param idfournisseurs
     */
    public void setIdfournisseurs(Integer idfournisseurs) {
        this.idfournisseurs = idfournisseurs;
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
    public String getDomaine() {
        return domaine;
    }

    /**
     *
     * @param domaine
     */
    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    /**
     *
     * @return
     */
    public String getStatutguridique() {
        return statutguridique;
    }

    /**
     *
     * @param statutguridique
     */
    public void setStatutguridique(String statutguridique) {
        this.statutguridique = statutguridique;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Fournisseursformation> getFournisseursformationList() {
        return fournisseursformationList;
    }

    /**
     *
     * @param fournisseursformationList
     */
    public void setFournisseursformationList(List<Fournisseursformation> fournisseursformationList) {
        this.fournisseursformationList = fournisseursformationList;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfournisseurs != null ? idfournisseurs.hashCode() : 0);
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
        if (!(object instanceof Fournisseurs)) {
            return false;
        }
        Fournisseurs other = (Fournisseurs) object;
        if ((this.idfournisseurs == null && other.idfournisseurs != null) || (this.idfournisseurs != null && !this.idfournisseurs.equals(other.idfournisseurs))) {
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
        return "Competences.org.entityPK.Fournisseurs[ idfournisseurs=" + idfournisseurs + " ]";
    }
    
}
