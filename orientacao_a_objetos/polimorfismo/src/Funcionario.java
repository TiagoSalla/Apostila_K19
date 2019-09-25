public class Funcionario {
    private String nome;
    private int codigo;
    private double salario;
    private double valeRefeicao;

    public Funcionario() {
    }

    public Funcionario(String nome, int codigo, double salario, double valeRefeicao) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
        this.valeRefeicao = valeRefeicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao(double valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }
}
