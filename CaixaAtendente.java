import java.util.Calendar;

public class CaixaAtendente extends Pessoa {
    private Calendar horarioEntrada;
    private Calendar horarioSaida;
    private Caixa caixa;

    public CaixaAtendente(Calendar horarioEntrada, Calendar horarioSaida, Caixa caixa) {
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
        this.caixa = caixa;
    }

    public Calendar getHorarioEntrada() {
        return this.horarioEntrada;
    }

    public void setHorarioEntrada(Calendar horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public Calendar getHorarioSaida() {
        return this.horarioSaida;
    }

    public void setHorarioSaida(Calendar horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public Caixa getCaixa() {
        return this.caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
}