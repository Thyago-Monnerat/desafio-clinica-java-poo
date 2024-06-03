package br.clinica.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDate data;
    private LocalTime hora;
    private String diagnostico;
    private String medicamento;
    @Setter
    private Fatura fatura;

    public Consulta(Paciente paciente, Medico medico, LocalDate data, LocalTime hora) {
        this.paciente = paciente;
        this.data = data;
        this.medico = medico;
        this.hora = hora;
        this.fatura = new Fatura();
    }

    
}
