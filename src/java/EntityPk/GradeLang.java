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
@Table(name = "grade_lang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GradeLang.findAll", query = "SELECT g FROM GradeLang g"),
    @NamedQuery(name = "GradeLang.findByIdgradeLang", query = "SELECT g FROM GradeLang g WHERE g.idgradeLang = :idgradeLang"),
    @NamedQuery(name = "GradeLang.findByIntitule", query = "SELECT g FROM GradeLang g WHERE g.intitule = :intitule")})
public class GradeLang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgrade_lang")
    private Integer idgradeLang;
    @Size(max = 255)
    @Column(name = "intitule")
    private String intitule;
    @JoinColumn(name = "lang_idlang", referencedColumnName = "idlang")
    @ManyToOne(optional = false)
    private Lang langIdlang;
    @JoinColumn(name = "grade_idgrade", referencedColumnName = "idgrade")
    @ManyToOne(optional = false)
    private Grade gradeIdgrade;

    public GradeLang() {
    }

    public GradeLang(Integer idgradeLang) {
        this.idgradeLang = idgradeLang;
    }

    public Integer getIdgradeLang() {
        return idgradeLang;
    }

    public void setIdgradeLang(Integer idgradeLang) {
        this.idgradeLang = idgradeLang;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Lang getLangIdlang() {
        return langIdlang;
    }

    public void setLangIdlang(Lang langIdlang) {
        this.langIdlang = langIdlang;
    }

    public Grade getGradeIdgrade() {
        return gradeIdgrade;
    }

    public void setGradeIdgrade(Grade gradeIdgrade) {
        this.gradeIdgrade = gradeIdgrade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgradeLang != null ? idgradeLang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GradeLang)) {
            return false;
        }
        GradeLang other = (GradeLang) object;
        if ((this.idgradeLang == null && other.idgradeLang != null) || (this.idgradeLang != null && !this.idgradeLang.equals(other.idgradeLang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityPk.GradeLang[ idgradeLang=" + idgradeLang + " ]";
    }
    
}
