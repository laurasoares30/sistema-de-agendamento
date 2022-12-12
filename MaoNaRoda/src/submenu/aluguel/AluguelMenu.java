package submenu.aluguel;

import java.util.Scanner;

import inicial.Inicial;
import menu.Menu;
import menu.opcao.Aluguel;
import submenu.iMenu;
import java.util.Scanner;

public class AluguelMenu implements iMenu {
    
    Scanner sc = new Scanner(System.in);
    public AluguelMenu(){

        switch(opcao()){
            case 1:
                System.out.println("\n");
                Menu menu = new Menu();
                menu.inicio();
                break;
            case 2:
                Calcular calcular = new Calcular();
                break;
            case 3:
                Inicial inicial = new Inicial();
                break;
        }
    }

    @Override
    public String menu() {
        return "\n1)VOLTAR | 2)CALCULAR | 3)ENCERRAR";
    }

    public int opcao(){
        System.out.println(menu());
        System.out.print("ESCOLHER: ");
        int num = sc.nextInt();

        return num;
    }
    
}
