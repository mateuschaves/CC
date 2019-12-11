package Modelos;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<ProdutoQuantidade> estoqueProdutos = new ArrayList<ProdutoQuantidade>();

    public void adicionar(ProdutoQuantidade produtoQuantidade) {
        this.estoqueProdutos.add(produtoQuantidade);
    }

    public void remover(int id) {
        for (ProdutoQuantidade produto : this.estoqueProdutos) {
            if (produto.getProduto().getId() == id) {
                this.estoqueProdutos.remove(produto);
                break;
            }
        }

    }

    public ProdutoQuantidade mostrar(int id) {
        for (ProdutoQuantidade produto : this.estoqueProdutos) {
            if (produto.getProduto().getId() == id) {
                return this.estoqueProdutos.get(this.estoqueProdutos.indexOf(produto));
            }
        }
        return null;
    }

    public ProdutoQuantidade atualizar(int id, ProdutoQuantidade produtoUpdate) {
        for (ProdutoQuantidade produto : this.estoqueProdutos) {
            if (produto.getProduto().getId() == id) {
                this.estoqueProdutos.set(this.estoqueProdutos.indexOf(produto), produtoUpdate);
                return this.estoqueProdutos.get(this.estoqueProdutos.indexOf(produto));
            }
        }
        return this.estoqueProdutos.get(0);
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