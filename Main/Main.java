package Main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import Caixa.*;
import Clientes.*;
import Produto.*;
import Vendas.*;

public class Main {
    public static void main(String[] args) {

        Calendar horaEntrada = Calendar.getInstance();
        horaEntrada.set(Calendar.HOUR, 8);

        Calendar horaSaida = Calendar.getInstance();
        horaSaida.set(Calendar.HOUR, 10);

        Caixa caixa = new Caixa(1, false, false);
        CaixaAtendente caixaAtendente = new CaixaAtendente("Mateus Henrique", "115.058.024-07", caixa, horaEntrada,
                horaSaida);

        Cliente cliente = new Cliente(1, "Mateus Henrique", new Date(), "81 973248342", "Rua Ayres da Cunha",
                "115.058.024-07");

        CaixaRepositorio repo = new CaixaRepositorio();
        repo.criar(caixa);

        System.out.println("Nome: " + caixaAtendente.getNome());
        System.out.println("Horario de entrada: " + caixaAtendente.getHorarioEntrada());
        System.out.println("Horario de saida: " + caixaAtendente.getHorarioSaida());

        ProdutoRepositorio produtoss = new ProdutoRepositorio();
        Produto ninho = new Produto(1, "ninho", "nestle", 48, "vale");
        Produto miojo = new Produto(2, "asdsad", "nissin", 1.50, "vitarela");
        try {
            produtoss.criar(ninho);
            produtoss.criar(miojo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("ID: " + ninho.getId());
        System.out.println("Nome: " + ninho.getNome());
        System.out.println("Marca: " + ninho.getMarca());
        System.out.println("Preco: " + ninho.getValor());
        System.out.println("distribuidor: " + ninho.getDistribuidor());

        ProdutoQuantidade produtoQuantidade = new ProdutoQuantidade(ninho, 3);
        ProdutoQuantidade produtoQuantidade2 = new ProdutoQuantidade(miojo, 10);

        System.out.println(
                "Produto: " + produtoQuantidade.getProduto().getNome() + " x" + produtoQuantidade.getQuantidade());
        ArrayList<ProdutoQuantidade> produtos = new ArrayList<ProdutoQuantidade>();

        produtos.add(produtoQuantidade);
        produtos.add(produtoQuantidade2);

        Venda venda = new Venda(cliente, produtos, new Date(), 10);

        System.out.println("Cliente: " + venda.getCliente().getNome());
        System.out.println("Produto: " + venda.getProdutos().get(0).getProduto().getNome() + " x"
                + venda.getProdutos().get(0).getQuantidade() + " = "
                + venda.getProdutos().get(0).getProduto().getValor() * venda.getProdutos().get(0).getQuantidade());

        System.out.println("");
        System.out.println("Produto: " + venda.getProdutos().get(1).getProduto().getNome() + " x"
                + venda.getProdutos().get(1).getQuantidade() + " = "
                + venda.getProdutos().get(1).getProduto().getValor() * venda.getProdutos().get(1).getQuantidade());

    }

}
