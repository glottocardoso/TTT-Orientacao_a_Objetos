package aula05_inimigos;

public class Vampiro extends Inimigos {

    public Vampiro() {
        this.nome = "Vampiro";
    }

    @Override
    public void interagir() {
        System.out.println(this.nome +": O que é um homem?");
    }

    @Override
    public Dano atacar() {
        Dano dano = new Dano(20,"perfurante",": Seu personagem está sangrando");
        System.out.println(this.nome + ": Causou "+ dano.getValorDano() + " com um ataque "+dano.getTipoDano());
        System.out.println(this.nome + dano.getMensagem());
        return dano;
    }

    @Override
    public void apanhar(Dano danoRecebido) {
        int danoTotal;

        danoTotal = danoRecebido.getValorDano();

        if (danoRecebido.getTipoDano().equals("perfurante")){
            danoTotal+=danoRecebido.getValorDano();
        }

        this.vida -= danoTotal;

        System.out.printf(this.nome+ ": Recebeu %d de dano\n",danoTotal);
    }
}
