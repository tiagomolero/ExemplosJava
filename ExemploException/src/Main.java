import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String codigo = JOptionPane.showInputDialog("Informe o código do cliente");

        try{
            ClienteService.consultar(codigo);
        }catch (ClienteNaoEncontradoException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }

}
