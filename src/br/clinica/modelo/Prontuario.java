package br.clinica.modelo;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Prontuario {
    private Set<String> complicacoes = new HashSet<>();
    private Set<String> remedio = new HashSet<>();
    private boolean tomaRemedio;
    
    public Prontuario(String complicacoes, boolean tomaRemedio, String remedio) {
        this.complicacoes.add(complicacoes);
        this.tomaRemedio = tomaRemedio;
        this.remedio.add(remedio);
    }
}
