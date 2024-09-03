package abstratas;

public class Comissionado extends Funcionario{

    private Double totalVendas;
    private Double comissao;

    public Double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double salarioMes() {
        return totalVendas*comissao;
    }
}
