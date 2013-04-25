/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Competences.org.entityPK;

import EntityPk.Personnel;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HAMED
 */
@Entity
@Table(name = "haveposte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Haveposte.findAll", query = "SELECT h FROM Haveposte h"),
    @NamedQuery(name = "Haveposte.findByIdtable1", query = "SELECT h FROM Haveposte h WHERE h.idtable1 = :idtable1")})
public class Haveposte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtable1")
    private Integer idtable1;
    @JoinColumn(name = "postes_idpostes", referencedColumnName = "idpostes")
    @ManyToOne(optional = false)
    private Postes postesIdpostes;
    @JoinColumn(name = "personnel_idpersonnel", referencedColumnName = "idpersonnel")
    @ManyToOne(optional = false)
    private Personnel personnelIdpersonnel;

    /**
     *
     */
    public Haveposte() {
    }

    /**
     *
     * @param idtable1
     */
    public Haveposte(Integer idtable1) {
        this.idtable1 = idtable1;
    }

    /**
     *
     * @return
     */
    public Integer getIdtable1() {
        return idtable1;
    }

    /**
     *
     * @param idtable1
     */
    public void setIdtable1(Integer idtable1) {
        this.idtable1 = idtable1;
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
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtable1 != null ? idtable1.hashCode() : 0);
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
        if (!(object instanceof Haveposte)) {
            return false;
        }
        Haveposte other = (Haveposte) object;
        if ((this.idtable1 == null && other.idtable1 != null) || (this.idtable1 != null && !this.idtable1.equals(other.idtable1))) {
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
        return "Competences.org.entityPK.Haveposte[ idtable1=" + idtable1 + " ]";
    }
    
}
