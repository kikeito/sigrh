/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Competences.org.entityPK;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HAMED
 */
@Entity
@Table(name = "formations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formations.findAll", query = "SELECT f FROM Formations f"),
    @NamedQuery(name = "Formations.findByIdformations", query = "SELECT f FROM Formations f WHERE f.idformations = :idformations"),
    @NamedQuery(name = "Formations.findByDateDebut", query = "SELECT f FROM Formations f WHERE f.dateDebut = :dateDebut"),
    @NamedQuery(name = "Formations.findByDateFin", query = "SELECT f FROM Formations f WHERE f.dateFin = :dateFin")})
public class Formations implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idformations")
    private Long idformations;
    @Column(name = "dateDebut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "dateFin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formationsIdformations")
    private List<Fournisseursformation> fournisseursformationList;
    @JoinColumn(name = "typeformation_idtypeformation", referencedColumnName = "idtypeformation")
    @ManyToOne(optional = false)
    private Typeformation typeformationIdtypeformation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formationsIdformations")
    private List<Catalogueformations> catalogueformationsList;

    /**
     *
     */
    public Formations() {
    }

    /**
     *
     * @param idformations
     */
    public Formations(Long idformations) {
        this.idformations = idformations;
    }

    /**
     *
     * @return
     */
    public Long getIdformations() {
        return idformations;
    }

    /**
     *
     * @param idformations
     */
    public void setIdformations(Long idformations) {
        this.idformations = idformations;
    }

    /**
     *
     * @return
     */
    public Date getDateDebut() {
        return dateDebut;
    }

    /**
     *
     * @param dateDebut
     */
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     *
     * @return
     */
    public Date getDateFin() {
        return dateFin;
    }

    /**
     *
     * @param dateFin
     */
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
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
    public Typeformation getTypeformationIdtypeformation() {
        return typeformationIdtypeformation;
    }

    /**
     *
     * @param typeformationIdtypeformation
     */
    public void setTypeformationIdtypeformation(Typeformation typeformationIdtypeformation) {
        this.typeformationIdtypeformation = typeformationIdtypeformation;
    }

    /**
     *
     * @return
     */
    @XmlTransient
    public List<Catalogueformations> getCatalogueformationsList() {
        return catalogueformationsList;
    }

    /**
     *
     * @param catalogueformationsList
     */
    public void setCatalogueformationsList(List<Catalogueformations> catalogueformationsList) {
        this.catalogueformationsList = catalogueformationsList;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idformations != null ? idformations.hashCode() : 0);
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
        if (!(object instanceof Formations)) {
            return false;
        }
        Formations other = (Formations) object;
        if ((this.idformations == null && other.idformations != null) || (this.idformations != null && !this.idformations.equals(other.idformations))) {
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
        return "Competences.org.entityPK.Formations[ idformations=" + idformations + " ]";
    }
    
}
