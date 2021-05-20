import br.com.giovanni.cm.modelo.Tabuleiro;
import br.com.giovanni.cm.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
        new TabuleiroConsole(tabuleiro);

//        tabuleiro.abrir(3,3);
//        tabuleiro.alterarMarcacao(4,4);
//        tabuleiro.alterarMarcacao(4,5);
//        System.out.println(tabuleiro);
    }
}
