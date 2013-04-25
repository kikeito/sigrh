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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HAMED
 */
@Entity
@Table(name = "organigrames")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Organigrames.findAll", query = "SELECT o FROM Organigrames o"),
    @NamedQuery(name = "Organigrames.findByIdorganigrame", query = "SELECT o FROM Organigrames o WHERE o.idorganigrame = :idorganigrame")})
public class Organigrames implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorganigrame")
    private Integer idorganigrame;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organigramesIdorganigrame")
    private List<Postes> postesList;
    @JoinColumn(name = "organismes_idorganismes", referencedColumnName = "idorganismes")
    @ManyToOne(optional = false)
    private Organismes organismesIdorganismes;

    /**
     *
     */
    public Organigrames() {
    }

    /**
     *
     * @param idorganigrame
     */
    public Organigrames(Integer idorganigrame) {
        this.idorganigrame = idorganigrame;
    }

    /**
     *
     * @return
     */
    public Integer getIdorganigrame() {
        return idorganigrame;
    }

    /**
     *
     * @param idorganigrame
     */
    public void setIdorganigrame(Integer idorganigrame) {
        this.idorganigrame = idorganigrame;
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
    public Organismes getOrganismesIdorganismes() {
        return organismesIdorganismes;
    }

    /**
     *
     * @param organismesIdorganismes
     */
    public void setOrganismesIdorganismes(Organismes organismesIdorganismes) {
        this.organismesIdorganismes = organismesIdorganismes;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorganigrame != null ? idorganigrame.hashCode() : 0);
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
        if (!(object instanceof Organigrames)) {
            return false;
        }
        Organigrames other = (Organigrames) object;
        if ((this.idorganigrame == null && other.idorganigrame != null) || (this.idorganigrame != null && !this.idorganigrame.equals(other.idorganigrame))) {
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
        return "Competences.org.entityPK.Organigrames[ idorganigrame=" + idorganigrame + " ]";
    }
    
}
