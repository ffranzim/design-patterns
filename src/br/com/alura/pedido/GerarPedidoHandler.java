package br.com.alura.pedido;

import br.com.alura.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GerarPedidoHandler {

    //?constructor com injecao de dependencias: repository, service, etc.

    public void execute(GerarPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco de Dados!");
        System.out.println("Enviar e-mail com dados do novo pedido!");
    }
}
