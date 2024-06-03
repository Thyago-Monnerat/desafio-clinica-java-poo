package br.clinica.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Fatura{
    private double preco = 10 * new Random().nextInt(11) + 20;

    public Fatura() {
    } 
}
