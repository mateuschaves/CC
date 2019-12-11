package Controladores;

import java.util.ArrayList;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.And;

import Modelos.*;

public class CaixaValidador {
    private Caixa caixa;
    private ArrayList<Caixa> caixas;

    public CaixaValidador(Caixa caixa, ArrayList<Caixa> caixas) {
        this.caixa = caixa;
        this.caixas = caixas;
    }

    public Caixa getCaixa() {
        return this.caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public void validarnumero(){
        for (Caixa caixa : caixas) {
            if (this.caixa.getNumero() == caixa.getNumero())
                throw new Exception("Só existe um caixa com esse número!");
        }
    }
    public void validartipo(){
        if(this.caixa.getPreferencia() == true  &&  this.caixa.getPequenasCompras() == true ){
            throw new Exception("O caixa só pode ser de um tipo!");
        }

    }
}
