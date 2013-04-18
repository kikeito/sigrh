/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityPk;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author uvt
 */
@Entity
@Table(name = "params_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParamsDetails.findAll", query = "SELECT p FROM ParamsDetails p"),
    @NamedQuery(name = "ParamsDetails.findByIdparamsDetails", query = "SELECT p FROM ParamsDetails p WHERE p.idparamsDetails = :idparamsDetails"),
    @NamedQuery(name = "ParamsDetails.findByDate1", query = "SELECT p FROM ParamsDetails p WHERE p.date1 = :date1"),
    @NamedQuery(name = "ParamsDetails.findByDate2", query = "SELECT p FROM ParamsDetails p WHERE p.date2 = :date2")})
public class ParamsDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idparams_details")
    private Integer idparamsDetails;
    @Column(name = "date1")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date1;
    @Column(name = "date2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date2;
    @JoinColumn(name = "personnel_idpersonnel", referencedColumnName = "idpersonnel")
    @ManyToOne(optional = false)
    private Personnel personnelIdpersonnel;
    @JoinColumn(name = "params_idparams", referencedColumnName = "idparams")
    @ManyToOne(optional = false)
    private Params paramsIdparams;

    public ParamsDetails() {
    }

    public ParamsDetails(Integer idparamsDetails) {
        this.idparamsDetails = idparamsDetails;
    }

    public Integer getIdparamsDetails() {
        return idparamsDetails;
    }

    public void setIdparamsDetails(Integer idparamsDetails) {
        this.idparamsDetails = idparamsDetails;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public Personnel getPersonnelIdpersonnel() {
        return personnelIdpersonnel;
    }

    public void setPersonnelIdpersonnel(Personnel personnelIdpersonnel) {
        this.personnelIdpersonnel = personnelIdpersonnel;
    }

    public Params getParamsIdparams() {
        return paramsIdparams;
    }

    public void setParamsIdparams(Params paramsIdparams) {
        this.paramsIdparams = paramsIdparams;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparamsDetails != null ? idparamsDetails.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParamsDetails)) {
            return false;
        }
        ParamsDetails other = (ParamsDetails) object;
        if ((this.idparamsDetails == null && other.idparamsDetails != null) || (this.idparamsDetails != null && !this.idparamsDetails.equals(other.idparamsDetails))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityPk.ParamsDetails[ idparamsDetails=" + idparamsDetails + " ]";
    }
    
}
