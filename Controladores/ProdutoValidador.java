package Controladores;

import java.util.ArrayList;
import Modelos.*;

public class ProdutoValidador {
    private Produto produto;
    private ArrayList<Produto> produtos;

    public ProdutoValidador(Produto produto, ArrayList<Produto> produtos) {
        this.produto = produto;
        this.produtos = produtos;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void validarId() throws Exception {
        for (Produto produto : produtos) {
            if (this.produto.getId() == produto.getId())
                throw new Exception("Produto já existe !");
        }
    }

    public void validarNome() throws Exception {
        if (this.produto.getNome().length() == 0)
            throw new Exception("Preencha o nome do produto !");

    }

    public void validarMarca() throws Exception {
        if (this.produto.getMarca().length() == 0)
            throw new Exception("Preencha a marca do produto !");

    }

    public void validarValor() throws Exception {
        if (this.produto.getValor() <= 0)
            throw new Exception("O valor precisa ser maior que zero !");

    }

    public void validarDistribuidor() throws Exception {
        if (this.produto.getDistribuidor().length() == 0)
            throw new Exception("Preencha o distribuidor do produto !");

    }

}