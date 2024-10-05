package comportamental.templatemethod;

public class MarinhaDoBrasil extends ForcasArmadas{
    @Override
    protected void funcao() {
        System.out.println("Além da defesa das águas territoriais, a Marinha é responsável pela proteção da costa e dos recursos marinhos");
    }

    @Override
    protected void corfardamento() {
        System.out.println("Branco");
    }
}
