import java.util.ArrayList;

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

}