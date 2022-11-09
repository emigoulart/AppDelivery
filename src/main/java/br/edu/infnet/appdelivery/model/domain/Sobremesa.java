package br.edu.infnet.appdelivery.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tsobremesa")
public class Sobremesa extends Cardapio{
    private Integer quantidade;
    private boolean embalagemParaCongelados;

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isEmbalagemParaCongelados() {
        return embalagemParaCongelados;
    }

    public void setEmbalagemParaCongelados(boolean embalagemParaCongelados) {
        this.embalagemParaCongelados = embalagemParaCongelados;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "quantidade=" + quantidade +
                ", embalagemParaCongelados=" + embalagemParaCongelados +
                '}';
    }
}
