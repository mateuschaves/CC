import java.util.ArrayList;

public class ClienteRepositorio {
    ArrayList<Cliente> compras = new ArrayList<Cliente>();

    public Cliente criar(Cliente compra) {
        this.compras.add(compra);
        return compra;
    }
    
    public Cliente remover(int cod) {
        int count = 0;
        for (Cliente compra : compras) {
            if (compra.getCod() == cod) {
                compras.remove(count);
            }
            count = count + 1;
        }
        return null;
    }
    
    public Cliente mostrar(int cod) {
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
    
    public Cliente atualizar(int cod, Cliente compraAtualizada) {
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
    
    public ArrayList<Cliente> listar() {
        return this.compras;
    }
}