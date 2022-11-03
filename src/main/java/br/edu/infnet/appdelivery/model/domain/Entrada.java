package br.edu.infnet.appdelivery.model.domain;

public class Entrada extends Cardapio{

    private boolean cortesia;

    private Integer quantidade;

    private String tamanho;

    public boolean isCortesia() {
        return cortesia;
    }

    public void setCortesia(boolean cortesia) {
        this.cortesia = cortesia;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "cortesia=" + cortesia +
                ", quantidade=" + quantidade +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
