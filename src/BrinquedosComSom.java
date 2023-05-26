package src;
public class BrinquedosComSom extends Brinquedos {
    private String tipoDeSom;

    public BrinquedosComSom(double preco, String descricao, String marca, String material, double faxaEtaria, String dimensao, String cor, String tipoDeSom) {
        super(preco, descricao, marca, material, faxaEtaria, dimensao, cor);
        this.tipoDeSom = tipoDeSom;
    }

    public void emitirSom(){
        System.out.println(tipoDeSom);
    }
}
