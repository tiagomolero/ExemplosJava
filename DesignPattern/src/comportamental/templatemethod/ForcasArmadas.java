package comportamental.templatemethod;

public abstract class ForcasArmadas {

    public void executar(){
        funcao();
        corfardamento();
    }

    private void atividade(){
        System.out.println("Forças Armadas Brasileira possui a missão de defender e proteger a soberania do território nacional brasileiro");
    }

    protected abstract void funcao();
    protected abstract void corfardamento();


}
