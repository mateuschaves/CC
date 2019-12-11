import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Modelos.*;
import Repositorios.*;
import sun.swing.icon.SortArrowIcon;

public class Main {
        public static void main(String[] args) {

                // Set Início e Fim de atendimento
                Calendar horaEntrada = Calendar.getInstance();
                horaEntrada.set(Calendar.HOUR, 8);
                Calendar horaSaida = Calendar.getInstance();
                horaSaida.set(Calendar.HOUR, 10);

                Caixa caixa = new Caixa(1, false, false);
                Caixa caixa2 = new Caixa(2, false, false);
                Caixa caixa3 = new Caixa(3, false, false);

                CaixaAtendente caixaAtendente = new CaixaAtendente("Mateus Henrique", "115.058.024-07", caixa,
                                horaEntrada, horaSaida);
                CaixaAtendente caixaAtendente2 = new CaixaAtendente("Lucas Zamorano", "999.999.999-99", caixa,
                                horaEntrada, horaSaida);
                CaixaAtendente caixaAtendente3 = new CaixaAtendente("João Neto", "000.000.000-00", caixa, horaEntrada,
                                horaSaida);

                Cliente cliente = new Cliente(1, "Mateus Henrique", new Date(), "81 973248342", "Rua Ayres da Cunha",
                                "115.058.024-07");
                Cliente cliente2 = new Cliente(2, "Lucas Ferraz", new Date(), "81 999999999", "Rua Leite da Pedra",
                                "999.999.999-99");
                Cliente cliente3 = new Cliente(3, "João Domingos", new Date(), "81 991511510", "Rua Euclides Leite",
                                "000.000.000-00");

                System.out.println("Nome: " + caixaAtendente.getNome());
                System.out.println("Horario de entrada: " + caixaAtendente.getHorarioEntrada());
                System.out.println("Horario de saida: " + caixaAtendente.getHorarioSaida());

                ProdutoRepositorio produtoss = new ProdutoRepositorio();
                Produto ninho = new Produto(1, "ninho", "nestle", 3.50, "vale");
                Produto miojo = new Produto(2, "Miojo Galinha", "nissin", 1.50, "vitarela");
                Produto feijao = new Produto(3, "Feijão Mulato", "Tio João", 10.0, "vitarela");
                Produto arroz = new Produto(4, "Arroz Emoções", "Emoções", 4.50, "vitarela");
                Produto macarrao = new Produto(5, "Espaguete", "vitarela", 3.50, "vitarela");
                Produto sushi = new Produto(6, "Sushi", "Japão", 12.0, "vitarela");
                Produto paçoca = new Produto(7, "Paçoca", "vitarela", 2.0, "vitarela");
                Produto feijoada = new Produto(8, "Feijoada", "vitarela", 50, "vitarela");
                Produto pizza = new Produto(9, "Pizza", "Domino's", 29.0, "vitarela");
                Produto temaki = new Produto(10, "Temaki", "Eiji", 55, "vitarela");
                try {
                        produtoss.adicionarProdutoEstoque(ninho, 1);
                        produtoss.adicionarProdutoEstoque(miojo, 3);
                        produtoss.adicionarProdutoEstoque(feijao, 50);
                        produtoss.adicionarProdutoEstoque(arroz, 25);
                        produtoss.adicionarProdutoEstoque(macarrao, 60);
                        produtoss.adicionarProdutoEstoque(sushi, 29);
                        produtoss.adicionarProdutoEstoque(paçoca, 35);
                        produtoss.adicionarProdutoEstoque(feijoada, 7);
                        produtoss.adicionarProdutoEstoque(pizza, 100);
                        produtoss.adicionarProdutoEstoque(temaki, 6);

                } catch (Exception e) {
                        System.out.println(e);
                }

                try {
                        System.out.println("Ranking Atual: ");
                        for (ProdutoQuantidade produtoQuantidade : produtoss.getRanking().listar()) {
                                System.out.println(produtoQuantidade.getProduto().getNome() + " x"
                                                + produtoQuantidade.getQuantidade());
                        }

                } catch (Exception e) {
                        System.out.println(e);
                }

                try {
                        System.out.println("Estoque Atual: ");
                        for (ProdutoQuantidade produtoQuantidade : produtoss.getEstoque().listar()) {
                                System.out.println(produtoQuantidade.getProduto().getNome() + " x"
                                                + produtoQuantidade.getQuantidade());
                        }
                } catch (Exception e) {
                        System.out.println(e);
                }

                ProdutoQuantidade produtoVendidos = new ProdutoQuantidade(ninho, 1);
                ProdutoQuantidade produtoVendidos2 = new ProdutoQuantidade(miojo, 4);
                ProdutoQuantidade produtoVendidos3 = new ProdutoQuantidade(sushi, 10);
                ProdutoQuantidade produtoVendidos4 = new ProdutoQuantidade(macarrao, 10);
                ProdutoQuantidade produtoVendidos5 = new ProdutoQuantidade(pizza, 200);
                ProdutoQuantidade produtoVendidos6 = new ProdutoQuantidade(temaki, 10);

                ArrayList<ProdutoQuantidade> produtosCliente1 = new ArrayList<ProdutoQuantidade>();
                produtosCliente1.add(produtoVendidos);
                produtosCliente1.add(produtoVendidos2);

                ArrayList<ProdutoQuantidade> produtosCliente2 = new ArrayList<ProdutoQuantidade>();
                produtosCliente2.add(produtoVendidos3);
                produtosCliente2.add(produtoVendidos4);

                ArrayList<ProdutoQuantidade> produtosCliente3 = new ArrayList<ProdutoQuantidade>();
                produtosCliente3.add(produtoVendidos5);
                produtosCliente3.add(produtoVendidos6);

                VendasRepositorio vendas = new VendasRepositorio();
                vendas.adicionarVenda(new Venda(1, cliente, produtosCliente1, new Date(), 10, produtoss));
                vendas.adicionarVenda(new Venda(2, cliente2, produtosCliente2, new Date(), 111, produtoss));
                vendas.adicionarVenda(new Venda(3, cliente3, produtosCliente3, new Date(), 40, produtoss));
                vendas.adicionarVenda(new Venda(4, cliente2, produtosCliente3, new Date(), 24, produtoss));


                System.out.println("Listando Vendas feitas: ");
                System.out.println(vendas.listar());

                System.out.println("Cancelando uma venda de cod 1... ");
                vendas.cancelarVenda(1);
                System.out.println(vendas.listar());

                System.out.println("\n");

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

                try {
                        System.out.println("Ranking após vendas: ");
                        for (ProdutoQuantidade produtoQuantidade : produtoss.getRanking().listar()) {
                                System.out.println(produtoQuantidade.getProduto().getNome() + " x"
                                                + produtoQuantidade.getQuantidade());
                        }

                } catch (Exception e) {
                        System.out.println(e);
                }

                try {
                        System.out.println("Estoque após vendas: ");
                        for (ProdutoQuantidade produtoQuantidade : produtoss.getEstoque().listar()) {
                                System.out.println(produtoQuantidade.getProduto().getNome() + " x"
                                                + produtoQuantidade.getQuantidade());
                        }
                } catch (Exception e) {
                        System.out.println(e);
                }
        }

}
