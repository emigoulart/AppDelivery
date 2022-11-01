package br.edu.infnet.appdelivery.model.domain;

public class ItemPedido {
    private Long id;
    private Integer quantidade;
    private String observacao;
    //private ItemDoCardapio itemDoCardapio;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
