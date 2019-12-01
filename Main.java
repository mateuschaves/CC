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
        repo.create(caixa2);

        System.out.println("Nome: " + caixaAtendente.getNome());
        System.out.println("Horario de entrada: " + caixaAtendente.getHorarioEntrada());
        System.out.println("Horario de saida: " + caixaAtendente.getHorarioSaida());

    }

}