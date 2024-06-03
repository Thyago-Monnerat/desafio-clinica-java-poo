package br.clinica.modelo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Endereco {
    private String rua;
    private String cidade;
    private int numero;

    public Endereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
    } 
}
