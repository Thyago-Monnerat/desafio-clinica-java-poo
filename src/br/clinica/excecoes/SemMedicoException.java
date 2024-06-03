package br.clinica.excecoes;

public class SemMedicoException extends RuntimeException{
    public SemMedicoException(String mensagem){
        super(mensagem);
    }
}
