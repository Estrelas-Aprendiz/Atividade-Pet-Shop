
public class BrinquedosComSom extends Brinquedos {
    private String tipoDeSom;

    public BrinquedosComSom(double preco, String descricao, String marca, String material, double faxaEtaria, String dimensao, String cor, String tipoDeSom) {
        super(preco, descricao, marca, material, faxaEtaria, dimensao, cor);
        this.tipoDeSom = tipoDeSom;
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
                ", tipo de som= " + tipoDeSom;
    }
    public void emitirSom(){
        System.out.println(tipoDeSom);
    }
}
