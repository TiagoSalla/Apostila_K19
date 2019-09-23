public class TestaTurma {
    public static void main(String[] args) {
        Turma t1 = new Turma();
        Turma t2 = new Turma();

        t1.periodo = "Noturno";
        t1.serie = 2;
        t1.sigla = "ADS";
        t1.tipoEnsino = "Presencial";

        t2.periodo = "Integral";
        t2.serie = 1;
        t2.sigla = "ENG";
        t2.tipoEnsino = "Presencial";

        System.out.println(t1.periodo);
        System.out.println(t1.serie);
        System.out.println(t1.sigla);
        System.out.println(t1.tipoEnsino);

        System.out.print("\n");

        System.out.println(t2.periodo);
        System.out.println(t2.serie);
        System.out.println(t2.sigla);
        System.out.println(t2.tipoEnsino);
    }
}
