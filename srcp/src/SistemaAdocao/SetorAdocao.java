package SistemaAdocao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetorAdocao {
    private List<Cachorro> cachorrosAdocao = new ArrayList<>();
    private List<Gato> gatosAdocao = new ArrayList<>();

    Scanner sc = new Scanner(System.in);


    public void adotarAnimal() {

        System.out.println("Qual tipo de animal deseja adotar?" +
                "\n1-Cachorro" +
                "\n2-Gato");
        switch (sc.nextInt()) {
            case 1 -> {
                cachorrosAdocao.add(new Cachorro("bulldog", "Tobi", 2, 20));
                cachorrosAdocao.add(new Cachorro("Shih Tzu", "Moana", 4, 5));
                for (int i = 0; i <cachorrosAdocao.size() ; i++) {
                    cachorrosAdocao.get(i).mostrarCachorros();
                }
                escolherQualAdotarCachorro();
            }
            case 2 -> {
                gatosAdocao.add(new Gato("Siamês", "Mel", 1,2));
                gatosAdocao.add(new Gato("Persa", "Branquinho", 3,3));
                for (int i = 0; i <gatosAdocao.size() ; i++) {
                    gatosAdocao.get(i).mostrarGatos();
                }
                escolherQualAdotarGato();
            }
            default -> {
                System.out.println("Opção invalida");

            }

        }
    }
    public void escolherQualAdotarCachorro(){
        System.out.println();
        System.out.println("Qual deles você desa adotar?");
        System.out.println("1- Tobi \n 2- Moana");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Parabéns, você adotou o Tobi!");
                break;
            case 2:
                System.out.println("Parabéns, você adotou a Moana");
                break;

            default:
                System.out.println("Erro");
                System.exit(0);
        }

    }
    public void escolherQualAdotarGato(){
        System.out.println();
        System.out.println("Qual deles você desa adotar?");
        System.out.println("1- Mel \n 2- Branquino");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Parabéns, você adotou a Mel!");
                break;
            case 2:
                System.out.println("Parabéns, você adotou Branquinho");
                break;

            default:
                System.out.println("Erro");
                System.exit(0);
        }

    }
}
