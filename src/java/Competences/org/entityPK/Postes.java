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
@Table(name = "postes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Postes.findAll", query = "SELECT p FROM Postes p"),
    @NamedQuery(name = "Postes.findByIdpostes", query = "SELECT p FROM Postes p WHERE p.idpostes = :idpostes"),
    @NamedQuery(name = "Postes.findByNomfr", query = "SELECT p FROM Postes p WHERE p.nomfr = :nomfr"),
    @NamedQuery(name = "Postes.findByNomar", query = "SELECT p FROM Postes p WHERE p.nomar = :nomar"),
    @NamedQuery(name = "Postes.findByPoid", query = "SELECT p FROM Postes p WHERE p.poid = :poid")})
public class Postes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "idpostes")
    private String idpostes;
    @Size(max = 45)
    @Column(name = "Nomfr")
    private String nomfr;
    @Size(max = 45)
    @Column(name = "nomar")
    private String nomar;
    @Size(max = 45)
    @Column(name = "Poid")
    private String poid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postesIdpostes")
    private List<Haveposte> haveposteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postesIdpostes")
    private List<Attributions> attributionsList;
    @OneToMany(mappedBy = "postesIdpostes")
    private List<Postes> postesList;
    @JoinColumn(name = "postes_idpostes", referencedColumnName = "idpostes")
    @ManyToOne
    private Postes postesIdpostes;
    @JoinColumn(name = "organigrames_idorganigrame", referencedColumnName = "idorganigrame")
    @ManyToOne(optional = false)
    private Organigrames organigramesIdorganigrame;
    @JoinColumn(name = "modelreferentiels_idmodelreferentiels", referencedColumnName = "idmodelreferentiels")
    @ManyToOne(optional = false)
    private Modelreferentiels modelreferentielsIdmodelreferentiels;

    /**
     *
     */
    public Postes() {
    }

    /**
     *
     * @param idpostes
     */
    public Postes(String idpostes) {
        this.idpostes = idpostes;
    }

    /**
     *
     * @return
     */
    public String getIdpostes() {
        return idpostes;
    }

    /**
     *
     * @param idpostes
     */
    public void setIdpostes(String idpostes) {
        this.idpostes = idpostes;
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
    public String getPoid() {
        return poid;
    }

    /**
     *
     * @param poid
     */
    public void setPoid(String poid) {
        this.poid = poid;
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

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Attributions> getAttributionsList() {
        return attributionsList;
    }

    /**
     *
     * @param attributionsList
     */
    public void setAttributionsList(List<Attributions> attributionsList) {
        this.attributionsList = attributionsList;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Postes> getPostesList() {
        return postesList;
    }

    /**
     *
     * @param postesList
     */
    public void setPostesList(List<Postes> postesList) {
        this.postesList = postesList;
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
    public Organigrames getOrganigramesIdorganigrame() {
        return organigramesIdorganigrame;
    }

    /**
     *
     * @param organigramesIdorganigrame
     */
    public void setOrganigramesIdorganigrame(Organigrames organigramesIdorganigrame) {
        this.organigramesIdorganigrame = organigramesIdorganigrame;
    }

    /**
     *
     * @return
     */
    public Modelreferentiels getModelreferentielsIdmodelreferentiels() {
        return modelreferentielsIdmodelreferentiels;
    }

    /**
     *
     * @param modelreferentielsIdmodelreferentiels
     */
    public void setModelreferentielsIdmodelreferentiels(Modelreferentiels modelreferentielsIdmodelreferentiels) {
        this.modelreferentielsIdmodelreferentiels = modelreferentielsIdmodelreferentiels;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpostes != null ? idpostes.hashCode() : 0);
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
        if (!(object instanceof Postes)) {
            return false;
        }
        Postes other = (Postes) object;
        if ((this.idpostes == null && other.idpostes != null) || (this.idpostes != null && !this.idpostes.equals(other.idpostes))) {
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
        return "Competences.org.entityPK.Postes[ idpostes=" + idpostes + " ]";
    }
    
}
