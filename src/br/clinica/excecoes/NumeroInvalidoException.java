package br.clinica.excecoes;

public class NumeroInvalidoException extends RuntimeException {
    public NumeroInvalidoException(String mensagem) {
        super(mensagem);
    }
}