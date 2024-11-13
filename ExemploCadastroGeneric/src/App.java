import dao.ClienteMapDAO;
import dao.IClienteDAO;
import dao.IProdutoDAO;
import dao.ProdutoMapDAO;
import domain.Cliente;
import domain.Produto;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;
    private static IProdutoDAO iProdutoDAO;
    private static String[]  itensMenu = {"CADASTRAR", "CONSULTAR", "EXCLUIR", "ALTERAR"};

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


    // MENU DE OPÇÕES
    private static void selectProduto(){
        iProdutoDAO = new ProdutoMapDAO();

        String selecaoProduto = (String) JOptionPane.showInputDialog(null, "Escolha um item",
                "MENU PRODUTO", JOptionPane.INFORMATION_MESSAGE, null, itensMenu, itensMenu[0]);

        while (isOpcaoValida(selecaoProduto)) {

            switch (selecaoProduto){
                case "CADASTRAR":
                    String dadosCadastro = JOptionPane.showInputDialog(null,
                            "Digite os dados do produto separados por vígula, conforme exemplo: Código, Nome, Quantidade",
                            "Cadastrar", JOptionPane.INFORMATION_MESSAGE);
                    cadastrar(dadosCadastro);
                    break;
                case "CONSULTAR":
                    String codConsulta = JOptionPane.showInputDialog(null,
                            "Digite o código do produto que deseja consultar",
                            "Consultar", JOptionPane.INFORMATION_MESSAGE);

                    Long codConsultaLong = Long.valueOf(codConsulta);
                    consultar(codConsultaLong);
                    break;
                case "EXCLUIR":
                    String cpfExcluir = JOptionPane.showInputDialog(null,
                            "Digite o código do produto que deseja excluir",
                            "Excluir", JOptionPane.INFORMATION_MESSAGE);
                    excluir(Long.valueOf(cpfExcluir));
                    break;
                case "ALTERAR":
                    String dadosAlteracao = JOptionPane.showInputDialog(null,
                            "Digite os dados do produto separados por vígula, conforme exemplo: Código, Nome, Quantidade",
                            "Alterar", JOptionPane.INFORMATION_MESSAGE);
                    alterarProduto(dadosAlteracao);
                    break;
                case null:
                    sair();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + selecaoProduto);
            }
            selecaoProduto = (String) JOptionPane.showInputDialog(null, "Escolha um item",
                    "MENU PRODUTO", JOptionPane.INFORMATION_MESSAGE, null, itensMenu, itensMenu[0]);
        }

    }

    private static void selectCliente(){
        iClienteDAO = new ClienteMapDAO();

        String selecaoCliente = (String) JOptionPane.showInputDialog(null, "Escolha um item",
                "MENU CLIENTE", JOptionPane.INFORMATION_MESSAGE, null, itensMenu, itensMenu[0]);

        while (isOpcaoValida(selecaoCliente)) {

            switch (selecaoCliente){
                case "CADASTRAR":
                    String dadosCadastro = JOptionPane.showInputDialog(null,
                            "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    cadastrar(dadosCadastro);
                    break;
                case "CONSULTAR":
                    String cpfConsulta = JOptionPane.showInputDialog(null,
                            "Digite o cpf",
                            "Consultar", JOptionPane.INFORMATION_MESSAGE);
                    Long cpfConsultaLong = Long.valueOf(cpfConsulta);
                    consultar(cpfConsultaLong);
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
                    "MENU CLIENTE", JOptionPane.INFORMATION_MESSAGE, null, itensMenu, itensMenu[0]);
        }



    }

    // MÉTODOS INDIVIDUAIS
    private static void alterarProduto(String dadosNovos){
        String[] dadosSeparados = dadosNovos.split(",");
        //código, nome, quantidade
        Produto produto = new Produto(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2]);
        Boolean isAlterado = iProdutoDAO.alterar(produto);
        if (isAlterado) {
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
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


    // GENÉRICOS
    private static void cadastrar(String dados){
        String[] dadosSeparados = dados.split(",");
        Boolean isCadastrado = null;

        if(iClienteDAO != null){
            Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
            isCadastrado = iClienteDAO.cadastrar(cliente);
        }else if(iProdutoDAO != null){
            Produto produto = new Produto(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2]);
            isCadastrado = iProdutoDAO.cadastrar(produto);
        }

        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Objeto cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Objeto já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(Long key){
        if(iClienteDAO != null){
            Cliente cliente = iClienteDAO.consultar(key);
            if (cliente != null) {
                JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }

        }else if(iProdutoDAO != null){
            Produto produto = iProdutoDAO.consultar(key);
            if (produto != null) {
                JOptionPane.showMessageDialog(null, "Produto encontrado: " + produto.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }

    private static void excluir(Long key){
        if(iClienteDAO != null){
            Boolean clienteExcluido = iClienteDAO.excluir(key);
            if (clienteExcluido != null) {
                JOptionPane.showMessageDialog(null, "Cliente Excluido", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }

        }else if(iProdutoDAO != null){
            Boolean clienteProduto = iProdutoDAO.excluir(key);
            if (clienteProduto != null) {
                JOptionPane.showMessageDialog(null, "Produto Excluido", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

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
