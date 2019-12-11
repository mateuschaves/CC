package Modelos;

import java.util.ArrayList;

public class Ranking {

    private ArrayList<ProdutoQuantidade> produtosVendidos = new ArrayList<ProdutoQuantidade>();

    public void atualizarProduto(ProdutoQuantidade produto) {
        for (ProdutoQuantidade produtoQuantidade : this.produtosVendidos) {
            if (produtoQuantidade.getProduto().getId() == produto.getProduto().getId()) {
                produtosVendidos.get(produtosVendidos.indexOf(produto)).somarQuantidade(produto.getQuantidade());
            }
        }
        bubbleSort(this.produtosVendidos);
    }

    public void bubbleSort(ArrayList<ProdutoQuantidade> produtosVendidos) {
        int n = produtosVendidos.size();
        ProdutoQuantidade temp = new ProdutoQuantidade();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (produtosVendidos.get(j - 1).getQuantidade() > produtosVendidos.get(j).getQuantidade()) {
                    temp = produtosVendidos.get(j - 1);
                    produtosVendidos.set(j - 1, produtosVendidos.get(j));
                    produtosVendidos.set(j, temp);
                }

            }
        }

    }

    public void adicionarProduto(ProdutoQuantidade produto) {
        this.produtosVendidos.add(produto);
        bubbleSort(this.produtosVendidos);
    }

    public ArrayList<ProdutoQuantidade> listar() {
        return this.produtosVendidos;
    }
}