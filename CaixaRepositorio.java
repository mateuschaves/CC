import java.util.ArrayList;

public class CaixaRepositorio {
    private ArrayList<Caixa> caixas = new ArrayList<Caixa>();

    public Caixa create(Caixa caixa) {
        this.caixas.add(caixa);
        return caixa;
    }
}