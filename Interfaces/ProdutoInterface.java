public interface ProdutoInterface {

    public Estoque getEstoque();

    public Produto adicionarProdutoEstoque(Produto produto, int quantidade);

    public void removerProdutoEstoque(int id);

    public Produto atualizarProdutoEstoque(int id, Produto produtoUpdate);

    public Produto mostrarProdutoEstoque(int id);

    public ArrayList<Produto> listarProdutoEstoque();

}