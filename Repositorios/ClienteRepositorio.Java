package Repositorios;

import java.util.ArrayList;
import Interfaces.ClienteInterface;

public class ClienteRepositorio implements ClienteInterface{
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente CadastrarCliente(Cliente cliente) {
        this.clientes.add(clientes);
        return clientes;
    }
    
    public Cliente RemoverCliente(int cod) {
        int count = 0;
        for (Cliente clientes : clientes) {
            if (clientes.getCod() == cod) {
                clientess.remove(count);
            }
            count = count + 1;
        }
        return null;
    }
    
    public Cliente MostrarCliente(int cod) {
        int count = 0;
        for (Cliente clientes : clientes) {
            if (clientes.getCod() == cod) {
                clientes.get(count);
                return clientes.get(count);
            }
            count = count + 1;
        }
        return null;
    }
    
    public Cliente AtualizarCliente(int cod, Cliente clienteAtualizado) {
        int count = 0;
        for (Cliente clientes : clientes) {
            if (clientes.getCod() == cod) {
                clientes.set(count, clienteAtualizado);
                return clientes.get(count);
            }
            count = count + 1;
        }
        return null;
    }
    
    public ArrayList<Cliente> ListarClientes() {
        return this.clientes;
    }
}