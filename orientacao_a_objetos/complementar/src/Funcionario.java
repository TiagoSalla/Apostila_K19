import javax.swing.*;

public class Funcionario {
    private String nome;
    private double salario = 200;

    public void alteraNome(String nome){
        this.nome = nome;
    }

    public void alteraSalario(double salario){
        this.salario = salario;
    }

    public void mostraDadosAtuais(String nome, double salario){
        JOptionPane.showMessageDialog(null,
                "Nome do funcionário: " + nome + "\nSalário: R$ " + salario);
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
}
