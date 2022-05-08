package aula02;

import java.time.LocalDate;

public class Exc1 {
    public static void main(String[] args) {
        LocalDate[] datasNascimento;
        datasNascimento = new LocalDate[11];

        datasNascimento[0] = LocalDate.of(1981, 11, 11);
        datasNascimento[1] = LocalDate.of(1971, 1, 1);
        datasNascimento[2] = LocalDate.of(1972, 2, 2);
        datasNascimento[3] = LocalDate.of(1973, 3, 3);
        datasNascimento[4] = LocalDate.of(1974, 4, 4);
        datasNascimento[5] = LocalDate.of(1975, 5, 5);
        datasNascimento[6] = LocalDate.of(1976, 6, 6);
        datasNascimento[7] = LocalDate.of(1977, 7, 7);
        datasNascimento[8] = LocalDate.of(1978, 8, 8);
        datasNascimento[9] = LocalDate.of(1979, 9, 9);
        datasNascimento[10] = LocalDate.of(1980, 10, 10);

        Jogador[] jogadores;
        jogadores = new Jogador[11];

        jogadores[0] = new Jogador(0, "José Eduardo", "Poeta", datasNascimento[0], 11, "Atacante");
        jogadores[1] = new Jogador(1, "Ronaldo Navarro", "Ronaldinho", datasNascimento[1], 1, "Atacante");
        jogadores[2] = new Jogador(2, "Leandro Almeida", "Lelo", datasNascimento[2], 2, "Zagueiro");
        jogadores[3] = new Jogador(3, "Washington Sebastián", "Loco Abreu", datasNascimento[3], 3, "Goleiro");
        jogadores[4] = new Jogador(4, "Neymar Junior", "Ney", datasNascimento[4], 4, "Ponta direita");
        jogadores[5] = new Jogador(5, "Diego Vasconcelos", "Didi", datasNascimento[5], 5, "Ponta esquerda");
        jogadores[6] = new Jogador(6, "Alberto Almeida", "Betinho", datasNascimento[6], 6, "Atacante");
        jogadores[7] = new Jogador(7, "Ilberany Gallo", "Ronaldinho", datasNascimento[7], 7, "Volante");
        jogadores[8] = new Jogador(8, "Gilberto Cabrera", "Giba", datasNascimento[8], 8, "Volante");
        jogadores[9] = new Jogador(9, "Gilmar Gomes", "Cabrera", datasNascimento[9], 9, "Lateral direito");
        jogadores[10] = new Jogador(10, "Valdecir Camacho", "Valdek", datasNascimento[10], 10, "Lateral esquerdo");

        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(jogadores[i].toString());
        }

        System.out.println("CARTÃO AMARELO:");
        jogadores[0].aplicarCartaoAmarelo(3);
        System.out.println(jogadores[0].toString());

        System.out.println("CARTÃO VERMELHO:");
        jogadores[1].aplicarCartaoVermelho();
        System.out.println(jogadores[1].toString());

        System.out.println("CUMPRIR SUSPENSÃO:");
        jogadores[1].cumprirSuspencao();
        System.out.println(jogadores[1].toString());

        System.out.println("SOFRER LESÃO:");
        System.out.println("Qualidade inicial do jogador 2: "+ jogadores[2].getQualidade());
        jogadores[2].sofrerLesao();
        System.out.println("Qualidade final do jogador 2: "+ jogadores[2].getQualidade());

        System.out.println("Qualidade inicial do jogador 3: "+ jogadores[3].getQualidade());
        jogadores[3].sofrerLesao();
        System.out.println("Qualidade final do jogador 3: "+ jogadores[3].getQualidade());

        System.out.println("EXECUTAR TREINAMENTO:");
        System.out.println("Qualidade inicial do jogador 2: "+ jogadores[2].getQualidade());
        jogadores[2].executarTreinamento();
        System.out.println("Qualidade final do jogador 2: "+ jogadores[2].getQualidade());

        System.out.println("Qualidade inicial do jogador 3: "+ jogadores[3].getQualidade());
        jogadores[3].executarTreinamento();
        System.out.println("Qualidade final do jogador 3: "+ jogadores[3].getQualidade());
    }
}