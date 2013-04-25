/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityPk;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
 * @author uvt
 */
@Entity
@Table(name = "params")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Params.findAll", query = "SELECT p FROM Params p"),
    @NamedQuery(name = "Params.findByIdparams", query = "SELECT p FROM Params p WHERE p.idparams = :idparams"),
    @NamedQuery(name = "Params.findByType", query = "SELECT p FROM Params p WHERE p.type = :type"),
    @NamedQuery(name = "Params.findById", query = "SELECT p FROM Params p WHERE p.id = :id")})
public class Params implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "idparams")
    private String idparams;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paramsIdparams")
    private Collection<ParamsLang> paramsLangCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paramsIdparams")
    private Collection<ParamsDetails> paramsDetailsCollection;

    /**
     *
     */
    public Params() {
    }

    /**
     *
     * @param idparams
     */
    public Params(String idparams) {
        this.idparams = idparams;
    }

    /**
     *
     * @return
     */
    public String getIdparams() {
        return idparams;
    }

    /**
     *
     * @param idparams
     */
    public void setIdparams(String idparams) {
        this.idparams = idparams;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public Collection<ParamsLang> getParamsLangCollection() {
        return paramsLangCollection;
    }

    /**
     *
     * @param paramsLangCollection
     */
    public void setParamsLangCollection(Collection<ParamsLang> paramsLangCollection) {
        this.paramsLangCollection = paramsLangCollection;
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
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparams != null ? idparams.hashCode() : 0);
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
        if (!(object instanceof Params)) {
            return false;
        }
        Params other = (Params) object;
        if ((this.idparams == null && other.idparams != null) || (this.idparams != null && !this.idparams.equals(other.idparams))) {
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
        return "EntityPk.Params[ idparams=" + idparams + " ]";
    }
    
}
