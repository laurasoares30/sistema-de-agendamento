package submenu.aluguel;

import java.util.Scanner;

import database.Veiculo;
import menu.opcao.Aluguel;

public class Calcular extends Veiculo{
    Scanner sc = new Scanner(System.in);

    public Calcular(){
        // System.out.println(Aluguel.getIndex());
        System.out.println("TOTAL: " +qtdDias() * ((Veiculo) getVeiculos().get(Aluguel.getIndex())).getValorDiario());
        Situacao situacao = new Situacao();
    }

    public int qtdDias(){
        System.out.print("\nQUANTIDADE DE DIAS: ");
        int dias = sc.nextInt();
        
        return dias;
    }
}
