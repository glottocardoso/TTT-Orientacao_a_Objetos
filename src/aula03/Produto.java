package aula03;

import java.util.Arrays;

public class Produto {
    private String nomeProduto;
    private String sessaoProduto;
    private String tipoProduto;
    private int qtdProduto;
    private String marcaProduto;
    private int idProduto;
    private static int contadorProduto=0;

    public Produto(String nomeProduto){
        contadorProduto++;
        this.idProduto=contadorProduto;
        this.nomeProduto = nomeProduto;
    }

    public Produto(String nomeProduto, String sessaoProduto, String tipoProduto, int qtdProduto, String marcaProduto) {
        contadorProduto++;
        this.idProduto=contadorProduto;
        this.nomeProduto = nomeProduto;
        this.sessaoProduto = sessaoProduto;
        this.tipoProduto = tipoProduto;
        this.qtdProduto = qtdProduto;
        this.marcaProduto = marcaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getSessaoProduto() {
        return sessaoProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setSessaoProduto(String sessaoProduto) {
        this.sessaoProduto = sessaoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto=" + nomeProduto +
                ", sessaoProduto='" + sessaoProduto + '\'' +
                ", tipoProduto='" + tipoProduto + '\'' +
                ", qtdProduto=" + qtdProduto +
                ", marcaProduto='" + marcaProduto + '\'' +
                ", idProduto=" + idProduto +
                '}';
    }
}
