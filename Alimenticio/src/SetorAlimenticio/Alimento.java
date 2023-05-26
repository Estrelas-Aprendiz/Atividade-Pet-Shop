package SetorAlimenticio;

import java.util.ArrayList;
import java.util.List;
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
    public  void getgerarAlimento() {
        List<Alimento> listaAlimentos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt()){

            case 1:
                Racao racao = new Racao();
                racao.mostrarInformacao();
                listaAlimentos.add(racao);
                break;
            case 2:
                Sache sache = new Sache();
                sache.mostrarInformacao();
                listaAlimentos.add(sache);
                break;
            case 3:
                Petisco petisco = new Petisco();
                petisco.mostrarInformacao();
                listaAlimentos.add(petisco);
                break;
            case 4:
                Suplemento suplemento = new Suplemento();
                suplemento.mostrarInformacao();
                listaAlimentos.add(suplemento);
                break;

            default:
                System.out.println("Opção inválida!");
        }
        System.out.println("Informe a opção desejada");
        System.out.println("1-Continuar compra \t 2-Finalizar");
        if(sc.nextInt() == 1){
            interagirComUser();
        }
        for (int i = 0; i <listaAlimentos.size() ; i++) {
            listaAlimentos.get(i).mostrarInformacao(); //precisa pedir forma de pagamento do usuário e finalizar compra
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
    public void gerarAlimento() {

    }

    @Override
    public void mostrarInformacao() {
        System.out.println("Nome: " +getNome()+ "\tPreço: " +getPreco()+ "\tMarca: " +getMarca()+"\tPeso: "+getPesoKg()+"\tCategoria: "+getCategoria());

    }

    public  void interagirComUser(){
        System.out.println("Qual alimento você deseja pro seu Pet? " +
                "\n 1. Ração" +
                "\n 2. Sachê" +
                "\n 3. Petisco" +
                "\n 4. Suplemento" );
        getgerarAlimento();



    }
}