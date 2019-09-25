public class Funcionario {
    private String nome;
    private double salario;
    private double bonificacao;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.salario);
        System.out.println(this.bonificacao);
    }

    public Funcionario() {}

    public Funcionario(String nome, double salario, double bonificacao) {
        this.nome = nome;
        this.salario = salario;
        this.bonificacao = bonificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
