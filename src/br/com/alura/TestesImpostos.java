package br.com.alura;

import br.com.alura.imposto.CalculadoraDeImpostos;
import br.com.alura.imposto.ICMS;
import br.com.alura.imposto.ISS;
import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {


    public static void main(String[] args) {

//        Orcamento orcamento = new Orcamento(new BigDecimal(100), 1);
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal(100)));


        //? Strategy
//        CalculadoraDeImpostos calcImpostos = new CalculadoraDeImpostos();
//        System.out.println(calcImpostos.calcular(orcamento, new ISS()));
//        System.out.println(calcImpostos.calcular(orcamento, new ICMS()));
        //? Decorator faz uma composição
        CalculadoraDeImpostos calcImpostos = new CalculadoraDeImpostos();
        System.out.println(calcImpostos.calcular(orcamento, new ICMS(new ISS(null))));

    }

}
