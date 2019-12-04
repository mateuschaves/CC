public class Cliente{
    private String Nome;
    private String CPF;
    private String Email;
    private String Telefone;
    private String Endereco;

    public novoCliente (String Nome, String CPF, String Telefone, String Endereco){
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
    }
    
    public novoCliente (String Nome, String CPF, String Email, String Telefone, String Endereco){
        this.Nome = Nome;
        this.CPF = CPF;
        this.Email = Email;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getTelefone() {
        return this.Telefone;
    }

    public String getEndereco() {
        return this.Endereco;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

}