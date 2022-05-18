package aula05_inimigos;

public class Cobra extends Inimigos {
    public Cobra() {
        this.nome = "Cobra";
    }

    @Override
    public void interagir() {
        System.out.println(this.nome +": Se você acender a chama a maldição acaba.");
    }

    @Override
    public Dano atacar() {
        Dano dano = new Dano(10,"envenenamento",": Seu personagem está envenenado");
        System.out.println(this.nome + ": Causou "+ dano.getValorDano() + " com um ataque do tipo "+dano.getTipoDano());
        System.out.println(this.nome + dano.getMensagem());
        return dano;
    }

    @Override
    public void apanhar(Dano danoRecebido) {
        int danoTotal;

        danoTotal = danoRecebido.getValorDano();

        if (danoRecebido.getTipoDano().equals("pancada")){
            danoTotal+=danoRecebido.getValorDano();
        }

        this.vida -= danoTotal;

        System.out.printf(this.nome+ ": Recebeu %d de dano\n",danoTotal);
    }
}
