package BrinquedosSetor;

public class BrinquedosComSom extends Brinquedos {
    private String tipoDeSom;

    public BrinquedosComSom() {
        super(3, "Bolinha com sininho", "petlovers", "borracha", "filhote e adulto", "pequena", "azul");
        this.tipoDeSom = "triiiiiiim";
    }
@Override
    public String mostrarBrinquedos(){
        return "Preco = " + preco +
                "\nDescricao = " + descricao +
                "\nMarca = " + marca +
                "\nMaterial = " + material +
                "\nCodigo De Barras = " + codigoDeBarras +
                "\nDimensao = " + dimensao +
                "\nFaixa etaria = " + faixaEtaria +
                "\nCor = " + cor +
                "\nTipo de som = " + tipoDeSom;
    }
}
