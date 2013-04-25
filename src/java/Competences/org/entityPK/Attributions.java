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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author HAMED
 */
@Entity
@Table(name = "attributions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Attributions.findAll", query = "SELECT a FROM Attributions a"),
    @NamedQuery(name = "Attributions.findByIdattributions", query = "SELECT a FROM Attributions a WHERE a.idattributions = :idattributions"),
    @NamedQuery(name = "Attributions.findByNomfr", query = "SELECT a FROM Attributions a WHERE a.nomfr = :nomfr"),
    @NamedQuery(name = "Attributions.findByAttributionscolar", query = "SELECT a FROM Attributions a WHERE a.attributionscolar = :attributionscolar")})
public class Attributions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idattributions")
    private Integer idattributions;
    @Size(max = 445)
    @Column(name = "nomfr")
    private String nomfr;
    @Size(max = 45)
    @Column(name = "attributionscolar")
    private String attributionscolar;
    @JoinColumn(name = "postes_idpostes", referencedColumnName = "idpostes")
    @ManyToOne(optional = false)
    private Postes postesIdpostes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "attributionsIdattributions")
    private List<Attributionrefcomp> attributionrefcompList;

    /**
     *
     */
    public Attributions() {
    }

    /**
     *
     * @param idattributions
     */
    public Attributions(Integer idattributions) {
        this.idattributions = idattributions;
    }

    /**
     *
     * @return
     */
    public Integer getIdattributions() {
        return idattributions;
    }

    /**
     *
     * @param idattributions
     */
    public void setIdattributions(Integer idattributions) {
        this.idattributions = idattributions;
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
    public String getAttributionscolar() {
        return attributionscolar;
    }

    /**
     *
     * @param attributionscolar
     */
    public void setAttributionscolar(String attributionscolar) {
        this.attributionscolar = attributionscolar;
    }

    /**
     *
     * @return
     */
    public Postes getPostesIdpostes() {
        return postesIdpostes;
    }

    /**
     *
     * @param postesIdpostes
     */
    public void setPostesIdpostes(Postes postesIdpostes) {
        this.postesIdpostes = postesIdpostes;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Attributionrefcomp> getAttributionrefcompList() {
        return attributionrefcompList;
    }

    /**
     *
     * @param attributionrefcompList
     */
    public void setAttributionrefcompList(List<Attributionrefcomp> attributionrefcompList) {
        this.attributionrefcompList = attributionrefcompList;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idattributions != null ? idattributions.hashCode() : 0);
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
        if (!(object instanceof Attributions)) {
            return false;
        }
        Attributions other = (Attributions) object;
        if ((this.idattributions == null && other.idattributions != null) || (this.idattributions != null && !this.idattributions.equals(other.idattributions))) {
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
        return "Competences.org.entityPK.Attributions[ idattributions=" + idattributions + " ]";
    }
    
}
