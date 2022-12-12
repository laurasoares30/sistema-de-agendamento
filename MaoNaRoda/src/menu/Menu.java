package menu;

import java.util.Scanner;

import menu.opcao.Aluguel;
import menu.opcao.Conosco;
import menu.opcao.Duvida;
import menu.opcao.Sobre;
import menu.opcao.Venda;



public class Menu {
    Scanner sc = new Scanner(System.in);

    public void inicio() {
        switch (opcao()) {
            case 1:
                Venda venda = new Venda();
                break;
            case 2:
                Aluguel aluguel = new Aluguel();
                break;
            case 3:
                Conosco conosco = new Conosco();
                break;
            case 4:
                Duvida duvida = new Duvida();
                break;
            case 5:
                Sobre sobre = new Sobre();
                break;
        }
    }

    @Override
    public String toString() {
        return  "Vendas - 1" + "\n" +
                "Alugueis - 2" + "\n" +
                "Fale Conosco - 3" + "\n" +
                "Dúvidas Frequentes - 4" + "\n" +
                "Sobre - 5";
    }

    private int opcao(){
        System.out.println(toString());

        System.out.print("\nNÚMERO ESCOLHIDO: ");
        int num = sc.nextInt();
        
        return num;
    }

}



