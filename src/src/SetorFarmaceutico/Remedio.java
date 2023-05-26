package SetorFarmaceutico;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remedio {
    private String nome;
    private double miligrama;
    private double preco;

    public Remedio() {
        this.nome = "-";
        this.miligrama = 0;
        this.preco = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getMiligrama() {
        return miligrama;
    }

    public double getPreco() {
        return preco;
    }
    public String mostrarDetalhesDoItem() {
        return "\nNome: " + this.getNome()+
                "\nMiligrama: " + this.getMiligrama() +
                "\nPreco: " + this.getPreco();
    }

    public void vender() {
        List<Remedio> remedio = new ArrayList<>(3);

        remedio.add(new RemedioCachorro("Otovet",2,21.99));
        remedio.add(new RemedioCachorro("IverCanis",5,36.80));
        remedio.add(new RemedioGato("Ivertril",1,21.90));
        remedio.add(new RemedioGato("Dermotan",2,23.00));

        for(int i=0; i<remedio.size(); i++){
            System.out.println(remedio.get(i).mostrarDetalhesDoItem());
        }
    }

    public void verificarProdutodoUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe qual remédio deseja comprar: ");
        System.out.println("1- Otovet \t 2- IverCanis \t 3- Ivetril \t 4-Dermotan");

        switch (input.nextInt()){
            case 1:
//             aqui eu chamaria a classe do remedio e seu método vender
//                fazendo isso para todos os cases
        }
    }
    }
