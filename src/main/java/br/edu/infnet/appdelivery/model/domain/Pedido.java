package br.edu.infnet.appdelivery.model.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Long id;
    private LocalDateTime dataHora;
    private StatusPedido statusPedido;
    private Restaurante restaurante;
    private Entrega entrega;
    private List<Cardapio> itensCardapio = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public StatusPedido getStatus() {
        return statusPedido;
    }

    public void setStatus(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public List<Cardapio> getItensCardapio() {
        return itensCardapio;
    }

    public void setItensCardapio(List<Cardapio> itensCardapio) {
        this.itensCardapio = itensCardapio;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", dataHora=" + dataHora +
                ", statusPedido=" + statusPedido +
                ", restaurante=" + restaurante +
                ", entrega=" + entrega +
                ", itensCardapio=" + itensCardapio +
                '}';
    }
}
