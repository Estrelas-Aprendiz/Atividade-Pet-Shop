package adocao;

public class Cachorro extends Animal{
    public Cachorro(String raca, String nome, int idade, double peso) {
        super(raca, nome, idade, peso);

    }

    public void mostrarCachorros() {
        System.out.println("Nome: " + nome +
                "\n Raça: " + raca +
                "\n Idade: " + idade +
                "\n Peso: " + peso);

    }
}
