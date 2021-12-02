package br.com.alura;

import br.com.alura.orcamento.Orcamento;
import br.com.alura.situacao.Aprovado;
import br.com.alura.situacao.Reprovado;

public class DomainException extends RuntimeException {

    public static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }


}
