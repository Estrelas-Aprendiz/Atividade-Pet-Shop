package src;

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

    public String mostrarProduto(){
        return "Preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", codigoDeBarras=" + codigoDeBarras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
}
