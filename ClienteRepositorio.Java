import java.util.ArrayList;

public class ClienteRepositorio {
    ArrayList<Cliente> compras = new ArrayList<Cliente>();

    public Cliente criar(Cliente compras) {
        this.compras.add(compras);
        return compras;
    }
    
    public Cliente remover(int numero) {
        int count = 0;
        for (Cliente compras : compras) {
            if (compras.getNumero() == numero) {
                compras.remove(count);
            }
            count = count + 1;
        }
    }
    
    public Cliente mostrar(int numero) {
        int count = 0;
        for (Cliente compras : compras) {
            if (compras.getNumero() == numero) {
                compras.get(count);
                return compras.get(count);
            }
            count = count + 1;
        }
        return null;
    }
    
    public Cliente atualizar(int numero, Cliente compraAtualizada) {
        int count = 0;
        for (Cliente compras : compras) {
            if (compras.getNumero() == numero) {
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