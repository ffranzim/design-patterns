package br.com.alura.pedido;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GerarPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int qtdItens;

    public GerarPedido(String cliente, BigDecimal valorOrcamento, int qtdItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
    }


    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQtdItens() {
        return qtdItens;
    }
}
