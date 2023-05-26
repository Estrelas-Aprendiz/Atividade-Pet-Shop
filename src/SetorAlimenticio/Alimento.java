package SetorAlimenticio;

import java.util.Scanner;

public class Alimento {
    private double preco;
    private String nome;
    private String marca;
    private double pesoKg;
    private String categoria;

    public Alimento(double preco, String nome, String marca, double pesoKg, String categoria) {
        this.preco = preco;
        this.nome = nome;
        this.marca = marca;
        this.pesoKg = pesoKg;
        this.categoria = categoria;
    }

    public static void gerarAlimento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual alimento você deseja criar? " +
                "\n 1. Ração" +
                "\n 2. Petisco" +
                "\n 3. Sachê" +
                "\n 4. Suplemento");


        switch (sc.nextInt()){

            case 1:
                Racao racao = new Racao(79.90, "Premium","Magnus", 10,"filhote" );
                System.out.println(racao);
                break;

        }

    }
}
