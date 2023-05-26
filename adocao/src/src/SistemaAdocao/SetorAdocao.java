package SistemaAdocao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetorAdocao {
    private LocalDate dataAdocao;
    private List<Cachorro> cachorrosAdocao = new ArrayList<>();
    private List<Gato> gatosAdocao;
    private List<Cliente> clientesCadastrados;



    public void cadastraCliente(String nome, String cpf, String endereco, int idade, char sexo) {
        Cliente cliente = new Cliente(nome, cpf, endereco, idade, sexo);
        clientesCadastrados.add(cliente);
    }

    public void adotarAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tipo de animal deseja adotar?" +
                "\n1-Cachorro" +
                "\n2-Gato");
        switch (sc.nextInt()) {
            case 1 -> {
                for (Cachorro dog : cachorrosAdocao) {
                    //mostrar cachorros
                    cachorrosAdocao.add(new Cachorro("bulldog", "Tobi", 2, 20));
                    cachorrosAdocao.add(new Cachorro("Shih Tzu", "Moana", 4, 5));
                    dog.mostrarCachorros();
                }
            }
            case 2 -> {
                for (Gato cat : gatosAdocao) {
                    //mostrar gatos
                    gatosAdocao.add(new Gato("Siamês", "Mel", 1,2));
                    gatosAdocao.add(new Gato("Persa", "Branquinho", 3,3));
                    cat.mostrarGatos();
                }
            }
            default -> {
                System.out.println("Opção invalida");
                break;
            }
        }
    }

}
