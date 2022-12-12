package database;

public class Cliente {

    private String nome;
    private int idade;
    private boolean CNH;
    private String categoriaCNH;

    public Cliente() {
        System.out.println("\nNOME:");
        System.out.println("IDADE:");
        System.out.println("CNH:");
        System.out.println("CATEGORIA DA CNH:");
    }

    public Cliente(String nome, int idade, boolean CNH, String categoriaCNH) {
        this.nome = nome;
        this.idade = idade;
        this.CNH = CNH;
        this.categoriaCNH = categoriaCNH;
    }

}
