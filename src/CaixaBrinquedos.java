public class CaixaBrinquedos {

   private double preco;
   private double tamanho;
   private String idade;

   public CaixaBrinquedos(double preco, double tamanho, String idade){
       this.preco = preco;
       this.tamanho = tamanho;
       this.idade  = idade;
   }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
