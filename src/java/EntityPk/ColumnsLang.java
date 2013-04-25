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
@Table(name = "columns_lang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnsLang.findAll", query = "SELECT c FROM ColumnsLang c"),
    @NamedQuery(name = "ColumnsLang.findByIdcolumnsLang", query = "SELECT c FROM ColumnsLang c WHERE c.idcolumnsLang = :idcolumnsLang"),
    @NamedQuery(name = "ColumnsLang.findByLabel", query = "SELECT c FROM ColumnsLang c WHERE c.label = :label")})
public class ColumnsLang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcolumns_lang")
    private Integer idcolumnsLang;
    @Size(max = 255)
    @Column(name = "label")
    private String label;
    @JoinColumn(name = "lang_idlang", referencedColumnName = "idlang")
    @ManyToOne(optional = false)
    private Lang langIdlang;

    /**
     *
     */
    public ColumnsLang() {
    }

    /**
     *
     * @param idcolumnsLang
     */
    public ColumnsLang(Integer idcolumnsLang) {
        this.idcolumnsLang = idcolumnsLang;
    }

    /**
     *
     * @return
     */
    public Integer getIdcolumnsLang() {
        return idcolumnsLang;
    }

    /**
     *
     * @param idcolumnsLang
     */
    public void setIdcolumnsLang(Integer idcolumnsLang) {
        this.idcolumnsLang = idcolumnsLang;
    }

    /**
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
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
        hash += (idcolumnsLang != null ? idcolumnsLang.hashCode() : 0);
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
        if (!(object instanceof ColumnsLang)) {
            return false;
        }
        ColumnsLang other = (ColumnsLang) object;
        if ((this.idcolumnsLang == null && other.idcolumnsLang != null) || (this.idcolumnsLang != null && !this.idcolumnsLang.equals(other.idcolumnsLang))) {
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
        return "EntityPk.ColumnsLang[ idcolumnsLang=" + idcolumnsLang + " ]";
    }
    
}
