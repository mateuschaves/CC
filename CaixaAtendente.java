import java.util.Date;

public class CaixaAtendente extends Pessoa {
    private Date horarioEntrada;
    private Date horarioSaida;
    private Caixa caixa;

    public CaixaAtendente() {
    }

    public CaixaAtendente(Date horarioEntrada, Date horarioSaida, Caixa caixa) {
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
        this.caixa = caixa;
    }

    public Date getHorarioEntrada() {
        return this.horarioEntrada;
    }

    public void setHorarioEntrada(Date horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public Date getHorarioSaida() {
        return this.horarioSaida;
    }

    public void setHorarioSaida(Date horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public Caixa getCaixa() {
        return this.caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
}