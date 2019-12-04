import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Calendar horaEntrada = Calendar.getInstance();
        horaEntrada.set(Calendar.HOUR, 8);

        Calendar horaSaida = Calendar.getInstance();
        horaSaida.set(Calendar.HOUR, 10);

        Caixa caixa = new Caixa(1, false, false);
        CaixaAtendente caixaAtendente = new CaixaAtendente("Mateus Henrique", "115.058.024-07", caixa, horaEntrada,
                horaSaida);

        CaixaRepositorio repo = new CaixaRepositorio();
        repo.criar(caixa);

        System.out.println("Nome: " + caixaAtendente.getNome());
        System.out.println("Horario de entrada: " + caixaAtendente.getHorarioEntrada());
        System.out.println("Horario de saida: " + caixaAtendente.getHorarioSaida());

        Produto produto = new Produto("ninho","nestle",48, "vale", 15,7);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Marca: " + produto.getMarca());
        System.out.println("Preco: " + produto.getValor());
        System.out.println("distribuidor: " + produto.getDistribuidor());
        System.out.println("Estoque: " + produto.getEstoque());
        System.out.println("vendidos: " + produto.getCompra());
        
        
        
        

    }

}
