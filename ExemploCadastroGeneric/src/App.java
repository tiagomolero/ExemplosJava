import dao.ClienteMapDAO;
import dao.IClienteDAO;
import dao.IProdutoDAO;
import domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;
    private static IProdutoDAO iProdutoDAO;

    public static void main(String args[]) {

        String[] itens = {"PRODUTOS", "CLIENTES"};
        String selecao = (String) JOptionPane.showInputDialog(null, "Escolha um item",
                "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        switch (selecao){
            case null:
                sair();
                break;
            case "PRODUTOS":
                selectProduto();
                break;
            case "CLIENTES":
                selectCliente();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selecao);
        }


    }

    // PRODUTO
    private static void selectProduto(){

    }

    // CLIENTE
    private static void selectCliente(){
        iClienteDAO = new ClienteMapDAO();

        String[] itensClientes = {"CADASTRAR", "CONSULTAR", "EXCLUIR", "ALTERAR"};
        String selecaoCliente = (String) JOptionPane.showInputDialog(null, "Escolha um item",
                "Opção", JOptionPane.INFORMATION_MESSAGE, null, itensClientes, itensClientes[0]);

        while (isOpcaoValida(selecaoCliente)) {

            switch (selecaoCliente){
                case "CADASTRAR":
                    String dadosCadastro = JOptionPane.showInputDialog(null,
                            "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    cadastrarCliente(dadosCadastro);
                    break;
                case "CONSULTAR":
                    String cpfConsulta = JOptionPane.showInputDialog(null,
                            "Digite o cpf",
                            "Consultar", JOptionPane.INFORMATION_MESSAGE);

                    consultar(cpfConsulta);
                    break;
                case "EXCLUIR":
                    String cpfExcluir = JOptionPane.showInputDialog(null,
                            "Digite o cpf",
                            "Excluir", JOptionPane.INFORMATION_MESSAGE);
                    excluir(Long.valueOf(cpfExcluir));
                    break;
                case "ALTERAR":
                    String dadosAlteracao = JOptionPane.showInputDialog(null,
                            "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    alterarCliente(dadosAlteracao);
                    break;
                case null:
                    sair();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + selecaoCliente);
            }
            selecaoCliente = (String) JOptionPane.showInputDialog(null, "Escolha um item",
                    "Opção", JOptionPane.INFORMATION_MESSAGE, null, itensClientes, itensClientes[0]);
        }



    }

    private static void alterarCliente(String dadosNovos){
        String[] dadosSeparados = dadosNovos.split(",");
        Cliente atualizacaoCliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isAlterado = iClienteDAO.alterar(atualizacaoCliente);
        if (isAlterado) {
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrarCliente(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        //Validar se foi passado somente o cpf
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void excluir(Long valor){
        Boolean clienteExcluido = iClienteDAO.excluir(valor);
        if (clienteExcluido != null) {
            JOptionPane.showMessageDialog(null, "Cliente Excluido", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }
    }



    // GENÉRICOS
    private static void sair() {
        JOptionPane.showMessageDialog(null, "Obrigado por utilizar o programa, até logo!", "SAIR",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if (opcao != null) {
            return true;
        }
        sair();
        return false;
    }

}
