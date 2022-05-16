package aula05_Inimigos;

public class Dano {
    private int valorDano;
    private String tipoDano;

    public Dano(int valorDano, String tipoDano) {
        this.valorDano = valorDano;
        this.tipoDano = tipoDano;
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
}
