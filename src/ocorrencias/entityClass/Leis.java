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
    @NamedQuery(name = "Leis.findAll", query = "SELECT l FROM Leis l")
    , @NamedQuery(name = "Leis.findByIdLeis", query = "SELECT l FROM Leis l WHERE l.idLeis = :idLeis")
    , @NamedQuery(name = "Leis.findByLeiStDescricao", query = "SELECT l FROM Leis l WHERE l.leiStDescricao = :leiStDescricao")
    , @NamedQuery(name = "Leis.findByLeiSturl", query = "SELECT l FROM Leis l WHERE l.leiSturl = :leiSturl")})
public class Leis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idLeis;
    @Column(name = "Lei_St_Descricao", length = 45)
    private String leiStDescricao;
    @Column(name = "Lei_St_url", length = 45)
    private String leiSturl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "leisidLeis")
    private List<Ocorrencias> ocorrenciasList;

    public Leis() {
    }

    public Leis(Integer idLeis) {
        this.idLeis = idLeis;
    }

    public Integer getIdLeis() {
        return idLeis;
    }

    public void setIdLeis(Integer idLeis) {
        this.idLeis = idLeis;
    }

    public String getLeiStDescricao() {
        return leiStDescricao;
    }

    public void setLeiStDescricao(String leiStDescricao) {
        this.leiStDescricao = leiStDescricao;
    }

    public String getLeiSturl() {
        return leiSturl;
    }

    public void setLeiSturl(String leiSturl) {
        this.leiSturl = leiSturl;
    }

    @XmlTransient
    public List<Ocorrencias> getOcorrenciasList() {
        return ocorrenciasList;
    }

    public void setOcorrenciasList(List<Ocorrencias> ocorrenciasList) {
        this.ocorrenciasList = ocorrenciasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLeis != null ? idLeis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leis)) {
            return false;
        }
        Leis other = (Leis) object;
        if ((this.idLeis == null && other.idLeis != null) || (this.idLeis != null && !this.idLeis.equals(other.idLeis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ocorrencias.entityClass.Leis[ idLeis=" + idLeis + " ]";
    }
    
}
