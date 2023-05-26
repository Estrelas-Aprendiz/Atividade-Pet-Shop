package BrinquedosSetor;

public class BrinquedosComSom extends Brinquedos {
    private String tipoDeSom;

    public BrinquedosComSom() {
        super(3, "Bolinha com sininho", "petlovers", "borracha", "filhote e adulto", "pequena", "azul");
        this.tipoDeSom = "triiiiiiim";
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
                ", tipo de som= " + tipoDeSom;
    }
    public void emitirSom(){
        System.out.println(tipoDeSom);
    }
}
