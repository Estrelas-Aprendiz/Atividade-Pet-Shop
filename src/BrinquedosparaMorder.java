
public class BrinquedosparaMorder extends Brinquedos {
    private String textura;

    public BrinquedosparaMorder(double preco, String descricao, String marca, String material, double faxaEtaria, String dimensao, String cor, String textura) {
        super(preco, descricao, marca, material, faxaEtaria, dimensao, cor);
        this.textura = textura;
    }
    @Override
    public String mostrarBrinquedos(){
        return "Preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", codigoDeBarras=" + codigoDeBarras + '\'' +
                ", dimensao= " + dimensao + '\'' +
                ", faixa etaria= " + faxaEtaria + '\'' +
                ", cor= " + cor + '\'' +
                ", textura= " + textura;
    }
}



