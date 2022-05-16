package aula05_Inimigos;

public class Principal {
    public static void main(String[] args) {
        Game game = new Game();

        Vampiro vampiro = new Vampiro();
        Generico generico = new Generico();

        game.jogar(vampiro,generico);
    }
}
