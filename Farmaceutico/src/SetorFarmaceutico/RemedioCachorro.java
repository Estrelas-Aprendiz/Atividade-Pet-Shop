package SetorFarmaceutico;

import java.util.Scanner;

public class RemedioCachorro extends Remedio implements Farmacia{
    public RemedioCachorro(String nome, double miligrama) {
        super(nome, miligrama);
    }

    @Override
    public void medicarAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("O cachorro ja foi vacinado? " +
                "\n 1. sim" +
                "\n 2. nao");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Cachorro nao precisa ser medicado");
                break;
            case 2:
                System.out.println("Cachorro foi medicado com " +  mostrarRemedio());
                break;
            default:
                System.exit(0);
                System.out.println("Opcao invalida");
        }
    }


}
