package Repositorios;

import java.util.ArrayList;
import Interfaces.ClienteInterface;

public class ClienteRepositorio implements ClienteInterface{
    ArrayList<Cliente> compras = new ArrayList<Cliente>();

    public Cliente FazerCompra(Cliente compra) {
        this.compras.add(compra);
        return compra;
    }
    
    public Cliente RemoverCompra(int cod) {
        int count = 0;
        for (Cliente compra : compras) {
            if (compra.getCod() == cod) {
                compras.remove(count);
            }
            count = count + 1;
        }
        return null;
    }
    
    public Cliente MostrarCompra(int cod) {
        int count = 0;
        for (Cliente compra : compras) {
            if (compra.getCod() == cod) {
                compras.get(count);
                return compras.get(count);
            }
            count = count + 1;
        }
        return null;
    }
    
    public Cliente AtualizarCompra(int cod, Cliente compraAtualizada) {
        int count = 0;
        for (Cliente compra : compras) {
            if (compra.getCod() == cod) {
                compras.set(count, compraAtualizada);
                return compras.get(count);
            }
            count = count + 1;
        }
        return null;
    }
    
    public ArrayList<Cliente> ListarCompras() {
        return this.compras;
    }
}