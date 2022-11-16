package br.edu.infnet.apirestaurante.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "trestaurante")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnpj;

    private String nome;

    private String descricao;

    private String cep;

    private String endereco;

    private BigDecimal taxaDeEntrega;

    private Integer minTempoEntregaMinutos;

    private Integer maxTempoEntregaMinutos;

    private String contatoFone;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public BigDecimal getTaxaDeEntrega() {
        return taxaDeEntrega;
    }

    public void setTaxaDeEntrega(BigDecimal taxaDeEntrega) {
        this.taxaDeEntrega = taxaDeEntrega;
    }

    public Integer getMinTempoEntregaMinutos() {
        return minTempoEntregaMinutos;
    }

    public void setMinTempoEntregaMinutos(Integer minTempoEntregaMinutos) {
        this.minTempoEntregaMinutos = minTempoEntregaMinutos;
    }

    public Integer getMaxTempoEntregaMinutos() {
        return maxTempoEntregaMinutos;
    }

    public void setMaxTempoEntregaMinutos(Integer maxTempoEntregaMinutos) {
        this.maxTempoEntregaMinutos = maxTempoEntregaMinutos;
    }

    public String getContatoFone() {
        return contatoFone;
    }

    public void setContatoFone(String contatoFone) {
        this.contatoFone = contatoFone;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cep='" + cep + '\'' +
                ", endereco='" + endereco + '\'' +
                ", taxaDeEntrega=" + taxaDeEntrega +
                ", minTempoEntregaMinutos=" + minTempoEntregaMinutos +
                ", maxTempoEntregaMinutos=" + maxTempoEntregaMinutos +
                ", contatoFone='" + contatoFone +
                '}';
    }
}
