package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

abstract class Desconto {
    protected   Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    abstract BigDecimal calcular(Orcamento orcamento);


}
