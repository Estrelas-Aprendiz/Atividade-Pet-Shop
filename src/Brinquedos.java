package src;

public abstract class Brinquedos extends Produto{
    protected double faxaEtaria;
    protected String dimensao;
    protected String cor;

    public Brinquedos(double preco, String descricao, String marca, String material, double faxaEtaria, String dimensao, String cor) {
        super(preco, descricao, marca, material);
        this.faxaEtaria = faxaEtaria;
        this.dimensao = dimensao;
        this.cor = cor;
    }
    @Override
    public String mostrarProduto() {
        return super.mostrarProduto()+"\nFaixa etaria: "+faxaEtaria+"\nDimensão: "+dimensao+"\nCor: "+cor;
    }
}




