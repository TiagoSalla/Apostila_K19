public class TesteFuncionario {
    public static void main(String[] args) {
        System.out.println("Valor do vale refeição: R$ " + Funcionario.valeRefeicaoDiario);

        Funcionario.reajustaValeRefeicao(2.5);

        System.out.println("Valor do vale refeição reajustado: R$ " + Funcionario.valeRefeicaoDiario);
    }

}
