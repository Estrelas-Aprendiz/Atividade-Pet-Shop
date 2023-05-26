package BrinquedosSetor;

public class BrinquedosparaMorder extends Brinquedos {
    private String textura;

    public BrinquedosparaMorder() {
        super(3, "Bolinha com ranhuras", "petlovers", "borracha mole", "filhote e adulto", "pequena", "vermelha");
        this.textura = "macia";
    }
    @Override
    public String mostrarBrinquedos(){
        return "Preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", codigoDeBarras=" + codigoDeBarras + '\'' +
                ", dimensao= " + dimensao + '\'' +
                ", faixa etaria= " + faixaEtaria + '\'' +
                ", cor= " + cor + '\'' +
                ", textura= " + textura;
    }
}



