public class Produto {
    private String nome;
    private String marca;
    private double valor;
    private String distribuidor;
    private Integer quantidadeEstoque;
    private Integer quantidadeCompra;

    public Produto(String nome, String marca, double valor, String distribuidor, Integer estoque, Integer compra) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.distribuidor = distribuidor;
        this.quantidadeEstoque = estoque;
        this.quantidadeCompra = compra;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDistribuidor() {
        return this.distribuidor;
    }

    public void setDistribuidor() {
        this.distribuidor = distribuidor;
    }
    
    public Integer getEstoque() {
        return this.quantidadeEstoque;
    }
    public void setEstoque(Integer estoque) {
        this.quantidadeEstoque = estoque;
    }
    public Integer getCompra() {
        return this.quantidadeCompra;
    }
    public void setCompra(Integer compra) {
        this.quantidadeCompra = compra;
    }
}
