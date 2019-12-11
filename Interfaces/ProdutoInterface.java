package Interfaces;

import java.util.ArrayList;

import Modelos.*;

public interface ProdutoInterface {

    public Estoque getEstoque();

    public Produto adicionarProdutoEstoque(Produto produto, int quantidade) throws Exception;

    public void removerProdutoEstoque(int id);

    public ProdutoQuantidade atualizarProdutoEstoque(int id, ProdutoQuantidade produtoUpdate);

    public ProdutoQuantidade mostrarProdutoEstoque(int id);

    public ArrayList<Produto> listarProdutoEstoque();

}