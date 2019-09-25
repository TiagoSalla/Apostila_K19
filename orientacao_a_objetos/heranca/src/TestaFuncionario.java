public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Tiago Salla", 2500, 1000, "SP", "Finanças");
        Secretaria secretaria = new Secretaria("Maria Benedita", 1800, 700, "3262-9300");
        Telefonista telefonista = new Telefonista("Santina Hermana", 1400, 400, 932);

        gerente.imprimeDados();
        System.out.println("\n");
        secretaria.imprimeDados();
        System.out.println("\n");
        telefonista.imprimeDados();
    }
}
