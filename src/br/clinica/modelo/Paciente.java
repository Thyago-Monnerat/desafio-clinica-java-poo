package br.clinica.modelo;

import java.util.regex.Pattern;

import br.clinica.excecoes.IdadeInapropriadaException;
import br.clinica.excecoes.NumeroInvalidoException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
/**Classe que simula um paciente para cadastro, agendamento e outras funções na clínica */
public class Paciente {
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private Endereco endereco;
    private Prontuario prontuario;

    public Paciente(String nome, int idade, String cpf, String telefone, Endereco endereco, Prontuario prontuario) {
        this.nome = nome;
        /**Condição de ter idade > 18 para inscrição */
        if(idade < 18){
            throw new IdadeInapropriadaException("Apenas usuários com idade maior que 18 anos podem ser cadastrados!");
        }else{
            this.idade = idade;
        }
        this.cpf = validadorCpfTel(cpf);
        this.telefone = validadorCpfTel(telefone);
        this.endereco = endereco;
        this.prontuario = prontuario;
    }
    
    /**Verifica se o CPF e telefone têm 11 dígitos e apenas números
     * Decidi utilizar um método para validar os 2 atributos para simplificar o código no geral.
     */
    private String validadorCpfTel(String numero){
        if(numero.length() != 11 || !Pattern.matches("\\d+", numero)){
            throw new NumeroInvalidoException("Numero invalido. Digite apenas os números do seu telefone com o DDD");
        }else{
            return numero;
        }
    }

    
}
