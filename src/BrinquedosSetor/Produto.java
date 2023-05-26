package BrinquedosSetor;

public abstract class Produto {
    protected double preco;
    protected String descricao;
    protected String marca;
    protected String material;
    static int contCodigoDeBarras = 1000;
    protected int codigoDeBarras;

    public Produto(double preco, String descricao, String marca, String material) {
        this.preco = preco;
        this.descricao = descricao;
        this.marca = marca;
        this.material = material;
        Produto.contCodigoDeBarras++;
        this.codigoDeBarras = Produto.contCodigoDeBarras;
    }
    public abstract String mostrarBrinquedos();
}
