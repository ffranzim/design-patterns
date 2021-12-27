package br.com.alura.imposto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMScomISS extends Imposto {

    public ICMScomISS(Imposto outro) {
        super(outro);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
//        BigDecimal icms = new ICMS().calcular(orcamento);
//        BigDecimal iss = new ISS().calcular(orcamento);
//
//        return icms.add(iss);
        return BigDecimal.ZERO;
    }
}
