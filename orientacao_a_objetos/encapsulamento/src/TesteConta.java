public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNome("Tiago Salla");
        conta.setNumero(1);
        conta.setSalario(2500.00);
        conta.setLimite(1000.00);

        System.out.println(conta.getNome());
        System.out.println(conta.getNumero());
        System.out.println(conta.getSalario());
        System.out.println(conta.getLimite());
    }
}
