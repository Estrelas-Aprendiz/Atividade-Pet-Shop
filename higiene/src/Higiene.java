public class Higiene implements Limpeza{
    private boolean peloLimpo;
    private boolean peloSeco;
    private String peloTamanho;
    private String unhaTamanho;

    @Override
    public boolean lavar(boolean peloLimpo) {
        if(peloLimpo){
            System.out.println("O animal não precisa de banho!");
        }
        return true;
    }

    @Override
    public boolean secar(String peloSeco) {
        if(peloLimpo){
            System.out.println("O animal não precisa ser secado!");
        }
        return true;
    }

    @Override
    public void tosar(String peloTamanho) {
        if(peloTamanho.equalsIgnoreCase("curto")){
            System.out.println("O animal não precisa de tosa!");
        } else peloTamanho = "curto";
    }

    @Override
    public void cortarUnha(String unhaTamanho) {
        if(unhaTamanho.equalsIgnoreCase("curta")){
            System.out.println("A unha não precisa ser cortada!");
        } else unhaTamanho = "curta";
    }

}
