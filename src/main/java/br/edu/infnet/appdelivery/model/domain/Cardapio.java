package br.edu.infnet.appdelivery.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tcardapio")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    @Override
    public String toString() {
        return id + ";" + nome + ";" + descricao + ";" + preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }


}
