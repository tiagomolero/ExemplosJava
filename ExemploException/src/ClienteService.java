public class ClienteService {

    public static void consultar(String codigo) throws ClienteNaoEncontradoException{
        boolean isCadastrado = false;

        if (!isCadastrado){
            throw new ClienteNaoEncontradoException("Cliente não encontrado");
        }
    }

}
