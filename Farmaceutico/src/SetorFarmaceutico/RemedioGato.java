package SetorFarmaceutico;

import java.util.Scanner;

public class RemedioGato extends Remedio implements Farmacia{
    public RemedioGato(String nome, double miligrama) {
        super(nome, miligrama);
    }

    @Override
    public void medicarAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("O gato ja foi vacinado? " +
                "\n 1. sim" +
                "\n 2. nao");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Gato nao precisa ser vacinado");
                break;
            case 2:
                System.out.println("O gato foi medicado com " +  mostrarRemedio());
                break;
            default:
                System.exit(0);
                System.out.println("Opcao invalida");
        }
    }
}
