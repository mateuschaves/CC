package Modelos;

public class ProdutoQuantidade {
    private Produto produto;
    private int quantidade;

    public ProdutoQuantidade(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ProdutoQuantidade() {

    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void somarQuantidade(int quantidade) {
        this.quantidade++;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}