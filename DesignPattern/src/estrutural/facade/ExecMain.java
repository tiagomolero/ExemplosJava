package estrutural.facade;

public class ExecMain {

    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(1L, "Rua Daniel", "(11) 1111-2222", 1000.0));
    }

}
