package SetorFarmaceutico;

public class Remedio {
    private String nome;
    private double miligrama;

    public  Remedio(String nome, double miligrama) {
        this.nome = nome;
        this.miligrama = miligrama;
    }

    public String mostrarRemedio() {
       return miligrama + " miligramas com o remedio " + nome;
    }
}
