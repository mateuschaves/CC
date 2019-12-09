package Produto;

import java.util.ArrayList;

public class ProdutoRepositorio {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Produto criar(Produto produto) throws Exception {
        ProdutoValidador produtoValidador = new ProdutoValidador(produto, produtos);

        try {
            produtoValidador.validarId();
            produtoValidador.validarNome();
            this.produtos.add(produto);
        } catch (Exception a) {
            throw new Exception(a.getMessage());
        }
        return produto;
    }

    public void remover(int id) {
        int count = 0;
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove(count);
            }
            count = count + 1;
        }

    }

    public Produto atualizar(int id, Produto produtoUpdate) {
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

    public Produto mostrar(int id) {
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

    public ArrayList<Produto> listar() {
        return this.produtos;
    }

}