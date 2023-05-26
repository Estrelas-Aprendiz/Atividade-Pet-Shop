package src;
public class BrinquedosparaMorder extends Brinquedos {
    private String textura;

    public BrinquedosparaMorder(double preco, String descricao, String marca, String material, double faxaEtaria, String dimensao, String cor, String textura) {
        super(preco, descricao, marca, material, faxaEtaria, dimensao, cor);
        this.textura = textura;
    }
}



