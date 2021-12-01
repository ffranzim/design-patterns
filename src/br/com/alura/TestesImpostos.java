package br.com.alura;

import br.com.alura.imposto.CalculadoraDeImpostos;
import br.com.alura.imposto.TipoImposto;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {


    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100));
        CalculadoraDeImpostos calcImpostos = new CalculadoraDeImpostos();
        System.out.println(calcImpostos.calcular(orcamento, TipoImposto.ISSq));
    }

}
