package Vendas;

import Clientes.*;
import Produto.*;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private Cliente cliente;
    private ArrayList<ProdutoQuantidade> produtos = new ArrayList<ProdutoQuantidade>();
    private Date dataCompra;
    private float precoTotal;

    public Venda(Cliente cliente, ArrayList<ProdutoQuantidade> produtos, Date dataCompra, float precoTotal) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.dataCompra = dataCompra;
        this.precoTotal = precoTotal;
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