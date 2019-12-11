package Repositorios;

import java.util.ArrayList;
import Interfaces.CaixaInterface;
import Modelos.Caixa;

public class CaixaRepositorio implements CaixaInterface {
    private ArrayList<Caixa> caixas = new ArrayList<Caixa>();

    public Caixa CriarCaixa(Caixa caixa) {
        this.caixas.add(caixa);
        return caixa;
    }

    public void FecharCaixa(int numero) {
        int count = 0;
        for (Caixa caixa : caixas) {
            if (caixa.getNumero() == numero) {
                caixas.remove(count);
            }
            count = count + 1;
        }

    }

    public Caixa AtualizarCaixa(int numero, Caixa caixaUpdated) {
        int count = 0;
        for (Caixa caixa : caixas) {
            if (caixa.getNumero() == numero) {
                caixas.set(count, caixaUpdated);
                return caixas.get(count);
            }
            count = count + 1;
        }
        return null;
    }

    public Caixa MostrarCaixa(int numero) {
        int count = 0;
        for (Caixa caixa : caixas) {
            if (caixa.getNumero() == numero) {
                caixas.get(count);
                return caixas.get(count);
            }
            count = count + 1;
        }
        return null;
    }

    public ArrayList<Caixa> ListarCaixas() {
        return this.caixas;
    }

}