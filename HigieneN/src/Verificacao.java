import java.util.Scanner;

public class Verificacao {
        static Scanner input = new Scanner(System.in);

        public static void verificarCachorro() {
            Higiene higiene = new Higiene();
            System.out.println("Informe a opção desejada: ");
            System.out.println("1- Lavar \t 2- Tosar \t 3- Cortar as Unhas");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Informe a codição do pelo: ");
                    System.out.println("1- Limpo \t 2- Sujo");
                    if (input.nextInt() == 1) {
                        higiene.lavar(true);
                    } else {
                        System.out.println("Animal indo para o banho");
                        higiene.lavar(false);
                    }
                    break;
                case 2:
                    System.out.println("Qual tamanho do pelo do seu animal:");
                    higiene.tosar(input.next());
                    break;
                case 3:
                    System.out.println("Qual tamanho da unha do seu animal:");
                    higiene.cortarUnha(input.next());
            }
        }

    }
