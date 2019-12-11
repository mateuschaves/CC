package Modelos;

import Repositorios.*;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ProdutoQuantidade> produtos = new ArrayList<ProdutoQuantidade>();
    private Date dataCompra;
    private float precoTotal;
    private ProdutoRepositorio produtosRepositorioo;

    public Venda(int id, Cliente cliente, ArrayList<ProdutoQuantidade> produtos, Date dataCompra, float precoTotal,
            ProdutoRepositorio produtosRepositorioo) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataCompra = dataCompra;
        this.precoTotal = precoTotal;
        this.produtosRepositorioo = produtosRepositorioo;

        try {
            this.produtosRepositorioo.getEstoque().processarVenda(produtos);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            System.out.println(produtos);
            for (ProdutoQuantidade produtoQuantidade : produtos) {
                this.produtosRepositorioo.getRanking().atualizarProduto(produtoQuantidade);
            }
        } catch (Exception e) {
            System.out.println("e.getMessage()");

            System.out.println(e.getMessage());
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ProdutoQuantidade> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(ArrayList<ProdutoQuantidade> produtos) {
        this.produtos = produtos;
    }

    public Date getDataCompra() {
        return this.dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public float getPrecoTotal() {
        return this.precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }
}