package BrinquedosSetor;

import java.util.Scanner;

public class Brinquedos extends Produto {
    protected String faixaEtaria;
    protected String dimensao;
    protected String cor;

    public Brinquedos(double preco, String descricao, String marca, String material, String faixaEtaria, String dimensao, String cor) {
        super(preco, descricao, marca, material);
        this.faixaEtaria = faixaEtaria;
        this.dimensao = dimensao;
        this.cor = cor;
    }

    public String mostrarBrinquedos() {
        return "Preco = " + preco +
                "\nDescricao = " + descricao +
                "\nmarca = " + marca +
                "\nmaterial = " + material +
                "\ncodigoDeBarras = " + codigoDeBarras;
    }

    public void decisao(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual brinquedo você quer?\n1 - Brinquedo com som\n2Brinquedo para morder");
        int escolha = ler.nextInt();
        switch (escolha){
            case 1:
                BrinquedosComSom bola = new BrinquedosComSom();
                System.out.println(bola.mostrarBrinquedos());
                break;

        }

    }

}







