package br.com.alura.pedido;

import br.com.alura.acao.AcaoAposGerarPedido;
import br.com.alura.acao.EnviarEmailPedido;
import br.com.alura.acao.SalvarPedidoNoBancoDeDados;
import br.com.alura.orcamento.Orcamento;

import java.time.LocalDateTime;
import java.util.List;

public class GerarPedidoHandler {

    //?constructor com injecao de dependencias: repository, service, etc.

    private List<AcaoAposGerarPedido> acoes;

    public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GerarPedido dados) {
//        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
//        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

//        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
