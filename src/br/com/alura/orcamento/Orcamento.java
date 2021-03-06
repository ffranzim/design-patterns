package br.com.alura.orcamento;


import br.com.alura.orcamento.situacao.EmAnalise;
import br.com.alura.orcamento.situacao.Finalizado;
import br.com.alura.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;


    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdItens() {
        return itens.size();
    }

    public void setSituacao(SituacaoOrcamento situacao) {
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(Orcavel itemOrcamento) {
        this.valor = valor.add(itemOrcamento.getValor());
        this.itens.add(itemOrcamento);
    }
}
