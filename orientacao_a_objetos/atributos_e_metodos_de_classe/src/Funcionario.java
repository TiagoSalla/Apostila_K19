public class Funcionario {
    public static double valeRefeicaoDiario = 20.00;
    private String nome;

    public static void reajustaValeRefeicao(double taxa){
        Funcionario.valeRefeicaoDiario += (Funcionario.valeRefeicaoDiario * taxa)/100;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
