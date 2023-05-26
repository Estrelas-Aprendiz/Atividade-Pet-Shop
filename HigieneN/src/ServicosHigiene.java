package HigieneN.src;

public class ServicosHigiene implements Limpeza{

    @Override
    public boolean lavar(boolean peloLimpo) {
        if(peloLimpo){
            System.out.println("O animal não precisa de banho!");
        }
        secar();
        return true;
    }
    @Override
    public boolean secar() {

        return true;
    }
    @Override
    public void tosar(String peloTamanho) {
        if (peloTamanho.equalsIgnoreCase("curto")) {
            System.out.println("O animal não precisa de tosa!");
        } else if (peloTamanho.equalsIgnoreCase("longo")){
            System.out.println("O animal esta sendo tosado");
        }else {
            System.out.println("Opcao invalida");
        }
    }
    @Override
    public void cortarUnha(String unhaTamanho) {
        if(unhaTamanho.equalsIgnoreCase("curta")){
            System.out.println("A unha não precisa ser cortada!");
        } else if (unhaTamanho.equalsIgnoreCase("longa")){
            System.out.println("O animal esta indo cortar as unhas");
        }else{
            System.out.println("Opcao invalida");
        }
    }
}
