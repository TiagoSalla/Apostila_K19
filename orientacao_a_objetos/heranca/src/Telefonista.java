public class Telefonista extends Funcionario {
    private int ramal;

    public void imprimeDados(){
        super.imprimeDados();
        System.out.println(ramal);
    }

    public Telefonista(int ramal) {
        this.ramal = ramal;
    }

    public Telefonista(String nome, double salario, double bonificacao, int ramal) {
        super(nome, salario, bonificacao);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
