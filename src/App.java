import br.clinica.modelo.Clinica;
import br.clinica.modelo.Endereco;
import br.clinica.modelo.Medico;
import br.clinica.modelo.Paciente;
import br.clinica.modelo.Prontuario;

public class App {
    public static void main(String[] args){
       Clinica clinica = Clinica.getClinica();


       Paciente paciente1 = new Paciente("Thyago", 18, "11111111111", "22222222222", 
            new Endereco("Domingos Damacena Duartes", 15, "São Paulo"), 
            new Prontuario("Diabetes", true, "Remedio Diabetes"));

        Paciente paciente2 = new Paciente("Ana", 25, "22222222222", "33333333333", 
            new Endereco("Rua das Flores", 50, "Rio de Janeiro"), 
            new Prontuario("Hipertensão", true, "Remedio Hipertensão"));

        Paciente paciente3 = new Paciente("Bruno", 30, "33333333333", "44444444444", 
            new Endereco("Avenida Paulista", 1000, "São Paulo"), 
            new Prontuario("Asma", false, ""));

        Paciente paciente4 = new Paciente("Carla", 40, "44444444444", "55555555555", 
            new Endereco("Rua das Palmeiras", 120, "Belo Horizonte"), 
            new Prontuario("Alergia", true, "Antialérgico"));

        Medico medico1 = new Medico("Carlos", "123321123", "Cardiologista");

        Medico medico2 = new Medico("Fernanda", "321123321", "Dermatologista");

        Medico medico3 = new Medico("Rafael", "456654456", "Pediatra");

        Medico medico4 = new Medico("Juliana", "654456654", "Neurologista");

        clinica.cadastrarMedico(medico1, 15, 23);
        clinica.cadastrarMedico(medico2, 15, 23);
        clinica.cadastrarMedico(medico3, 15, 23);
        clinica.cadastrarMedico(medico4, 15, 23);

        clinica.cadastrarPaciente(paciente1);
        clinica.cadastrarPaciente(paciente2);
        clinica.cadastrarPaciente(paciente3);
        clinica.cadastrarPaciente(paciente4);

        clinica.registrarConsulta("cardiologista", paciente1);
        clinica.registrarConsulta("dermatologista", paciente2);
        clinica.registrarConsulta("Pediatra", paciente3);
        clinica.registrarConsulta("Neurologista", paciente4);

        System.out.println(clinica.getConsultas().stream().findFirst());
    }
}
