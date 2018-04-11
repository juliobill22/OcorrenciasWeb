/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocorrencias.entityClass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author julioenglish
 */
@Embeddable
public class PessoafisicaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TipoPessoa_Id_Int_TipoPessoa", nullable = false)
    private int tipoPessoaIdIntTipoPessoa;
    @Basic(optional = false)
    @Column(name = "TipoPessoa_Tipo_St_Pessoa", nullable = false, length = 1)
    private String tipoPessoaTipoStPessoa;

    public PessoafisicaPK() {
    }

    public PessoafisicaPK(int tipoPessoaIdIntTipoPessoa, String tipoPessoaTipoStPessoa) {
        this.tipoPessoaIdIntTipoPessoa = tipoPessoaIdIntTipoPessoa;
        this.tipoPessoaTipoStPessoa = tipoPessoaTipoStPessoa;
    }

    public int getTipoPessoaIdIntTipoPessoa() {
        return tipoPessoaIdIntTipoPessoa;
    }

    public void setTipoPessoaIdIntTipoPessoa(int tipoPessoaIdIntTipoPessoa) {
        this.tipoPessoaIdIntTipoPessoa = tipoPessoaIdIntTipoPessoa;
    }

    public String getTipoPessoaTipoStPessoa() {
        return tipoPessoaTipoStPessoa;
    }

    public void setTipoPessoaTipoStPessoa(String tipoPessoaTipoStPessoa) {
        this.tipoPessoaTipoStPessoa = tipoPessoaTipoStPessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tipoPessoaIdIntTipoPessoa;
        hash += (tipoPessoaTipoStPessoa != null ? tipoPessoaTipoStPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoafisicaPK)) {
            return false;
        }
        PessoafisicaPK other = (PessoafisicaPK) object;
        if (this.tipoPessoaIdIntTipoPessoa != other.tipoPessoaIdIntTipoPessoa) {
            return false;
        }
        if ((this.tipoPessoaTipoStPessoa == null && other.tipoPessoaTipoStPessoa != null) || (this.tipoPessoaTipoStPessoa != null && !this.tipoPessoaTipoStPessoa.equals(other.tipoPessoaTipoStPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ocorrencias.entityClass.PessoafisicaPK[ tipoPessoaIdIntTipoPessoa=" + tipoPessoaIdIntTipoPessoa + ", tipoPessoaTipoStPessoa=" + tipoPessoaTipoStPessoa + " ]";
    }
    
}
