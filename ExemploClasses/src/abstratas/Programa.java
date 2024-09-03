package abstratas;

public class Programa {

    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado();
        assalariado.setNome("João");
        assalariado.setCpf("1");
        assalariado.setSalario(1200d);
        imprimir(assalariado);

        Comissionado comissionado = new Comissionado();
        comissionado.setNome("Lucas");
        comissionado.setCpf("2");
        comissionado.setTotalVendas(4500d);
        comissionado.setComissao(0.2);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setNome("Lucas");
        horista.setCpf("2");
        horista.setValorHora(50.0);
        horista.setHorasTrabalhadas(160.0);
        imprimir(horista);

    }

    public static void imprimir(Funcionario funcionario){
        if(funcionario instanceof Assalariado){
            System.out.println("ASSALARIADO");
            System.out.println(funcionario.getNome() + " tem o salário de: R$ " + funcionario.salarioMes());
        } else if (funcionario instanceof Comissionado) {
            System.out.println("COMISSIONADO");
            System.out.println(funcionario.getNome() + " tem o salário de: R$ " + funcionario.salarioMes());
        } else if (funcionario instanceof Horista) {
            System.out.println("HORISTA");
            System.out.println(funcionario.getNome() + " tem o salário de: R$ " + funcionario.salarioMes());
        }

    }

}
