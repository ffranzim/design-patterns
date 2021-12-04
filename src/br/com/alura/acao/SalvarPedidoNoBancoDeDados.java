package br.com.alura.acao;

import br.com.alura.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados!");
    }
}
