package higiene.src;

public interface Limpeza {

    boolean lavar(boolean peloLimpo);
    boolean secar(String peloEstado);
    void tosar(String peloTamanho);
    void cortarUnha(String unhaTamanho);
}
