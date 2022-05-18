package aula05_Inimigos;

public class Dano {
    private int valorDano;
    private String tipoDano;
    private String mensagem;

    public Dano(int valorDano, String tipoDano, String mensagemDano) {
        this.valorDano = valorDano;
        this.tipoDano = tipoDano;
        this.mensagem = mensagemDano;
    }

    public void setDano(int valorDano) {
        this.valorDano = valorDano;
    }

    public void setTipoDano(String tipoDano) {
        this.tipoDano = tipoDano;
    }

    public int getValorDano() {
        return valorDano;
    }

    public String getTipoDano() {
        return tipoDano;
    }

    public String getMensagem() {
        return mensagem;
    }
}
