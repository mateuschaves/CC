package Controladores;

import java.util.ArrayList;
import Modelos.*;

public class ClienteValidador {
    private Cliente cliente;
    private ArrayList<Cliente> clientes;

    public ClienteValidador(Cliente cliente, ArrayList<Cliente> clientes) {
        this.cliente = cliente;
        this.clientes = clientes;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void validarCod() throws Exception {
        for (Cliente cliente : clientes) {
            if (this.cliente.getCod() == cliente.getCod())
                throw new Exception("Cliente já existe!");
        }

    }

    public void validarNome() throws Exception {
        if (this.cliente.getNome().length() == 0)
            throw new Exception("Preencha o nome do cliente!");

    }
    public void validarcpf() throws Exception {
        if (this.cliente.getCpf().length() == 0)
            throw new Exception("Preencha o Cpf!");
    
    }

    public void validarTelefone() throws Exception {
        for (Cliente cliente : clientes) {
            if (this.cliente.getTelefone() == cliente.getTelefone())
                throw new Exception("telefone já existe!");
        }

}

}


