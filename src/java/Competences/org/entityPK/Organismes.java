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
@Table(name = "organismes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Organismes.findAll", query = "SELECT o FROM Organismes o"),
    @NamedQuery(name = "Organismes.findByIdorganismes", query = "SELECT o FROM Organismes o WHERE o.idorganismes = :idorganismes"),
    @NamedQuery(name = "Organismes.findByNomfr", query = "SELECT o FROM Organismes o WHERE o.nomfr = :nomfr"),
    @NamedQuery(name = "Organismes.findByNomar", query = "SELECT o FROM Organismes o WHERE o.nomar = :nomar"),
    @NamedQuery(name = "Organismes.findByStatut", query = "SELECT o FROM Organismes o WHERE o.statut = :statut"),
    @NamedQuery(name = "Organismes.findByAdresse", query = "SELECT o FROM Organismes o WHERE o.adresse = :adresse"),
    @NamedQuery(name = "Organismes.findByVille", query = "SELECT o FROM Organismes o WHERE o.ville = :ville"),
    @NamedQuery(name = "Organismes.findByCodepostale", query = "SELECT o FROM Organismes o WHERE o.codepostale = :codepostale"),
    @NamedQuery(name = "Organismes.findByFax", query = "SELECT o FROM Organismes o WHERE o.fax = :fax")})
public class Organismes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorganismes")
    private Integer idorganismes;
    @Size(max = 445)
    @Column(name = "Nomfr")
    private String nomfr;
    @Size(max = 45)
    @Column(name = "nomar")
    private String nomar;
    @Size(max = 45)
    @Column(name = "statut")
    private String statut;
    @Size(max = 45)
    @Column(name = "adresse")
    private String adresse;
    @Size(max = 45)
    @Column(name = "ville")
    private String ville;
    @Size(max = 45)
    @Column(name = "codepostale")
    private String codepostale;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "fax")
    private String fax;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organismesIdorganismes")
    private List<Organigrames> organigramesList;

    /**
     *
     */
    public Organismes() {
    }

    /**
     *
     * @param idorganismes
     */
    public Organismes(Integer idorganismes) {
        this.idorganismes = idorganismes;
    }

    /**
     *
     * @return
     */
    public Integer getIdorganismes() {
        return idorganismes;
    }

    /**
     *
     * @param idorganismes
     */
    public void setIdorganismes(Integer idorganismes) {
        this.idorganismes = idorganismes;
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
    public String getStatut() {
        return statut;
    }

    /**
     *
     * @param statut
     */
    public void setStatut(String statut) {
        this.statut = statut;
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
    public String getVille() {
        return ville;
    }

    /**
     *
     * @param ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     *
     * @return
     */
    public String getCodepostale() {
        return codepostale;
    }

    /**
     *
     * @param codepostale
     */
    public void setCodepostale(String codepostale) {
        this.codepostale = codepostale;
    }

    /**
     *
     * @return
     */
    public String getFax() {
        return fax;
    }

    /**
     *
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Organigrames> getOrganigramesList() {
        return organigramesList;
    }

    /**
     *
     * @param organigramesList
     */
    public void setOrganigramesList(List<Organigrames> organigramesList) {
        this.organigramesList = organigramesList;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorganismes != null ? idorganismes.hashCode() : 0);
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
        if (!(object instanceof Organismes)) {
            return false;
        }
        Organismes other = (Organismes) object;
        if ((this.idorganismes == null && other.idorganismes != null) || (this.idorganismes != null && !this.idorganismes.equals(other.idorganismes))) {
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
        return "Competences.org.entityPK.Organismes[ idorganismes=" + idorganismes + " ]";
    }
    
}
