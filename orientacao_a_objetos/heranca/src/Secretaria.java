public class Secretaria extends Funcionario {
    private String telefone;

    public void imprimeDados(){
        super.imprimeDados();
        System.out.println(telefone);
    }

    public Secretaria(String telefone) {
        this.telefone = telefone;
    }

    public Secretaria(String nome, double salario, double bonificacao, String telefone) {
        super(nome, salario, bonificacao);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
