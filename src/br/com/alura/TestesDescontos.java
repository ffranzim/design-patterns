package br.com.alura;

import br.com.alura.desconto.CalculadoraDeDescontos;
import br.com.alura.imposto.CalculadoraDeImpostos;
import br.com.alura.imposto.ICMS;
import br.com.alura.imposto.ISS;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {


    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal(200), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal(200), 5);
        Orcamento orcamento3 = new Orcamento(new BigDecimal(500), 1);
        Orcamento orcamento4 = new Orcamento(new BigDecimal(500.01), 1);

        //? Chain of Responsibility - Corrente de Responsabilidades
        CalculadoraDeDescontos calcDescontos = new CalculadoraDeDescontos();
        System.out.println(calcDescontos.calcular(orcamento));
        System.out.println(calcDescontos.calcular(orcamento2));
        System.out.println(calcDescontos.calcular(orcamento3));
        System.out.println(calcDescontos.calcular(orcamento4));

    }

}
