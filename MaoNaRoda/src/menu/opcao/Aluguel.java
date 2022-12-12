package menu.opcao;

import java.util.Scanner;

import database.Veiculo;
import submenu.aluguel.AluguelMenu;

public class Aluguel extends Veiculo{
    Scanner sc = new Scanner(System.in);

    Veiculo veiculos = new Veiculo();

    private static int index;

    public Aluguel(){
        System.out.println(((Veiculo) getVeiculos().get(escolhido())).detalhe());
        AluguelMenu aluguel = new AluguelMenu();
    }



    public int escolhido(){
        veiculos.dados();
  
        System.out.print("CARRO ESCOLHIDO: ");
        this.index = sc.nextInt();
        
        return this.index;
    }

    public static int getIndex() {
        return index;
    }

}
