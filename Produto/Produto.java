package Produto;

public class Produto {
    private Integer id;
    private String nome;
    private String marca;
    private double valor;
    private String distribuidor;

    public Produto(Integer id, String nome, String marca, double valor, String distribuidor) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.distribuidor = distribuidor;
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

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
