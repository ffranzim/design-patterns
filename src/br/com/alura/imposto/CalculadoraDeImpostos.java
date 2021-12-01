package br.com.alura.imposto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {


        switch (tipoImposto) {
            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.06"));
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            default:
                return BigDecimal.ZERO;
        }


    }

}
