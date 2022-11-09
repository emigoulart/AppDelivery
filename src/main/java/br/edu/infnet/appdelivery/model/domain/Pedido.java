package br.edu.infnet.appdelivery.model.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tpedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataHora;
    private StatusPedido statusPedido;
    @Transient
    private Restaurante restaurante;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "entrega_id")
    private Entrega entrega;
    @Transient
    private List<Cardapio> itensCardapio;

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
