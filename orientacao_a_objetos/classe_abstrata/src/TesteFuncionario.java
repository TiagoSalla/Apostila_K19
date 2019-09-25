public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Tiago Salla");
        funcionario.setSalario(2500.00);
        funcionario.setCodigo(1);
        funcionario.setSetor("Front-end");

        System.out.println(funcionario.getCodigo());
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSetor());
        System.out.println(funcionario.getSalario());
        System.out.println(funcionario.calcularBonificacao());
    }
}
