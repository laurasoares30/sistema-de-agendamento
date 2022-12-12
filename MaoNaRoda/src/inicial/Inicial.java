package inicial;



import database.Veiculo;
import menu.Menu;

public class Inicial {

    Menu menu = new Menu();

    public Inicial() {
        System.out.println(mensagem());
        menu.inicio();
    }

    private String mensagem() {
        return "Bem vindo\n";
    }

}
