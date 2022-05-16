package aula05_Inimigos;

public class Vampiro extends Inimigos {

    public Vampiro() {
        this.nome = "Vampiro";
    }

    @Override
    public void interagir() {
        System.out.println("O que é um homem?");
    }

    @Override
    public Dano atacar() {
        System.out.println(this.nome + ": Causou 20 de dano");
        System.out.println(this.nome + ": seu personagem está sangrando");
        return new Dano(20,"perfurante");
    }

    @Override
    public void apanhar(Dano dano) {
        int danoTotal;

        danoTotal = dano.getValorDano();

        if (dano.getTipoDano().equals("perfurante")){
            danoTotal+=dano.getValorDano();
        }

        this.vida -= danoTotal;

        System.out.printf("Recebeu %d de dano",danoTotal);
    }
}
