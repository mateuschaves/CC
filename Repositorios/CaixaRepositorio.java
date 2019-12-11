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
        for (Caixa caixa : this.caixas) {
            if (caixa.getNumero() == numero) {
                this.caixas.remove(caixa);
            }
        }

    }

    public Caixa AtualizarCaixa(int numero, Caixa caixaUpdated) {
        for (Caixa caixa : this.caixas) {
            if (caixa.getNumero() == numero) {
                this.caixas.set(this.caixas.indexOf(caixa), caixaUpdated);
                return this.caixas.get(this.caixas.indexOf(caixa));
            }
        }
        return null;
    }

    public Caixa MostrarCaixa(int numero) {
        for (Caixa caixa : this.caixas) {
            if (caixa.getNumero() == numero) {
                this.caixas.get(this.caixas.indexOf(caixa));
                return this.caixas.get(this.caixas.indexOf(caixa));
            }
        }
        return null;
    }

    public ArrayList<Caixa> ListarCaixas() {
        return this.caixas;
    }

}