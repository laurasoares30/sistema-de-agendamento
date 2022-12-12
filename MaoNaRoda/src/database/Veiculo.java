package database;

import java.util.ArrayList;

public class Veiculo {

    ArrayList<Object> veiculos = new ArrayList<>();

    private String modelo;
    private int ano;
    private double valorDiario;
    private double valorTotal;

    public double getValorDiario() {
        return valorDiario;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getValorTotal() {
        return valorTotal;
    }


    public Veiculo(String modelo, int ano, double valorDiario, double valorTotal) {
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiario = valorDiario;
        this.valorTotal = valorTotal;
    }


    public Veiculo(){
        inserir();
    }


    public ArrayList<Object> getVeiculos() {
        return veiculos;
    }


    public String toString(){
        return this.modelo+ " | " +this.ano;
    }

    public void dados(){
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println(i + ") " + veiculos.get(i).toString());
        }
    }

    public void inserir(){
        veiculos.add(new Veiculo("Renault KWID", 2020, 120.00, 50.000));
        veiculos.add(new Veiculo("Renault KWID", 2020, 120.00, 50.000));
        veiculos.add(new Veiculo("Renault KWID", 2020, 120.00, 50.000));
        veiculos.add(new Veiculo("Renault KWID", 2020, 120.00, 50.000));
        veiculos.add(new Veiculo("Renault KWID", 2020, 120.00, 50.000));
        veiculos.add(new Veiculo("Renault KWID", 2020, 120.00, 50.000));
        veiculos.add(new Veiculo("Renault KWID", 2020, 120.00, 50.000));
        veiculos.add(new Veiculo("Renault KWID", 2020, 120.00, 50.000));
        veiculos.add(new Veiculo("Fiat Argo", 2022, 170.00, 70.000));

    }

    public String detalhe() {
        return "\nmodelo: " + getModelo() + "\n" +
                "ano: " + getAno() + "\n" +
                "valor por dia: " + getValorDiario();
    }

}
