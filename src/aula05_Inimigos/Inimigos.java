package aula05_Inimigos;

public abstract class Inimigos{
    public int vida = 100;
    public String nome;

    public abstract void interagir();
    public abstract Dano atacar();
    public abstract void apanhar(Dano dano);

}
