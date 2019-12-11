package Interfaces;

import java.util.ArrayList;

import Produto.Estoque;
import Produto.Produto;

public interface ProdutoInterface {

    public Estoque getEstoque();

    public Produto adicionarProdutoEstoque(Produto produto, int quantidade) throws Exception;

    public void removerProdutoEstoque(int id);

    public Produto atualizarProdutoEstoque(int id, Produto produtoUpdate);

    public Produto mostrarProdutoEstoque(int id);

    public ArrayList<Produto> listarProdutoEstoque();

}