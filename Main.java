import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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

    Produto produto = new Produto(1, "ninho", "nestle", 48, "vale");
    Produto produto2 = new Produto(2, "Miojo", "nissin", 1.50, "vitarela");
    System.out.println("ID: " + produto.getId());
    System.out.println("Nome: " + produto.getNome());
    System.out.println("Marca: " + produto.getMarca());
    System.out.println("Preco: " + produto.getValor());
    System.out.println("distribuidor: " + produto.getDistribuidor());

    ProdutoQuantidade produtoQuantidade = new ProdutoQuantidade(produto, 3);
    ProdutoQuantidade produtoQuantidade2 = new ProdutoQuantidade(produto2, 10);

    System.out
        .println("Produto: " + produtoQuantidade.getProduto().getNome() + " x" + produtoQuantidade.getQuantidade());
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
