package aula03_estoque;

public class Principal {
    public static void main(String[] args) {
        Estoque meuEstoque = new Estoque();

        System.out.println("LISTA DE PRODUTOS - CREATE:");
        Produto candida = new Produto("Candida","Limpeza","Consumo",50,"Unilever");
        meuEstoque.createProduto(candida);

        Produto ervilha = new Produto("Ervilha","Enlatados","Consumo",50,"Marilan");
        meuEstoque.createProduto(ervilha);

        Produto televisao = new Produto("TV","Eletrônicos","Eletros",20,"Philco");
        meuEstoque.createProduto(televisao);

        System.out.println("LISTA DE PRODUTOS - LIST:");
        meuEstoque.imprimirListaProdutos();

        System.out.println("LISTA DE PRODUTOS - READ:");
        meuEstoque.readProduto(1);

        System.out.println("LISTA DE PRODUTOS - UPDATE:");
        meuEstoque.updateProduto(3,"qtd","30");
        meuEstoque.imprimirListaProdutos();

        System.out.println("LISTA DE PRODUTOS - DELETE:");
        meuEstoque.deleteProduto(2);
        meuEstoque.imprimirListaProdutos();
    }
}
