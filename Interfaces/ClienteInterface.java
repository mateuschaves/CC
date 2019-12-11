package Interfaces;

import java.util.ArrayList;

import Modelos.*;

public interface ClienteInterface {

    public Cliente CadastrarCliente(Cliente cliente);

    public Cliente RemoverCliente(int cod);

    public Cliente MostrarCliente(int cod);

    public Cliente AtualizarCliente(int cod, Cliente clienteAtualizado);

    public ArrayList<Cliente> ListarClientes();
}