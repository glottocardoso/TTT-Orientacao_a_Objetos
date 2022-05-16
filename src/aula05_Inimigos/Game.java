package aula05_Inimigos;

public class Game {
    public void jogar(Inimigos inimigo1, Inimigos inimigo2){
        System.out.println("Start!");
        inimigo1.interagir();
        inimigo2.interagir();

        System.out.println("Ao ataque!");
        inimigo1.apanhar(inimigo2.atacar());
        inimigo2.apanhar(inimigo1.atacar());

        if (inimigo1.vida< inimigo2.vida){
            System.out.println(inimigo1.nome + " venceu!");
        }else if(inimigo2.vida< inimigo1.vida) {
            System.out.println(inimigo2.nome + " venceu!");
        } else {
            System.out.println("EMPATOU!");
        }
    }
}
