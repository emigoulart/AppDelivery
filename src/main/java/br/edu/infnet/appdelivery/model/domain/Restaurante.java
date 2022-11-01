package br.edu.infnet.appdelivery.model.domain;

import java.math.BigDecimal;

public abstract class Restaurante {

    private Long id;

    private String cnpj;

    private String nome;

    private String descricao;

    private String cep;

    private String endereco;

    private BigDecimal taxaDeEntrega;

    private Integer minTempoEntregaMinutos;

    private Integer maxTempoEntregaMinutos;

    private Boolean aprovado;

    private TipoDeCozinha tipoDeCozinha;

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

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public TipoDeCozinha getTipoDeCozinha() {
        return tipoDeCozinha;
    }

    public void setTipoDeCozinha(TipoDeCozinha tipoDeCozinha) {
        this.tipoDeCozinha = tipoDeCozinha;
    }
}
