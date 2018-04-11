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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
    @NamedQuery(name = "Pessoajuridica.findAll", query = "SELECT p FROM Pessoajuridica p")
    , @NamedQuery(name = "Pessoajuridica.findByTipoPessoaIdIntTipoPessoa", query = "SELECT p FROM Pessoajuridica p WHERE p.tipoPessoaIdIntTipoPessoa = :tipoPessoaIdIntTipoPessoa")
    , @NamedQuery(name = "Pessoajuridica.findByTipoPessoaTipoStPessoa", query = "SELECT p FROM Pessoajuridica p WHERE p.tipoPessoaTipoStPessoa = :tipoPessoaTipoStPessoa")
    , @NamedQuery(name = "Pessoajuridica.findByCNPJIntPessoaJuridica", query = "SELECT p FROM Pessoajuridica p WHERE p.cNPJIntPessoaJuridica = :cNPJIntPessoaJuridica")
    , @NamedQuery(name = "Pessoajuridica.findByDataCriacaoDtPessoaJuridica", query = "SELECT p FROM Pessoajuridica p WHERE p.dataCriacaoDtPessoaJuridica = :dataCriacaoDtPessoaJuridica")
    , @NamedQuery(name = "Pessoajuridica.findByTelefone", query = "SELECT p FROM Pessoajuridica p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "Pessoajuridica.findByCelular", query = "SELECT p FROM Pessoajuridica p WHERE p.celular = :celular")
    , @NamedQuery(name = "Pessoajuridica.findByNomeFantasiaStPessoaJuridica", query = "SELECT p FROM Pessoajuridica p WHERE p.nomeFantasiaStPessoaJuridica = :nomeFantasiaStPessoaJuridica")})
public class Pessoajuridica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TipoPessoa_Id_Int_TipoPessoa", nullable = false)
    private Integer tipoPessoaIdIntTipoPessoa;
    @Column(name = "TipoPessoa_Tipo_St_Pessoa", length = 1)
    private String tipoPessoaTipoStPessoa;
    @Column(name = "CNPJ_Int_PessoaJuridica")
    private Integer cNPJIntPessoaJuridica;
    @Column(name = "DataCriacao_Dt_PessoaJuridica")
    @Temporal(TemporalType.DATE)
    private Date dataCriacaoDtPessoaJuridica;
    @Column(length = 45)
    private String telefone;
    @Column(length = 45)
    private String celular;
    @Column(name = "NomeFantasia_St_PessoaJuridica", length = 45)
    private String nomeFantasiaStPessoaJuridica;
    @JoinColumn(name = "TipoPessoa_Id_Int_TipoPessoa", referencedColumnName = "Id_Int_TipoPessoa", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Tipopessoa tipopessoa;

    public Pessoajuridica() {
    }

    public Pessoajuridica(Integer tipoPessoaIdIntTipoPessoa) {
        this.tipoPessoaIdIntTipoPessoa = tipoPessoaIdIntTipoPessoa;
    }

    public Integer getTipoPessoaIdIntTipoPessoa() {
        return tipoPessoaIdIntTipoPessoa;
    }

    public void setTipoPessoaIdIntTipoPessoa(Integer tipoPessoaIdIntTipoPessoa) {
        this.tipoPessoaIdIntTipoPessoa = tipoPessoaIdIntTipoPessoa;
    }

    public String getTipoPessoaTipoStPessoa() {
        return tipoPessoaTipoStPessoa;
    }

    public void setTipoPessoaTipoStPessoa(String tipoPessoaTipoStPessoa) {
        this.tipoPessoaTipoStPessoa = tipoPessoaTipoStPessoa;
    }

    public Integer getCNPJIntPessoaJuridica() {
        return cNPJIntPessoaJuridica;
    }

    public void setCNPJIntPessoaJuridica(Integer cNPJIntPessoaJuridica) {
        this.cNPJIntPessoaJuridica = cNPJIntPessoaJuridica;
    }

    public Date getDataCriacaoDtPessoaJuridica() {
        return dataCriacaoDtPessoaJuridica;
    }

    public void setDataCriacaoDtPessoaJuridica(Date dataCriacaoDtPessoaJuridica) {
        this.dataCriacaoDtPessoaJuridica = dataCriacaoDtPessoaJuridica;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNomeFantasiaStPessoaJuridica() {
        return nomeFantasiaStPessoaJuridica;
    }

    public void setNomeFantasiaStPessoaJuridica(String nomeFantasiaStPessoaJuridica) {
        this.nomeFantasiaStPessoaJuridica = nomeFantasiaStPessoaJuridica;
    }

    public Tipopessoa getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(Tipopessoa tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoPessoaIdIntTipoPessoa != null ? tipoPessoaIdIntTipoPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoajuridica)) {
            return false;
        }
        Pessoajuridica other = (Pessoajuridica) object;
        if ((this.tipoPessoaIdIntTipoPessoa == null && other.tipoPessoaIdIntTipoPessoa != null) || (this.tipoPessoaIdIntTipoPessoa != null && !this.tipoPessoaIdIntTipoPessoa.equals(other.tipoPessoaIdIntTipoPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ocorrencias.entityClass.Pessoajuridica[ tipoPessoaIdIntTipoPessoa=" + tipoPessoaIdIntTipoPessoa + " ]";
    }
    
}
