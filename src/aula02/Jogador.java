package aula02;

import java.time.LocalDate;
import java.util.Random;

public class Jogador {
    int id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    int numero;
    String posicao;
    private int qualidade = 100;
    private int cartoesAmarelos;
    private int cartaoVermelho;
    private boolean suspenso;
    private boolean treinamentoExecutado = false;

    public Jogador() {

    }

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
    }

    public String toString() {
        return this.posicao + ": - " + this.nome + " (" + this.apelido + ") - " + this.dataNascimento + " CONDIÇÃO: " + verificarCondicaoDeJogo();
    }

    public boolean verificarCondicaoDeJogo() {
        if (cartoesAmarelos >= 3 || cartaoVermelho > 0) {
            this.suspenso = true;
            return false;
        } else {
            this.suspenso = false;
            return true;
        }
    }

    public void aplicarCartaoAmarelo(int quantidade) {
        this.cartoesAmarelos += quantidade;
    }

    public void aplicarCartaoVermelho() {
        this.cartaoVermelho++;
    }

    public void cumprirSuspencao() {
        this.cartaoVermelho = 0;
        this.cartoesAmarelos = 0;
        this.suspenso = false;
    }

    public void sofrerLesao() {
        Random geradorLesao = new Random();
        int probabilidade = geradorLesao.nextInt(100) + 1;
        if (probabilidade <= 5) {
            this.qualidade = (int) (this.qualidade * 0.85);
        } else if (probabilidade <= 10) {
            this.qualidade = (int) (this.qualidade * 0.90);
        } else if (probabilidade <= 15) {
            this.qualidade = (int) (this.qualidade * 0.95);
        } else if (probabilidade <= 30) {
            this.qualidade += 2;
        } else {
            this.qualidade--;
        }
    }

    public void executarTreinamento() {
        if (!this.treinamentoExecutado) {
            Random geradorTreinamento = new Random();
            this.qualidade += geradorTreinamento.nextInt(3) + 1;
            this.treinamentoExecutado = true;
        } else {
            System.out.println("Treinamento já executado para esta partida");
        }
    }

    public int getQualidade() {
        return qualidade;
    }
}