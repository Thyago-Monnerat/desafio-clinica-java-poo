package br.clinica.servico;

import br.clinica.excecoes.SemMedicoException;
import br.clinica.modelo.Clinica;

public class ValidacaoConsulta {
    
    public boolean validar(String especialidade){
        Clinica clinica = Clinica.getClinica();
        /**Verificar se há medicos para a especialidade requerida. */
        if(!clinica.getListaMedicos().stream().anyMatch(n->n.getEspecialidade().equalsIgnoreCase(especialidade))){
            throw new SemMedicoException("Sem médicos para a especialidade");
        }
        return true;
    }
}
