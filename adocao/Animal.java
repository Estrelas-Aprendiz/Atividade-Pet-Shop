package adocao;

abstract class Animal {
    protected String raca;
    protected String nome;
    protected int idade;
    protected double peso;

    public Animal(String raca, String nome, int idade, double peso) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
}
