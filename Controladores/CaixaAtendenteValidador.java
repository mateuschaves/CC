package Controladores;

import java.util.ArrayList;
import Modelos.*;

public class CaixaAtendenteValidador {
    private CaixaAtendente atendente;
    private ArrayList<CaixaAtendente> atendentes;

    public void Caixavalidador(CaixaAtendente atendente, ArrayList<CaixaAtendente> atendentes) {
        this.atendente = atendente;
        this.atendentes = atendentes;
    }

    public void validarId() throws Exception {
        for (CaixaAtendente atendente : atendentes) {
            if (this.atendente.getCaixa().getNumero() != atendente.getCaixa().getNumero())
                throw new Exception("Um atendente só pode estar em um Caixa!");
        }
    }

    public void validarNome() throws Exception {
        if (this.atendente.getNome().length() == 0)
            throw new Exception("Preencha o nome do Caixa!");
    }
}