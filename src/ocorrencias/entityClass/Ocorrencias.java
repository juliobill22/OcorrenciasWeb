/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocorrencias.entityClass;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author julioenglish
 */
@Entity
@Table(catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ocorrencias.findAll", query = "SELECT o FROM Ocorrencias o")
    , @NamedQuery(name = "Ocorrencias.findByIdOcorrencias", query = "SELECT o FROM Ocorrencias o WHERE o.idOcorrencias = :idOcorrencias")
    , @NamedQuery(name = "Ocorrencias.findByDataDtOcorrencia", query = "SELECT o FROM Ocorrencias o WHERE o.dataDtOcorrencia = :dataDtOcorrencia")
    , @NamedQuery(name = "Ocorrencias.findByMotivostOcorrencia", query = "SELECT o FROM Ocorrencias o WHERE o.motivostOcorrencia = :motivostOcorrencia")})
public class Ocorrencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idOcorrencias;
    @Column(name = "Data_Dt_Ocorrencia")
    @Temporal(TemporalType.DATE)
    private Date dataDtOcorrencia;
    @Column(name = "Motivo_st_Ocorrencia", length = 500)
    private String motivostOcorrencia;
    @JoinColumn(name = "Leis_idLeis", referencedColumnName = "idLeis", nullable = false)
    @ManyToOne(optional = false)
    private Leis leisidLeis;
    @JoinColumn(name = "Pessoa_Id_Int_Pessoa", referencedColumnName = "Id_Int_Pessoa", nullable = false)
    @ManyToOne(optional = false)
    private Pessoa pessoaIdIntPessoa;

    public Ocorrencias() {
    }

    public Ocorrencias(Integer idOcorrencias) {
        this.idOcorrencias = idOcorrencias;
    }

    public Integer getIdOcorrencias() {
        return idOcorrencias;
    }

    public void setIdOcorrencias(Integer idOcorrencias) {
        this.idOcorrencias = idOcorrencias;
    }

    public Date getDataDtOcorrencia() {
        return dataDtOcorrencia;
    }

    public void setDataDtOcorrencia(Date dataDtOcorrencia) {
        this.dataDtOcorrencia = dataDtOcorrencia;
    }

    public String getMotivostOcorrencia() {
        return motivostOcorrencia;
    }

    public void setMotivostOcorrencia(String motivostOcorrencia) {
        this.motivostOcorrencia = motivostOcorrencia;
    }

    public Leis getLeisidLeis() {
        return leisidLeis;
    }

    public void setLeisidLeis(Leis leisidLeis) {
        this.leisidLeis = leisidLeis;
    }

    public Pessoa getPessoaIdIntPessoa() {
        return pessoaIdIntPessoa;
    }

    public void setPessoaIdIntPessoa(Pessoa pessoaIdIntPessoa) {
        this.pessoaIdIntPessoa = pessoaIdIntPessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOcorrencias != null ? idOcorrencias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ocorrencias)) {
            return false;
        }
        Ocorrencias other = (Ocorrencias) object;
        if ((this.idOcorrencias == null && other.idOcorrencias != null) || (this.idOcorrencias != null && !this.idOcorrencias.equals(other.idOcorrencias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ocorrencias.entityClass.Ocorrencias[ idOcorrencias=" + idOcorrencias + " ]";
    }
    
}
