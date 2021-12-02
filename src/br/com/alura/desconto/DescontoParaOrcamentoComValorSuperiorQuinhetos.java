package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorSuperiorQuinhetos extends Desconto {

    public DescontoParaOrcamentoComValorSuperiorQuinhetos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
