/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityPk;

import Competences.org.entityPK.Haveposte;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author uvt
 */
@Entity
@Table(name = "personnel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personnel.findAll", query = "SELECT p FROM Personnel p"),
    @NamedQuery(name = "Personnel.findByIdpersonnel", query = "SELECT p FROM Personnel p WHERE p.idpersonnel = :idpersonnel"),
    @NamedQuery(name = "Personnel.findByCnrps", query = "SELECT p FROM Personnel p WHERE p.cnrps = :cnrps"),
    @NamedQuery(name = "Personnel.findByCin", query = "SELECT p FROM Personnel p WHERE p.cin = :cin"),
    @NamedQuery(name = "Personnel.findByEmail", query = "SELECT p FROM Personnel p WHERE p.email = :email"),
    @NamedQuery(name = "Personnel.findBySpecialite", query = "SELECT p FROM Personnel p WHERE p.specialite = :specialite"),
    @NamedQuery(name = "Personnel.findByTel", query = "SELECT p FROM Personnel p WHERE p.tel = :tel"),
    @NamedQuery(name = "Personnel.findByFax", query = "SELECT p FROM Personnel p WHERE p.fax = :fax"),
    @NamedQuery(name = "Personnel.findByAddresse", query = "SELECT p FROM Personnel p WHERE p.addresse = :addresse"),
    @NamedQuery(name = "Personnel.findByCodepostal", query = "SELECT p FROM Personnel p WHERE p.codepostal = :codepostal"),
    @NamedQuery(name = "Personnel.findByVille", query = "SELECT p FROM Personnel p WHERE p.ville = :ville"),
    @NamedQuery(name = "Personnel.findByDateUpd", query = "SELECT p FROM Personnel p WHERE p.dateUpd = :dateUpd"),
    @NamedQuery(name = "Personnel.findByDateAdd", query = "SELECT p FROM Personnel p WHERE p.dateAdd = :dateAdd"),
    @NamedQuery(name = "Personnel.findByActive", query = "SELECT p FROM Personnel p WHERE p.active = :active"),
    @NamedQuery(name = "Personnel.findByPosition", query = "SELECT p FROM Personnel p WHERE p.position = :position"),
    @NamedQuery(name = "Personnel.findByDeleted", query = "SELECT p FROM Personnel p WHERE p.deleted = :deleted")})
public class Personnel implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personnelIdpersonnel")
    private List<Haveposte> haveposteList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpersonnel")
    private Integer idpersonnel;
    @Size(max = 45)
    @Column(name = "cnrps")
    private String cnrps;
    @Size(max = 45)
    @Column(name = "cin")
    private String cin;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "specialite")
    private String specialite;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "fax")
    private String fax;
    @Size(max = 45)
    @Column(name = "addresse")
    private String addresse;
    @Size(max = 45)
    @Column(name = "codepostal")
    private String codepostal;
    @Size(max = 45)
    @Column(name = "Ville")
    private String ville;
    @Column(name = "date_upd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpd;
    @Column(name = "date_add")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdd;
    @Column(name = "active")
    private Short active;
    @Basic(optional = false)
    @NotNull
    @Column(name = "position")
    private int position;
    @Column(name = "deleted")
    private Short deleted;
    @JoinColumn(name = "grade_idgrade", referencedColumnName = "idgrade")
    @ManyToOne(optional = false)
    private Grade gradeIdgrade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personnelIdpersonnel")
    private Collection<ParamsDetails> paramsDetailsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personnelIdpersonnel")
    private Collection<PersonnelLang> personnelLangCollection;

    /**
     *
     */
    public Personnel() {
    }

    /**
     *
     * @param idpersonnel
     */
    public Personnel(Integer idpersonnel) {
        this.idpersonnel = idpersonnel;
    }

    /**
     *
     * @param idpersonnel
     * @param position
     */
    public Personnel(Integer idpersonnel, int position) {
        this.idpersonnel = idpersonnel;
        this.position = position;
    }

    /**
     *
     * @return
     */
    public Integer getIdpersonnel() {
        return idpersonnel;
    }

    /**
     *
     * @param idpersonnel
     */
    public void setIdpersonnel(Integer idpersonnel) {
        this.idpersonnel = idpersonnel;
    }

    /**
     *
     * @return
     */
    public String getCnrps() {
        return cnrps;
    }

    /**
     *
     * @param cnrps
     */
    public void setCnrps(String cnrps) {
        this.cnrps = cnrps;
    }

    /**
     *
     * @return
     */
    public String getCin() {
        return cin;
    }

    /**
     *
     * @param cin
     */
    public void setCin(String cin) {
        this.cin = cin;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getSpecialite() {
        return specialite;
    }

    /**
     *
     * @param specialite
     */
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
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
    public String getAddresse() {
        return addresse;
    }

    /**
     *
     * @param addresse
     */
    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    /**
     *
     * @return
     */
    public String getCodepostal() {
        return codepostal;
    }

    /**
     *
     * @param codepostal
     */
    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
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
    public Date getDateUpd() {
        return dateUpd;
    }

    /**
     *
     * @param dateUpd
     */
    public void setDateUpd(Date dateUpd) {
        this.dateUpd = dateUpd;
    }

    /**
     *
     * @return
     */
    public Date getDateAdd() {
        return dateAdd;
    }

    /**
     *
     * @param dateAdd
     */
    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
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
    public int getPosition() {
        return position;
    }

    /**
     *
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
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
    public Grade getGradeIdgrade() {
        return gradeIdgrade;
    }

    /**
     *
     * @param gradeIdgrade
     */
    public void setGradeIdgrade(Grade gradeIdgrade) {
        this.gradeIdgrade = gradeIdgrade;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public Collection<ParamsDetails> getParamsDetailsCollection() {
        return paramsDetailsCollection;
    }

    /**
     *
     * @param paramsDetailsCollection
     */
    public void setParamsDetailsCollection(Collection<ParamsDetails> paramsDetailsCollection) {
        this.paramsDetailsCollection = paramsDetailsCollection;
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
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersonnel != null ? idpersonnel.hashCode() : 0);
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
        if (!(object instanceof Personnel)) {
            return false;
        }
        Personnel other = (Personnel) object;
        if ((this.idpersonnel == null && other.idpersonnel != null) || (this.idpersonnel != null && !this.idpersonnel.equals(other.idpersonnel))) {
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
        return "EntityPk.Personnel[ idpersonnel=" + idpersonnel + " ]";
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Haveposte> getHaveposteList() {
        return haveposteList;
    }

    /**
     *
     * @param haveposteList
     */
    public void setHaveposteList(List<Haveposte> haveposteList) {
        this.haveposteList = haveposteList;
    }
    
}
