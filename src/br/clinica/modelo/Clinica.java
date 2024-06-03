package br.clinica.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;

import br.clinica.excecoes.SemMedicoException;
import br.clinica.servico.ValidacaoConsulta;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Clinica {
    private Set<Medico> listaMedicos = new HashSet<>();
    private Set<Paciente> listaPacientes = new HashSet<>();
    private Set<Consulta> consultas = new HashSet<>();
    private static Clinica instancia;

    public Clinica() {
        this.listaMedicos = new HashSet<>();
        this.listaPacientes = new HashSet<>();
        this.consultas = new HashSet<>();
    }

    public void cadastrarMedico(Medico medico, int horaEntrada, int horaSaida){
        listaMedicos.add(medico);
        medico.setHoraEntrada(horaEntrada);
        medico.setHoraSaida(horaSaida);
    }

    public void cadastrarPaciente(Paciente paciente){
        listaPacientes.add(paciente);
    }

    public void registrarConsulta(String especialidade, Paciente paciente){
        if(new ValidacaoConsulta().validar(especialidade)){
            Optional<Medico> medico = Clinica.getClinica().getListaMedicos().stream().filter(n->n.getEspecialidade().equalsIgnoreCase(especialidade)).findFirst();
            Consulta consulta = new Consulta(paciente, medico.get(), LocalDate.now(), LocalTime.now());
            consultas.add(consulta);
        }else{
            throw new SemMedicoException("Falha em marcar a consulta. Cheque suas credenciais");
        }
    }
    
    public Consulta registroConsultas(Consulta consulta){
        return consulta;
    }

    /**Padrão Singleton para permitir apenas uma instância de Clinica */
    public static synchronized Clinica getClinica(){
        if(instancia == null){
            instancia = new Clinica();
        }
        return instancia;
    }
}
