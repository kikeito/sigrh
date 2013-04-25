/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityPk;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author uvt
 */
@Entity
@Table(name = "personnel_lang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonnelLang.findAll", query = "SELECT p FROM PersonnelLang p"),
    @NamedQuery(name = "PersonnelLang.findByIdpersonnelLang", query = "SELECT p FROM PersonnelLang p WHERE p.idpersonnelLang = :idpersonnelLang"),
    @NamedQuery(name = "PersonnelLang.findByNom", query = "SELECT p FROM PersonnelLang p WHERE p.nom = :nom"),
    @NamedQuery(name = "PersonnelLang.findByPrenom", query = "SELECT p FROM PersonnelLang p WHERE p.prenom = :prenom")})
public class PersonnelLang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpersonnel_lang")
    private Integer idpersonnelLang;
    @Size(max = 45)
    @Column(name = "nom")
    private String nom;
    @Size(max = 45)
    @Column(name = "prenom")
    private String prenom;
    @JoinColumn(name = "personnel_idpersonnel", referencedColumnName = "idpersonnel")
    @ManyToOne(optional = false)
    private Personnel personnelIdpersonnel;
    @JoinColumn(name = "lang_idlang", referencedColumnName = "idlang")
    @ManyToOne(optional = false)
    private Lang langIdlang;

    /**
     *
     */
    public PersonnelLang() {
    }

    /**
     *
     * @param idpersonnelLang
     */
    public PersonnelLang(Integer idpersonnelLang) {
        this.idpersonnelLang = idpersonnelLang;
    }

    /**
     *
     * @return
     */
    public Integer getIdpersonnelLang() {
        return idpersonnelLang;
    }

    /**
     *
     * @param idpersonnelLang
     */
    public void setIdpersonnelLang(Integer idpersonnelLang) {
        this.idpersonnelLang = idpersonnelLang;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return
     */
    public Personnel getPersonnelIdpersonnel() {
        return personnelIdpersonnel;
    }

    /**
     *
     * @param personnelIdpersonnel
     */
    public void setPersonnelIdpersonnel(Personnel personnelIdpersonnel) {
        this.personnelIdpersonnel = personnelIdpersonnel;
    }

    /**
     *
     * @return
     */
    public Lang getLangIdlang() {
        return langIdlang;
    }

    /**
     *
     * @param langIdlang
     */
    public void setLangIdlang(Lang langIdlang) {
        this.langIdlang = langIdlang;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersonnelLang != null ? idpersonnelLang.hashCode() : 0);
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
        if (!(object instanceof PersonnelLang)) {
            return false;
        }
        PersonnelLang other = (PersonnelLang) object;
        if ((this.idpersonnelLang == null && other.idpersonnelLang != null) || (this.idpersonnelLang != null && !this.idpersonnelLang.equals(other.idpersonnelLang))) {
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
        return "EntityPk.PersonnelLang[ idpersonnelLang=" + idpersonnelLang + " ]";
    }
    
}
