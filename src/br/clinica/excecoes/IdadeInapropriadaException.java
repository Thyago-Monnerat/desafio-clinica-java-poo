package br.clinica.excecoes;

public class IdadeInapropriadaException extends RuntimeException{
    public IdadeInapropriadaException(String mensagem){
        super(mensagem);
    }
}
