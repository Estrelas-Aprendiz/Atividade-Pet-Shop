package HigieneN.src;

import java.util.Scanner;

public class Verificacao {
    static Scanner input = new Scanner(System.in);

    public static void verificarCachorro() {
        ServicosHigiene servicosHigiene = new ServicosHigiene();
        System.out.println("Informe a opção desejada: ");
        System.out.println("1- Lavar \t 2- Tosar \t 3- Cortar as Unhas");
        switch (input.nextInt()) {
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
                System.out.println("Qual o comprimento do pelo do seu animal:");
                servicosHigiene.tosar(input.next());
                break;
            case 3:
                System.out.println("Qual tamanho da unha do seu animal:");
                servicosHigiene.cortarUnha(input.next());
                break;
            default:
                System.out.println("Opçao invalida");
                System.exit(0);
        }
    }

}
