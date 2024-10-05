package estrutural.facade;

public class ApartamentoService implements IApartamentoService{
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = validarCampos(apartamento);
        if (isCadastrado && !isCamposValidos){
            return false;
        }

        return cadastrarBanco(apartamento);
    }

    private Boolean cadastrarBanco(Apartamento apartamento) {
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento){
        return false;
    }

    private Boolean validarCampos(Apartamento apartamento){
        return true;
    }

}
