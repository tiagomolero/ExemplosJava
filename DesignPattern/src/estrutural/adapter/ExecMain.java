package estrutural.adapter;

import java.io.File;

public class ExecMain {

    public static void main(String[] args) {
        String caminho = "teste.txt";
        DropBox dropBox = new DropBox();
        IPersistenciaArquivos arquivos = new DropBoxAdapter(dropBox);
        arquivos.gravar(new File(caminho));
    }

}
