package comportamental.templatemethod;

public class ForcaAreaBrasileira extends ForcasArmadas{
    @Override
    protected void funcao() {
        System.out.println("Sua principal função é garantir a soberania do espaço aéreo nacional.");
    }

    @Override
    protected void corfardamento() {
        System.out.println("Azul-escuro");
    }
}
