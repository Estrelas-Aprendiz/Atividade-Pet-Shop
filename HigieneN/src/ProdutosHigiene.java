package HigieneN.src;

public class ProdutosHigiene {
    //extenderia Produto
    private String tipo;
    private String dataDeValidade;
    private double capacidade;
    private String composicao;

    public ProdutosHigiene(String tipo, String dataDeValidade, double capacidade,String composicao) {
        this.tipo = tipo;
        this.dataDeValidade = dataDeValidade;
        this.capacidade = capacidade;
        this.composicao = composicao;
    }
}
