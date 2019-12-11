package Modelos;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<ProdutoQuantidade> estoqueProdutos = new ArrayList<ProdutoQuantidade>();

    public void adicionar(ProdutoQuantidade produtoQuantidade) {
        this.estoqueProdutos.add(produtoQuantidade);
    }

    public ArrayList<ProdutoQuantidade> listar() {
        return this.estoqueProdutos;
    }

    public void processarVenda(ArrayList<ProdutoQuantidade> produtosVendidos) throws Exception {
        for (ProdutoQuantidade produtoQuantidade : produtosVendidos) {
            int quantidadeEstoque = estoqueProdutos.get(produtosVendidos.indexOf(produtoQuantidade)).getQuantidade();
            if (quantidadeEstoque < produtoQuantidade.getQuantidade()) {
                throw new Exception("Quantidade insuficiente de " + produtoQuantidade.getProduto().getNome() + " !");
            } else {
                estoqueProdutos.get(produtosVendidos.indexOf(produtoQuantidade))
                        .setQuantidade(quantidadeEstoque - produtoQuantidade.getQuantidade());

            }
        }
    }
}