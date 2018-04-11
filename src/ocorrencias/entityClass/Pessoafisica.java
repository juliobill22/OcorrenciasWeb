/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocorrencias.entityClass;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    @NamedQuery(name = "Pessoafisica.findAll", query = "SELECT p FROM Pessoafisica p")
    , @NamedQuery(name = "Pessoafisica.findByTipoPessoaIdIntTipoPessoa", query = "SELECT p FROM Pessoafisica p WHERE p.pessoafisicaPK.tipoPessoaIdIntTipoPessoa = :tipoPessoaIdIntTipoPessoa")
    , @NamedQuery(name = "Pessoafisica.findByTipoPessoaTipoStPessoa", query = "SELECT p FROM Pessoafisica p WHERE p.pessoafisicaPK.tipoPessoaTipoStPessoa = :tipoPessoaTipoStPessoa")
    , @NamedQuery(name = "Pessoafisica.findByCpfIntPessoaFisica", query = "SELECT p FROM Pessoafisica p WHERE p.cpfIntPessoaFisica = :cpfIntPessoaFisica")
    , @NamedQuery(name = "Pessoafisica.findByDataNascimentoDtPessoaFisica", query = "SELECT p FROM Pessoafisica p WHERE p.dataNascimentoDtPessoaFisica = :dataNascimentoDtPessoaFisica")
    , @NamedQuery(name = "Pessoafisica.findByTelefone", query = "SELECT p FROM Pessoafisica p WHERE p.telefone = :telefone")
    , @NamedQuery(name = "Pessoafisica.findByCelular", query = "SELECT p FROM Pessoafisica p WHERE p.celular = :celular")
    , @NamedQuery(name = "Pessoafisica.findByRGIntPessoaFisica", query = "SELECT p FROM Pessoafisica p WHERE p.rGIntPessoaFisica = :rGIntPessoaFisica")})
public class Pessoafisica implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PessoafisicaPK pessoafisicaPK;
    @Column(name = "Cpf_Int_PessoaFisica")
    private Integer cpfIntPessoaFisica;
    @Column(name = "DataNascimento_Dt_PessoaFisica")
    @Temporal(TemporalType.DATE)
    private Date dataNascimentoDtPessoaFisica;
    @Column(length = 45)
    private String telefone;
    @Column(length = 45)
    private String celular;
    @Column(name = "RG_Int_PessoaFisica")
    private Integer rGIntPessoaFisica;
    @JoinColumn(name = "TipoPessoa_Id_Int_TipoPessoa", referencedColumnName = "Id_Int_TipoPessoa", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tipopessoa tipopessoa;

    public Pessoafisica() {
    }

    public Pessoafisica(PessoafisicaPK pessoafisicaPK) {
        this.pessoafisicaPK = pessoafisicaPK;
    }

    public Pessoafisica(int tipoPessoaIdIntTipoPessoa, String tipoPessoaTipoStPessoa) {
        this.pessoafisicaPK = new PessoafisicaPK(tipoPessoaIdIntTipoPessoa, tipoPessoaTipoStPessoa);
    }

    public PessoafisicaPK getPessoafisicaPK() {
        return pessoafisicaPK;
    }

    public void setPessoafisicaPK(PessoafisicaPK pessoafisicaPK) {
        this.pessoafisicaPK = pessoafisicaPK;
    }

    public Integer getCpfIntPessoaFisica() {
        return cpfIntPessoaFisica;
    }

    public void setCpfIntPessoaFisica(Integer cpfIntPessoaFisica) {
        this.cpfIntPessoaFisica = cpfIntPessoaFisica;
    }

    public Date getDataNascimentoDtPessoaFisica() {
        return dataNascimentoDtPessoaFisica;
    }

    public void setDataNascimentoDtPessoaFisica(Date dataNascimentoDtPessoaFisica) {
        this.dataNascimentoDtPessoaFisica = dataNascimentoDtPessoaFisica;
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

    public Integer getRGIntPessoaFisica() {
        return rGIntPessoaFisica;
    }

    public void setRGIntPessoaFisica(Integer rGIntPessoaFisica) {
        this.rGIntPessoaFisica = rGIntPessoaFisica;
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
        hash += (pessoafisicaPK != null ? pessoafisicaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoafisica)) {
            return false;
        }
        Pessoafisica other = (Pessoafisica) object;
        if ((this.pessoafisicaPK == null && other.pessoafisicaPK != null) || (this.pessoafisicaPK != null && !this.pessoafisicaPK.equals(other.pessoafisicaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ocorrencias.entityClass.Pessoafisica[ pessoafisicaPK=" + pessoafisicaPK + " ]";
    }
    
}
