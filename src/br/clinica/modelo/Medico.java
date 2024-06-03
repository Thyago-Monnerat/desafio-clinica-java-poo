package br.clinica.modelo;

import java.time.LocalTime;
import java.util.regex.Pattern;

import br.clinica.excecoes.NumeroInvalidoException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Medico {
    private String nome;
    private String crm;
    private String especialidade;
    private int horaEntrada;
    private int horaSaida;

    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        if(Pattern.matches("\\d+", crm)){
            this.crm = crm;
        }else{
            throw new NumeroInvalidoException("Digite apenas números!");    
        }
        this.especialidade = especialidade;
    }

    
}
