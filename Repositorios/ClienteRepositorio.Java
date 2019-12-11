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
        for (Cliente cliente : this.clientes) {
            if (cliente.getCod() == cod) {
                this.clientes.remove(this.clientes.indexOf(cliente));
            }
        }
        return null;
    }
    
    public Cliente MostrarCliente(int cod) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCod() == cod) {
                this.clientes.get(this.clientes.indexOf(cliente));
                return this.clientes.get(this.clientes.indexOf(cliente));
            }
        }
        return null;
    }
    
    public Cliente AtualizarCliente(int cod, Cliente clienteAtualizado) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCod() == cod) {
                this.clientes.set(this.clientes.indexOf(cliente), clienteAtualizado);
                return this.clientes.get(this.clientes.index(cliente));
            }
        }
        return null;
    }
    
    public ArrayList<Cliente> ListarClientes() {
        return this.clientes;
    }
}