package abstratas;

public class Assalariado extends Funcionario{

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double salarioMes() {
        return salario;
    }
}
