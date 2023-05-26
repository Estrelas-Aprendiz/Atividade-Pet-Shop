package SistemaAdocao;

public class Gato extends Animal {
    public Gato(String raca, String nome, int idade, double peso) {
        super(raca, nome, idade, peso);
    }

    @Override
    public void mostrarAnimal() {
        System.out.println("\nNome: " + nome +
                "\n Raça: " + raca +
                "\n Idade: " + idade +
                "\n Peso: " + peso);
    }

}

