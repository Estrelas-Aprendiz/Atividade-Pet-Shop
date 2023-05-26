package BrinquedosSetor;

import java.util.ArrayList;
import java.util.List;
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
        List<Brinquedos> brinquedos = new ArrayList<>(4);

        Scanner ler = new Scanner(System.in);
        int escolha =0;

        while(escolha != 3) {

            System.out.println("\nQual brinquedo você quer?\n1 - Brinquedo com som\n2 - Brinquedo para morder\n3 - Mostrar lista e sair");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    BrinquedosComSom bola = new BrinquedosComSom();
                    System.out.println(bola.mostrarBrinquedos());
                    brinquedos.add(bola);
                    break;
                case 2:
                    BrinquedosparaMorder mordedor = new BrinquedosparaMorder();
                    System.out.println(mordedor.mostrarBrinquedos());
                    brinquedos.add(mordedor);
                    break;
                case 3:
                    for(int i=0; i<brinquedos.size();i++){
                        brinquedos.get(i).mostrarBrinquedos();
                    }
                    break;
                default:
                    System.out.println("Opção invalida");

            }
        }
    }

}







