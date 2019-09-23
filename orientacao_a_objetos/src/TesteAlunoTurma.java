public class TesteAlunoTurma {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Turma t1 = new Turma();

        t1.periodo = "Noturno";
        t1.serie = 2;
        t1.sigla = "ADS";
        t1.tipoEnsino = "Presencial";

        a1.nome = "Tiago Salla";
        a1.rg = "57.913.698-X";
        a1.dataNascimento = "22/06/1999";
        a1.turma = t1;

        System.out.println(a1.nome);
        System.out.println(a1.rg);
        System.out.println(a1.dataNascimento);
        System.out.println(a1.turma.periodo);
        System.out.println(a1.turma.serie);
        System.out.println(a1.turma.sigla);
        System.out.println(a1.turma.tipoEnsino);
    }
}
