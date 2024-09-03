package abstratas;

public class Horista extends Funcionario{

    private Double valorHora;
    private Double horasTrabalhadas;


    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public Double salarioMes() {
        return valorHora*horasTrabalhadas;
    }

}
