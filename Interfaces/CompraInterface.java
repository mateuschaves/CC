package Interfaces;

import java.util.ArrayList;

import Modelos.*;

public interface ClienteInterface {

    public Cliente FazerCompra(Cliente compra);

    public Cliente RemoverCompra(int cod);

    public Cliente MostrarCompra(int cod);

    public Cliente AtualizarCompra(int cod, Cliente compraAtualizada);

    public ArrayList<Cliente> ListarCompras();
}