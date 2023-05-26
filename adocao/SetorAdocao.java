package adocao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SetorAdocao {
    private LocalDate dataAdocao;
    private List<Cachorro> cachorrosAdocao;
    private List<Gato> gatosAdocao;
    private List<Cliente> clientesCadastrados;

    public void cadastraCliente(String nome,String cpf,String endereco,int idade,char sexo){
        Cliente cliente = new Cliente(nome,cpf,endereco,idade,sexo);
        clientesCadastrados.add(cliente);
    }
    public void adotarAnimal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tipo de animal deseja adotar?\n1-Cachorro\n2-Gato");
        switch (sc.nextInt()) {
            case 1 -> {
                for (Cachorro dog : cachorrosAdocao) {
                    //mostrar cachorros
                }
            }
            case 2 -> {
                for (Gato cat : gatosAdocao) {
                    //mostrar gatos
                }
            }
            default -> {
                System.out.println("Opção invalida");
                break;
            }
        }
    }

}
