import java.util.ArrayList;

public class CaixaRepositorio {
    private ArrayList<Caixa> caixas = new ArrayList<Caixa>();

    public Caixa create(Caixa caixa) {
        this.caixas.add(caixa);
        return caixa;
    }

    public void delete(int numero) {
        int count = 0;
        for (Caixa caixa : caixas) {
            if (caixa.getNumero() == numero) {
                caixas.remove(count);
            }
            count = count + 1;
        }

    }

}