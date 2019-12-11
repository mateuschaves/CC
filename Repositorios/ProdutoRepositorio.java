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
            this.ranking.adicionarProduto(new ProdutoQuantidade(produto, 0));

        } catch (Exception a) {
            throw new Exception(a);
        }
        return produto;
    }

    public void removerProdutoEstoque(int id) {
        this.estoque.remover(id);
    }

    public ProdutoQuantidade atualizarProdutoEstoque(int id, ProdutoQuantidade produtoUpdate) {
        return this.estoque.atualizar(id, produtoUpdate);
    }

    public ProdutoQuantidade mostrarProdutoEstoque(int id) {
        return this.estoque.mostrar(id);
    }

    public ArrayList<Produto> listarProdutoEstoque() {
        return this.produtos;
    }

}