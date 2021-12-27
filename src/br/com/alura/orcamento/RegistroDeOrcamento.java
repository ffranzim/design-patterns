package br.com.alura.orcamento;

import br.com.alura.DomainException;
import br.com.alura.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        if(!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento não finalizado!");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidade", orcamento.getQtdItens()
        );


        httpAdapter.post(url, dados);

    }
}
