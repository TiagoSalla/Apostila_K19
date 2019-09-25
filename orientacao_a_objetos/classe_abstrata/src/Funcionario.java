public abstract class Funcionario {
    private String nome;
    private int codigo;
    private double salario;
    private String setor;

    public abstract double calcularBonificacao();

    public Funcionario() {
    }

    public Funcionario(String nome, int codigo, double salario, String setor) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
        this.setor = setor;
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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
