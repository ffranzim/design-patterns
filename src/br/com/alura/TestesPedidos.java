package br.com.alura;

import br.com.alura.acao.EnviarEmailPedido;
import br.com.alura.acao.SalvarPedidoNoBancoDeDados;
import br.com.alura.pedido.GerarPedido;
import br.com.alura.pedido.GerarPedidoHandler;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {

//        String cliente = args[0];
//        BigDecimal valorOrcamento = new BigDecimal(args[1]);
//        int qtdItens = Integer.parseInt(args[2]);

        String cliente = "Cliente";
        BigDecimal valorOrcamento = new BigDecimal("100");
        int qtdItens = 3;


        GerarPedido gerarPedidoDados = new GerarPedido(cliente, valorOrcamento, qtdItens);
        GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));
        gerarPedidoHandler.execute(gerarPedidoDados);


    }
}
