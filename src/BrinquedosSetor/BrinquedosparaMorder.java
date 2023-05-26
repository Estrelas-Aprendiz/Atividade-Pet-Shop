package BrinquedosSetor;

public class BrinquedosparaMorder extends Brinquedos {
    private String textura;

    public BrinquedosparaMorder() {
        super(3, "Bolinha com ranhuras", "petlovers", "borracha mole", "filhote e adulto", "pequena", "vermelha");
        this.textura = "macia";
    }
    @Override
    public String mostrarBrinquedos(){
        return "\nPreco = " + preco +
                "\nDescricao = " + descricao +
                "\nMarca = " + marca +
                "\nMaterial = " + material +
                "\nCodigo De Barras = " + codigoDeBarras +
                "\nDimensao = " + dimensao +
                "\nFaixa etaria = " + faixaEtaria +
                "\nCor = " + cor +
                "\nTextura = " + textura;
    }
}



