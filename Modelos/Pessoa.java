package Modelos;

import java.util.Date;

public abstract class Pessoa {

  private String nome;
  private String cpf;
  private Date dataCadastro;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Date getDataCadastro() {
    return this.dataCadastro;
  }

  public void setDataCadastro(Date dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

}