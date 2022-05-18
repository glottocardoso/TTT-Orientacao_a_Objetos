package aula05_inimigos;

import java.util.Scanner;

public class Game {
    public void jogar(Inimigos inimigo1, Inimigos inimigo2){
        System.out.println("Start!");
        inimigo1.interagir();
        inimigo2.interagir();

        Scanner sc = new Scanner(System.in);
        int continuar;

        do {
            System.out.println("Ao ataque!");
            inimigo1.apanhar(inimigo2.atacar());
            inimigo2.apanhar(inimigo1.atacar());

            if (inimigo1.vida< inimigo2.vida){
                System.out.println(inimigo1.nome + " venceu!");
            }else if(inimigo2.vida< inimigo1.vida) {
                System.out.println(inimigo2.nome + " venceu!");
            } else {
                System.out.println("Empatou!");
            }

            System.out.println("RESULTADO==========");
            System.out.println(inimigo1.nome+" - Vida Restante: "+inimigo1.vida);
            System.out.println(inimigo2.nome+" - Vida Restante: "+inimigo2.vida);

            if (inimigo1.vida<=0){
                System.out.println(inimigo1.nome +" morreu!");
                System.out.println(inimigo2.nome +" É O VENCEDOR!!!");
                break;
            } else if (inimigo2.vida<=0){
                System.out.println(inimigo2.nome +" morreu!");
                System.out.println(inimigo1.nome +" É O VENCEDOR!!!");
                break;
            }

            System.out.println("Deseja um novo combate? (1-SIM / 2-NÃO)");
            continuar = sc.nextInt();

        }while (continuar==1 && inimigo1.vida>0 && inimigo2.vida>0);

        System.out.println("FIM DE JOGO");
    }
}
