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
                CaixaAtendente caixaAtendente = new CaixaAtendente("Mateus Henrique", "115.058.024-07", caixa,
                                horaEntrada, horaSaida);

                Cliente cliente = new Cliente(1, "Mateus Henrique", new Date(), "81 973248342", "Rua Ayres da Cunha",
                                "115.058.024-07");

                CaixaRepositorio repo = new CaixaRepositorio();
                repo.criar(caixa);

                System.out.println("Nome: " + caixaAtendente.getNome());
                System.out.println("Horario de entrada: " + caixaAtendente.getHorarioEntrada());
                System.out.println("Horario de saida: " + caixaAtendente.getHorarioSaida());

                ProdutoRepositorio produtoss = new ProdutoRepositorio();
                Produto ninho = new Produto(1, "ninho", "nestle", 48, "vale");
                Produto miojo = new Produto(2, "Miojo Galinha", "nissin", 1.50, "vitarela");
                Produto feijao = new Produto(3, "Feijão Mulato", "Tio João", 10.0, "vitarela");
                Produto arroz = new Produto(4, "Arroz Emoções", "Emoções", 4.50, "vitarela");
                Produto macarrao = new Produto(5, "Espaguete", "vitarela", 3.50, "vitarela");
                try {
                        produtoss.criar(ninho, 1);
                        produtoss.criar(miojo, 3);
                        produtoss.criar(feijao, 50);
                        produtoss.criar(arroz, 25);
                        produtoss.criar(macarrao, 100);

                } catch (Exception e) {
                        System.out.println(e);
                }

                try {
                        for (ProdutoQuantidade produtoQuantidade : produtoss.getEstoque().listar()) {
                                System.out.println(produtoQuantidade.getProduto().getNome() + " x"
                                                + produtoQuantidade.getQuantidade());
                        }
                } catch (Exception e) {
                        System.out.println(e);
                }

                // System.out.println("ID: " + ninho.getId());
                // System.out.println("Nome: " + ninho.getNome());
                // System.out.println("Marca: " + ninho.getMarca());
                // System.out.println("Preco: " + ninho.getValor());
                // System.out.println("distribuidor: " + ninho.getDistribuidor());

                ProdutoQuantidade produtoQuantidade = new ProdutoQuantidade(ninho, 1);
                ProdutoQuantidade produtoQuantidade2 = new ProdutoQuantidade(miojo, 4);

                // System.out.println("Produto: " + produtoQuantidade.getProduto().getNome() + "
                // x"
                // + produtoQuantidade.getQuantidade());
                ArrayList<ProdutoQuantidade> produtos = new ArrayList<ProdutoQuantidade>();

                produtos.add(produtoQuantidade);
                produtos.add(produtoQuantidade2);

                Venda venda = new Venda(cliente, produtos, new Date(), 10, produtoss);

                System.out.println("\n");
                try {
                        for (ProdutoQuantidade produtoQuantidadeDois : produtoss.getEstoque().listar()) {
                                System.out.println(produtoQuantidadeDois.getProduto().getNome() + " x"
                                                + produtoQuantidadeDois.getQuantidade());
                        }
                } catch (Exception e) {
                        System.out.println(e);
                }

                // System.out.println("Cliente: " + venda.getCliente().getNome());
                // System.out.println("Produto: " +
                // venda.getProdutos().get(0).getProduto().getNome() + " x"
                // + venda.getProdutos().get(0).getQuantidade() + " = "
                // + venda.getProdutos().get(0).getProduto().getValor()
                // * venda.getProdutos().get(0).getQuantidade());

                // System.out.println("");
                // System.out.println("Produto: " +
                // venda.getProdutos().get(1).getProduto().getNome() + " x"
                // + venda.getProdutos().get(1).getQuantidade() + " = "
                // + venda.getProdutos().get(1).getProduto().getValor()
                // * venda.getProdutos().get(1).getQuantidade());

        }

}
