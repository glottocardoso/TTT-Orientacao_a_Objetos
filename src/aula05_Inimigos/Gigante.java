package aula05_Inimigos;

public class Gigante extends Inimigos {

    public Gigante() {
        this.nome = "Gigante";
    }

    @Override
    public void interagir() {
        System.out.println(this.nome +": Me desculpe");
    }

    @Override
    public Dano atacar() {
        Dano dano = new Dano(25,"pancada",": seu personagem está atordoado");
        System.out.println(this.nome + ": Causou "+ dano.getValorDano() + " com um ataque do tipo "+dano.getTipoDano());
        System.out.println(this.nome + dano.getMensagem());
        return dano;
    }

    @Override
    public void apanhar(Dano danoRecebido) {
        int danoTotal;

        danoTotal = danoRecebido.getValorDano();

        if (danoRecebido.getTipoDano().equals("fogo")){
            danoTotal+=danoRecebido.getValorDano();
        }

        this.vida -= danoTotal;

        System.out.printf(this.nome+ ": Recebeu %d de dano\n",danoTotal);
    }
}
