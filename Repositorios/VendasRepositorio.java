package Repositorios;

import Modelos.*;
import java.util.ArrayList;

public class VendasRepositorio {
    private ArrayList<Venda> vendas = new ArrayList<Venda>();

    public void adicionarVenda(Venda venda) {
        this.vendas.add(venda);
    }

    public void cancelarVenda(int id) {
        for (Venda venda : this.vendas) {
            if (venda.getId() == id) {
                this.vendas.remove(venda);
                break;
            }
        }
    }

    public ArrayList<Venda> listar() {
        return this.vendas;
    }
}