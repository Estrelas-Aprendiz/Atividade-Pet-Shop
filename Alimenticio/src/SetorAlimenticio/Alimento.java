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
    public void gerarAlimento() {
        List<Alimento> listaAlimentos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcaoUsuario = 0;
        while (opcaoUsuario != 5) {
            System.out.println("Qual alimento você deseja? " +
                    "\n 1. Ração" +
                    "\n 2. Sachê" +
                    "\n 3. Petisco" +
                    "\n 4. Suplemento" +
                    "\n 5. Mostrar itens gerados e finalizar");
            opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario){

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
                case 5:
                    System.out.println("Carrinho: " );
                    for (int i = 0; i < listaAlimentos.size(); i++) {
                        listaAlimentos.get(i).mostrarInformacao();
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
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
    public void mostrarInformacao() {
        System.out.println("Nome: " +getNome()+ "\tPreço: " +getPreco()+ "\tMarca: " +getMarca()+"\tPeso: "+getPesoKg()+"\tCategoria: "+getCategoria());

    }
}
