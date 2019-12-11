package Repositorios;

import java.util.ArrayList;
import Modelos.Caixa;

public class CaixaRepositorio {
    private ArrayList<Caixa> caixas = new ArrayList<Caixa>();

    public Caixa RealizarVenda(Caixa caixa) {
        this.caixas.add(caixa);
        return caixa;
    }

    public void CancelarVenda(int numero) {
        int count = 0;
        for (Caixa caixa : caixas) {
            if (caixa.getNumero() == numero) {
                caixas.remove(count);
            }
            count = count + 1;
        }

    }

    public Caixa AtualizarVenda(int numero, Caixa caixaUpdated) {
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

    public Caixa MostrarVenda(int numero) {
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

    public ArrayList<Caixa> ListarVendas() {
        return this.caixas;
    }

}