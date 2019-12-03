import java.util.ArrayList;

public class CaixaRepositorio {
    private ArrayList<Caixa> caixas = new ArrayList<Caixa>();

    public Caixa criar(Caixa caixa) {
        this.caixas.add(caixa);
        return caixa;
    }

    public void remover(int numero) {
        int count = 0;
        for (Caixa caixa : caixas) {
            if (caixa.getNumero() == numero) {
                caixas.remove(count);
            }
            count = count + 1;
        }

    }

    public Caixa atualizar(int numero, Caixa caixaUpdated) {
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

    public Caixa mostrar(int numero) {
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

}