package Modelos;

import java.util.Date;

public class Cliente extends Pessoa {

    private Integer cod;
    private String Email;
    private String Telefone;
    private String Endereco;
    

    public Cliente(int cod, String nome, Date dataCadastro, String telefone, String endereco, String cpf) {
        this.setCod(cod);
        this.setNome(nome);
        this.setDataCadastro(dataCadastro);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.setCpf(cpf);
    }

    public Cliente(int cod, String nome, String cpf, Date dataCadastro, String email, String telefone,
            String endereco) {
        this.setCod(cod);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataCadastro(dataCadastro);
        this.setEmail(Email);
        this.setTelefone(Telefone);
        this.setEndereco(Endereco);
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return this.Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return this.Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public Integer getCod() {
        return this.cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
}