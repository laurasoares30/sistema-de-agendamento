package submenu.aluguel;

import java.util.Scanner;

import database.Cliente;

public class Situacao {
    Scanner sc = new Scanner(System.in);
    public Situacao(){
        switch(opcao()){
            case 1:
                Cliente cliente = new Cliente();
            break;

            case 2:
                Calcular calcular = new Calcular();
            break;
        }
    }

    public int opcao(){
        System.out.println( "\n1) ATENDENTE | 2)NOVA SIMULAÇÃO");
        System.out.print("ESCOLHER:");
        int num = sc.nextInt();

        return num;
    }

}
