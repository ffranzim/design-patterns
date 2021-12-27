package br.com.alura;

import br.com.alura.http.JavaHttpClient;
import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;
import br.com.alura.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        //Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
