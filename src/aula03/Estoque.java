package aula03;

import java.util.ArrayList;

public class Estoque {
    public String nomeEstoque;
    private ArrayList<Produto> listaDeProdutos;
    private int idEstoque;
    private boolean produtoExistente = false;
    private static int contadorEstoque=0;

    Estoque(){
        contadorEstoque++;
        this.idEstoque=contadorEstoque;
        listaDeProdutos = new ArrayList<>();
    }

    Estoque(String nome){
        contadorEstoque++;
        this.idEstoque=contadorEstoque;
        this.nomeEstoque = nome;
        listaDeProdutos = new ArrayList<>();
    }

    Estoque(String nome, ArrayList<Produto>listaDeProdutos){
        contadorEstoque++;
        this.idEstoque=contadorEstoque;
        this.nomeEstoque = nome;
        this.listaDeProdutos = listaDeProdutos;
    }

    public void addProduto(Produto produto) {
        for (Produto eachProduto:listaDeProdutos) {
            if (eachProduto.getNomeProduto()==produto.getNomeProduto()){
                boolean produtoExistente = true;
                eachProduto.setQtdProduto(produto.getQtdProduto()+eachProduto.getQtdProduto());
            }
        }
        if (!produtoExistente){
            listaDeProdutos.add(produto);
        }
    }

    public void removeProduto(String nomeProduto) {
        ArrayList<Produto> produtoASerExcluido = readProduto(nomeProduto).listaDeProdutos;
        this.listaDeProdutos.remove(produtoASerExcluido);
    }


    public void listProdutos() {
        for (Produto produto: listaDeProdutos) {
            System.out.println(produto.getNomeProduto());
        }
    }

    public Estoque readProduto(String nomeProduto) {
        Estoque newEstoque = new Estoque();

        for (Produto produto:this.listaDeProdutos) {
            for (String filtroProduto: produto.getNomeProduto()) {
                if (filtroProduto.equals(nomeProduto)) {
                    newEstoque.addProduto(produto);
                }
            }
        }

        return newEstoque;
    }
}
