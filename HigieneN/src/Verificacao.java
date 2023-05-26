package HigieneN.src;

import java.util.Scanner;

public class Verificacao {
    static Scanner input = new Scanner(System.in);

    public static void verificarCachorro() {
        ServicosHigiene servicosHigiene = new ServicosHigiene();
        while(true) {
            System.out.println("Informe a opção desejada: ");
            System.out.println("1- Lavar \t 2- Tosar \t 3- Cortar as Unhas \t 4 - Sair do serviço de higiene");
            int escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Informe a codição do pelo: ");
                    System.out.println("1- Limpo \t 2- Sujo");
                    if (input.nextInt() == 1) {
                        servicosHigiene.lavar(true);
                    } else {
                        System.out.println("Animal indo para o banho");
                        servicosHigiene.lavar(false);
                    }
                    break;
                case 2:
                    System.out.println("Qual o comprimento do pelo do seu animal: curto ou longo?");
                    servicosHigiene.tosar(input.next());
                    break;
                case 3:
                    System.out.println("Qual tamanho da unha do seu animal:");
                    servicosHigiene.cortarUnha(input.next());
                    break;
                case 4:
                    System.out.println("Tchau! Volte Sempre!");
                    break;
                default:
                    System.out.println("Opçao invalida");
                    System.exit(0);
            }
            if(escolha==4){
                break;
            }else {
                System.out.println("Deseja mais alguma coisa: ");
            }
        }
    }

}
