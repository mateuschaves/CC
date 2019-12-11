package Interfaces;

import java.util.ArrayList;

import Modelos.*;

public interface CaixaInterface {

    public Caixa CriarCaixa(Caixa caixa);

    public void FecharCaixa(int numero);

    public Caixa AtualizarCaixa(int numero, Caixa caixaUpdated);

    public Caixa MostrarCaixa(int numero);

    public ArrayList<Caixa> ListarCaixas();

}
