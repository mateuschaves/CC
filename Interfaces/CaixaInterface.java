public interface CaixaInterface {

    public Caixa RealizarVenda(Caixa caixa);

    public void CancelarVenda(int numero);

    public Caixa AtualizarVenda(int numero, Caixa caixaUpdated);

    public Caixa MostrarVenda(int numero);

    public ArrayList<Caixa> ListarVendas();
    
}
