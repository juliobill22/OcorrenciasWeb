/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocorrencias.entityClass;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author julioenglish
 */
@Entity
@Table(catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipopessoa.findAll", query = "SELECT t FROM Tipopessoa t")
    , @NamedQuery(name = "Tipopessoa.findByIdIntTipoPessoa", query = "SELECT t FROM Tipopessoa t WHERE t.idIntTipoPessoa = :idIntTipoPessoa")
    , @NamedQuery(name = "Tipopessoa.findByTipoStPessoa", query = "SELECT t FROM Tipopessoa t WHERE t.tipoStPessoa = :tipoStPessoa")})
public class Tipopessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Int_TipoPessoa", nullable = false)
    private Integer idIntTipoPessoa;
    @Column(name = "Tipo_St_Pessoa", length = 1)
    private String tipoStPessoa;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tipopessoa")
    private Pessoajuridica pessoajuridica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoPessoaIdIntTipoPessoa")
    private List<Pessoa> pessoaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipopessoa")
    private List<Pessoafisica> pessoafisicaList;

    public Tipopessoa() {
    }

    public Tipopessoa(Integer idIntTipoPessoa) {
        this.idIntTipoPessoa = idIntTipoPessoa;
    }

    public Integer getIdIntTipoPessoa() {
        return idIntTipoPessoa;
    }

    public void setIdIntTipoPessoa(Integer idIntTipoPessoa) {
        this.idIntTipoPessoa = idIntTipoPessoa;
    }

    public String getTipoStPessoa() {
        return tipoStPessoa;
    }

    public void setTipoStPessoa(String tipoStPessoa) {
        this.tipoStPessoa = tipoStPessoa;
    }

    public Pessoajuridica getPessoajuridica() {
        return pessoajuridica;
    }

    public void setPessoajuridica(Pessoajuridica pessoajuridica) {
        this.pessoajuridica = pessoajuridica;
    }

    @XmlTransient
    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    public void setPessoaList(List<Pessoa> pessoaList) {
        this.pessoaList = pessoaList;
    }

    @XmlTransient
    public List<Pessoafisica> getPessoafisicaList() {
        return pessoafisicaList;
    }

    public void setPessoafisicaList(List<Pessoafisica> pessoafisicaList) {
        this.pessoafisicaList = pessoafisicaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIntTipoPessoa != null ? idIntTipoPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopessoa)) {
            return false;
        }
        Tipopessoa other = (Tipopessoa) object;
        if ((this.idIntTipoPessoa == null && other.idIntTipoPessoa != null) || (this.idIntTipoPessoa != null && !this.idIntTipoPessoa.equals(other.idIntTipoPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ocorrencias.entityClass.Tipopessoa[ idIntTipoPessoa=" + idIntTipoPessoa + " ]";
    }
    
}
