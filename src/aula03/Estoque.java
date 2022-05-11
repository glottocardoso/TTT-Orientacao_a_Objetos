package aula03;

import java.util.ArrayList;

public class Estoque {
    public String nomeEstoque;
    private final ArrayList<Produto> listaDeProdutos;
    private int idEstoque=0;
    private static int contadorEstoque=0;
    int posicaoProdutoDeletado = 0;

    //Constructors:
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

    //CRUD:
    public void createProduto(Produto novoProduto) {
        for (Produto eachProduto:this.listaDeProdutos) {
            if (eachProduto.getNomeProduto().equals(novoProduto.getNomeProduto()) && eachProduto.getMarcaProduto().equals(novoProduto.getMarcaProduto())){
                updateProduto(eachProduto.getIdProduto(), "qtd",Integer.toString(novoProduto.getQtdProduto()+eachProduto.getQtdProduto()));
                //eachProduto.setQtdProduto(novoProduto.getQtdProduto()+eachProduto.getQtdProduto());
                return;
            }
        }
        this.listaDeProdutos.add(novoProduto);
    }

    public void readProduto(int idProduto) {
        listaDeProdutos.forEach(produto -> {
            if (produto.getIdProduto()==idProduto) {
                System.out.println(produto.toString());
                return;
            }
        });
    }

    public void updateProduto(int idProduto, String atributo, String valor){
        listaDeProdutos.forEach(produto -> {
            if (produto.getIdProduto()==idProduto){
                switch (atributo){
                    case "nome":produto.setNomeProduto(valor);
                        break;
                    case "sessao": produto.setSessaoProduto(valor);
                        break;
                    case "tipo": produto.setTipoProduto(valor);
                        break;
                    case "qtd": produto.setQtdProduto(Integer.parseInt(valor));
                        break;
                    case "marca": produto.setMarcaProduto(valor);
                        break;
                    default:
                        System.out.println("Atributo inexistente");
                        break;
                }
            }
        });
    }

    public void deleteProduto(int idProduto) {
        listaDeProdutos.forEach(produto -> {
            if (produto.getIdProduto()==idProduto){
                this.posicaoProdutoDeletado = this.listaDeProdutos.indexOf(produto);
                return;
            }
        });
        this.listaDeProdutos.remove(posicaoProdutoDeletado);
    }

    //Impressões console:
    public void listProdutos() {
        listaDeProdutos.forEach(produto -> {
            System.out.println(produto.toString());
        });
    }

    public void imprimirListaProdutos(){
        if (listaDeProdutos.isEmpty()){
            System.out.println("Não há registro de produtos nessa lista");
        }else {
            listProdutos();
        }
    }
}
