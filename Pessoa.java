import java.util.Date;

public abstract class Pessoa {

  protected String nome;
  protected String cpf;
  protected Date dataCadastro;

  public abstract String getNome();

  public abstract void setNome(String nome);

  public abstract String getCpf();

  public abstract void setCpf(String cpf);

  public abstract Date getDataCadastro();

  public abstract void setDataCadastro(Date dataCadastro);

}