import java.util.Date;

public abstract class Pessoa {

  private String nome;
  private String cpf;
  private Date dataCadastro;

  public abstract String getNome();

  public abstract void setNome(String nome);

  public abstract String getCpf();

  public abstract void setCpf(String cpf);

  public abstract Date getDataCadastro();

  public abstract void setDataCadastro(Date dataCadastro);

}