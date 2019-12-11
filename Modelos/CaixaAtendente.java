package Modelos;

import java.util.Calendar;

public class CaixaAtendente extends Pessoa {
    private Calendar horarioEntrada;
    private Calendar horarioSaida;
    private Caixa caixa;

    public CaixaAtendente(String nome, String cpf, Caixa caixa, Calendar horarioEntrada, Calendar horarioSaida) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setCaixa(caixa);
        this.setHorarioEntrada(horarioEntrada);
        this.setHorarioSaida(horarioSaida);
    }

    public String getHorarioEntrada() {
        return this.horarioEntrada.get(Calendar.HOUR) + ":" + "00";
    }

    public void setHorarioEntrada(Calendar horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public String getHorarioSaida() {
        return this.horarioSaida.get(Calendar.HOUR) + ":" + "00";
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