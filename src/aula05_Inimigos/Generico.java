package aula05_Inimigos;

public class Generico extends Inimigos{

    public Generico() {
        this.nome = "Generico";
    }

    @Override
    public void interagir() {
        System.out.println(this.nome + ": Por que eu responderia meu inimigo???");
    }

    @Override
    public Dano atacar() {
        System.out.println(this.nome + ": causou 10 de dano");
        return new Dano(10,"comum");
    }

    @Override
    public void apanhar(Dano dano) {
        this.vida -= dano.getValorDano();
        System.out.printf("Recebeu %d de dano",dano.getValorDano());
    }

}
