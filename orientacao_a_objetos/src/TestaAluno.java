public class TestaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.nome = "Tiago Salla";
        a1.rg = "57.913.698-X";
        a1.dataNascimento = "22/06/1999";

        a2.nome = "Junior Malaquias";
        a2.rg = "12.345.678-9";
        a2.dataNascimento = "12/01/1980";

        System.out.println(a1.nome);
        System.out.println(a1.rg);
        System.out.println(a1.dataNascimento);

        System.out.print("\n");

        System.out.println(a2.nome);
        System.out.println(a2.rg);
        System.out.println(a2.dataNascimento);
    }
}
