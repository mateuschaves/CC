package Repositorios;

import java.util.ArrayList;
import Interfaces.ProdutoInterface;
import Modelos.*;
import Controladores.*;

public class ProdutoRepositorio implements ProdutoInterface {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Estoque estoque = new Estoque();
    private Ranking ranking = new Ranking();

    public Estoque getEstoque() {
        return this.estoque;
    }

    public Ranking getRanking() {
        return this.ranking;
    }

    public Produto adicionarProdutoEstoque(Produto produto, int quantidade) throws Exception {
        ProdutoValidador produtoValidador = new ProdutoValidador(produto, produtos);
        try {
            produtoValidador.validarId();
            produtoValidador.validarNome();
            produtoValidador.validarMarca();
            produtoValidador.validarValor();
            produtoValidador.validarDistribuidor();
            this.produtos.add(produto);
            this.estoque.adicionar(new ProdutoQuantidade(produto, quantidade));
            this.ranking.adicionarProduto(new ProdutoQuantidade(produto, quantidade));

        } catch (Exception a) {
            throw new Exception(a);
        }
        return produto;
    }

    public void removerProdutoEstoque(int id) {
        int count = 0;
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove(count);
            }
            count = count + 1;
        }

    }

    public Produto atualizarProdutoEstoque(int id, Produto produtoUpdate) {
        int count = 0;
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.set(count, produtoUpdate);
                return produtos.get(count);
            }
            count = count + 1;
        }
        return null;
    }

    public Produto mostrarProdutoEstoque(int id) {
        int count = 0;
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.get(count);
                return produtos.get(count);
            }
            count = count + 1;
        }
        return null;
    }

    public ArrayList<Produto> listarProdutoEstoque() {
        return this.produtos;
    }

}