package SetorAlimenticio;

import java.util.Scanner;

public class Alimento implements SetorAlimentos {
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

    @Override
    public void getgerarAlimento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual alimento você deseja? " +
                "\n 1. Ração" +
                "\n 2. Sachê" +
                "\n 3. Petisco" +
                "\n 4. Suplemento");


        switch (sc.nextInt()){

            case 1:
                Racao racao = new Racao();
                racao.mostrarInformacao();
                break;
            case 2:
                Sache sache = new Sache();
                sache.mostrarInformacao();
                break;
            case 3:
                Petisco petisco = new Petisco();
                petisco.mostrarInformacao();
                break;
            case 4:
                Suplemento suplemento = new Suplemento();
                suplemento.mostrarInformacao();
                break;

        }

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("Preço: "+getPreco()+"\nNome: "+getNome()+"\nMarca: "+getMarca()+"\nPeso: "+getPesoKg()+"\nCategoria: "+getCategoria());

    }
}
