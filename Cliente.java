import java.util.Date;
public class Cliente extends Pessoa{

    private String Email;
    private String Telefone;
    private String Endereco;

    public novoCliente (String nome, String cpf, Date dataCadastro, String Telefone, String Endereco){
        this.setNome(nome);
        this.setCPF(cpf);
        this.setDataCadastro(dataCadastro);
        this.setTelefone(Telefone);
        this.setEndereco(Endereco);
    }
    
    public novoCliente (String nome, String cpf, Date dataCadastro, String Email, String Telefone, String Endereco){
        this.setNome(nome);
        this.setCPF(cpf);
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
}