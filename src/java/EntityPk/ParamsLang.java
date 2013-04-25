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
@Table(name = "params_lang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParamsLang.findAll", query = "SELECT p FROM ParamsLang p"),
    @NamedQuery(name = "ParamsLang.findByIdparamsLang", query = "SELECT p FROM ParamsLang p WHERE p.idparamsLang = :idparamsLang"),
    @NamedQuery(name = "ParamsLang.findByIntitule", query = "SELECT p FROM ParamsLang p WHERE p.intitule = :intitule")})
public class ParamsLang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idparams_lang")
    private Integer idparamsLang;
    @Size(max = 255)
    @Column(name = "intitule")
    private String intitule;
    @JoinColumn(name = "params_idparams", referencedColumnName = "idparams")
    @ManyToOne(optional = false)
    private Params paramsIdparams;
    @JoinColumn(name = "lang_idlang", referencedColumnName = "idlang")
    @ManyToOne(optional = false)
    private Lang langIdlang;

    /**
     *
     */
    public ParamsLang() {
    }

    /**
     *
     * @param idparamsLang
     */
    public ParamsLang(Integer idparamsLang) {
        this.idparamsLang = idparamsLang;
    }

    /**
     *
     * @return
     */
    public Integer getIdparamsLang() {
        return idparamsLang;
    }

    /**
     *
     * @param idparamsLang
     */
    public void setIdparamsLang(Integer idparamsLang) {
        this.idparamsLang = idparamsLang;
    }

    /**
     *
     * @return
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     *
     * @param intitule
     */
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    /**
     *
     * @return
     */
    public Params getParamsIdparams() {
        return paramsIdparams;
    }

    /**
     *
     * @param paramsIdparams
     */
    public void setParamsIdparams(Params paramsIdparams) {
        this.paramsIdparams = paramsIdparams;
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
        hash += (idparamsLang != null ? idparamsLang.hashCode() : 0);
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
        if (!(object instanceof ParamsLang)) {
            return false;
        }
        ParamsLang other = (ParamsLang) object;
        if ((this.idparamsLang == null && other.idparamsLang != null) || (this.idparamsLang != null && !this.idparamsLang.equals(other.idparamsLang))) {
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
        return "EntityPk.ParamsLang[ idparamsLang=" + idparamsLang + " ]";
    }
    
}
