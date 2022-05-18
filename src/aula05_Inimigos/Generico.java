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
        Dano dano = new Dano(10,"fogo",": Mensagem genérica");
        System.out.println(this.nome + ": Causou "+ dano.getValorDano() + " com um ataque "+dano.getTipoDano());
        System.out.println(this.nome + dano.getMensagem());
        return dano;
    }

    @Override
    public void apanhar(Dano danoRecebido) {
        this.vida -= danoRecebido.getValorDano();
        System.out.printf(this.nome + ": Recebeu %d de dano\n",danoRecebido.getValorDano());
    }

}
