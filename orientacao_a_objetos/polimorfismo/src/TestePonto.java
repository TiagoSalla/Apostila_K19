public class TestePonto {
    public static void main(String[] args) {
        ControlePonto ponto = new ControlePonto();

        Gerente gerente = new Gerente("Tiago Salla",1,2500.00,200.00,"Financeiro");
        Telefonista telefonista = new Telefonista("João Victor",2,1800.00,200.00,932);

        ponto.registraEntrada(gerente);
        ponto.registraSaida(gerente);

        ponto.registraEntrada(telefonista);
        ponto.registraSaida(telefonista);
    }
}