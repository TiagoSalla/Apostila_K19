public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.cargo = "Diretor";
        f1.salario = 15000.00;

        f2.cargo = "Supervisor";
        f2.salario = 7000.00;

        System.out.println(f1.cargo);
        System.out.printf("R$%.2f", f1.salario);

        System.out.print("\n");

        System.out.println(f2.cargo);
        System.out.printf("R$%.2f", f2.salario);
    }
}
