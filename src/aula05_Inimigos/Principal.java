package aula05_Inimigos;

public class Principal {
    public static void main(String[] args) {
        Game game = new Game();

        Vampiro vampiro = new Vampiro();
        Generico generico = new Generico();
        Cobra cobra = new Cobra();
        Gigante gigante = new Gigante();

        game.jogar(vampiro,generico);
        game.jogar(vampiro,cobra);
        game.jogar(vampiro,gigante);
    }
}
