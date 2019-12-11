package Repositorios;

import Modelos.*;
import java.util.ArrayList;

public class VendasRepositorio {
    private ArrayList<Venda> vendas = new ArrayList<Venda>();

    public void adicionarVenda(Venda venda) {
        this.vendas.add(venda);
    }

    public void cancelarVenda(int id) {
        int count = 0;
        for (Venda venda : this.vendas) {
            if (venda.getId() == id) {
                vendas.remove(count);
            }
            count = count + 1;
        }
    }

    public ArrayList<Venda> listar() {
        return this.vendas;
    }
}