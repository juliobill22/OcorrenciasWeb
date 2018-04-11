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
 * @author julioenglish
 */
@Entity
@Table(catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p")
    , @NamedQuery(name = "Pessoa.findByIdIntPessoa", query = "SELECT p FROM Pessoa p WHERE p.idIntPessoa = :idIntPessoa")
    , @NamedQuery(name = "Pessoa.findByNomeStPessoa", query = "SELECT p FROM Pessoa p WHERE p.nomeStPessoa = :nomeStPessoa")
    , @NamedQuery(name = "Pessoa.findByEndere\u00e7o", query = "SELECT p FROM Pessoa p WHERE p.endere\u00e7o = :endere\u00e7o")
    , @NamedQuery(name = "Pessoa.findByCidade", query = "SELECT p FROM Pessoa p WHERE p.cidade = :cidade")
    , @NamedQuery(name = "Pessoa.findByEstado", query = "SELECT p FROM Pessoa p WHERE p.estado = :estado")
    , @NamedQuery(name = "Pessoa.findByPais", query = "SELECT p FROM Pessoa p WHERE p.pais = :pais")})
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Int_Pessoa", nullable = false)
    private Integer idIntPessoa;
    @Column(name = "Nome_St_Pessoa", length = 45)
    private String nomeStPessoa;
    @Column(length = 45)
    private String endereço;
    @Column(length = 45)
    private String cidade;
    @Column(length = 45)
    private String estado;
    @Column(length = 45)
    private String pais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoaIdIntPessoa")
    private List<Ocorrencias> ocorrenciasList;
    @JoinColumn(name = "TipoPessoa_Id_Int_TipoPessoa", referencedColumnName = "Id_Int_TipoPessoa", nullable = false)
    @ManyToOne(optional = false)
    private Tipopessoa tipoPessoaIdIntTipoPessoa;

    public Pessoa() {
    }

    public Pessoa(Integer idIntPessoa) {
        this.idIntPessoa = idIntPessoa;
    }

    public Integer getIdIntPessoa() {
        return idIntPessoa;
    }

    public void setIdIntPessoa(Integer idIntPessoa) {
        this.idIntPessoa = idIntPessoa;
    }

    public String getNomeStPessoa() {
        return nomeStPessoa;
    }

    public void setNomeStPessoa(String nomeStPessoa) {
        this.nomeStPessoa = nomeStPessoa;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @XmlTransient
    public List<Ocorrencias> getOcorrenciasList() {
        return ocorrenciasList;
    }

    public void setOcorrenciasList(List<Ocorrencias> ocorrenciasList) {
        this.ocorrenciasList = ocorrenciasList;
    }

    public Tipopessoa getTipoPessoaIdIntTipoPessoa() {
        return tipoPessoaIdIntTipoPessoa;
    }

    public void setTipoPessoaIdIntTipoPessoa(Tipopessoa tipoPessoaIdIntTipoPessoa) {
        this.tipoPessoaIdIntTipoPessoa = tipoPessoaIdIntTipoPessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIntPessoa != null ? idIntPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idIntPessoa == null && other.idIntPessoa != null) || (this.idIntPessoa != null && !this.idIntPessoa.equals(other.idIntPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ocorrencias.entityClass.Pessoa[ idIntPessoa=" + idIntPessoa + " ]";
    }
    
}
