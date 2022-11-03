package br.edu.infnet.appdelivery.model.domain;

public class Prato extends Cardapio{

    private boolean promocional;

    private boolean sugestaoChef;

    private Integer peso;

    @Override
    public String toString() {
        return "Prato{" +
                "promocional=" + promocional +
                ", sugestaoChef=" + sugestaoChef +
                ", peso=" + peso +
                '}';
    }

    public boolean isPromocional() {
        return promocional;
    }

    public void setPromocional(boolean promocional) {
        this.promocional = promocional;
    }

    public boolean isSugestaoChef() {
        return sugestaoChef;
    }

    public void setSugestaoChef(boolean sugestaoChef) {
        this.sugestaoChef = sugestaoChef;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}
