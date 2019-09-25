public class Telefonista extends Funcionario {
    private int ramal;

    public Telefonista() {
    }

    public Telefonista(int ramal) {
        this.ramal = ramal;
    }

    public Telefonista(String nome, int codigo, double salario, double valeRefeicao, int ramal) {
        super(nome, codigo, salario, valeRefeicao);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
