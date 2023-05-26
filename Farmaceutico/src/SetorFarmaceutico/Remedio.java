package SetorFarmaceutico;
import java.util.ArrayList;
import java.util.List;

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
            // nessa parte do codigo nas queriamos que fosse exibido pro usuario todos os item da lita
            // mas não conseguimos finaliza-lo
            //System.out.println(remedio);
            //System.out.println(mostrarDetalhesDoItem());
        }
    }
}
