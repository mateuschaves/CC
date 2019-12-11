package Controladores;

import java.util.ArrayList;
import java.util.Calendar;
import Modelos.*;

public class  CaixaAtendenteValidador {
    private  CaixaAtendente atendente;
    private ArrayList<CaixaAtendente> atendentes;

    public Caixavalidador(CaixaAtendente atendente, ArrayList<CaixaAtendente> atendentes) {
        this.atendente = atendente;
        this.atendentes = atendentes;
    }
    public CaixaAtendente getCaixaatendente() {
        return this.atendentes;
    }

    public void setCaixaatendente(CaixaAtendente atendente) {
        this.atendente = atendente;
    }
    public void validarId() throws Exception {
        for (CaixaAtendente atendente : atendentes) {
            if (this.atendente.getCaixa() != atendente.Caixa())
                throw new Exception("Um atendente só pode estar em um Caixa!");
        }
}
    public void validarHorario() throws Exception{

            if (this.atendente.getHorarioEntrada() < (Calendar.Hour = 6) )
                throw new Exception("O expediente ainda não começou");
  
    }
    public void validarNome() throws Exception {
        if (this.atendente.getNome().length() == 0)
            throw new Exception("Preencha o nome do Caixa!");
    }
}