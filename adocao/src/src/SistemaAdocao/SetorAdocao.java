package SistemaAdocao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetorAdocao {
    private LocalDate dataAdocao;
    private List<Cachorro> cachorrosAdocao = new ArrayList<>();
    private List<Gato> gatosAdocao = new ArrayList<>();
    private List<Cliente> clientesCadastrados = new ArrayList<>();



    public void cadastraCliente(String nome, String cpf, String endereco, int idade, char sexo) {
        Cliente cliente = new Cliente(nome, cpf, endereco, idade, sexo);
        clientesCadastrados.add(cliente);
    }

    public void adotarAnimal() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        cachorrosAdocao.add(new Cachorro("bulldog", "Tobi", 2, 20));
        cachorrosAdocao.add(new Cachorro("Shih Tzu", "Moana", 4, 5));

        gatosAdocao.add(new Gato("Siamês", "Mel", 1,2));
        gatosAdocao.add(new Gato("Persa", "Branquinho", 3,3));

        while(opcao != 3){
            System.out.println("Qual tipo de animal deseja adotar?" +
                    "\n1-Cachorro" +
                    "\n2-Gato" +
                    "\n3-Sair");

            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.println("\nOs cachorrinhos disponiveis são: ");
                    for (Cachorro dog : cachorrosAdocao) {
                        dog.mostrarAnimal();
                    }

                    System.out.println("\nQual deles deseja adotar?");

                    for(int i =0; i < cachorrosAdocao.size(); i++){
                        System.out.println((i+1) +  "- " + cachorrosAdocao.get(i).nome);
                    }
                    int animalEscolhido = sc.nextInt();
                    cachorrosAdocao.remove(animalEscolhido-1);


                }
                case 2 -> {
                    System.out.println("\nOs gatinhos disponiveis são: ");
                    for (Gato cat : gatosAdocao) {
                        //mostrar gatos
                        cat.mostrarAnimal();
                    }

                    System.out.println("\nQual deles deseja adotar?");
                    for(int i =0; i < gatosAdocao.size(); i++){
                        System.out.println((i+1) +"- " + gatosAdocao.get(i).nome);
                    }
                    int animalEscolhido = sc.nextInt();
                    gatosAdocao.remove(animalEscolhido-1);

                }
                case 3 -> {
                    break;
                }
                default -> {
                    System.out.println("Opção invalida");
                    break;
                }
        }

        }
    }

}
