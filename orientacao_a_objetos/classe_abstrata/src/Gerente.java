public class Gerente extends Funcionario {
    private String usuario;
    private String senha;

    public double calcularBonificacao(){
        return this.getSalario() * 0.2 + 300;
    }

    public Gerente() {
    }

    public Gerente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Gerente(String nome, int codigo, double salario, String setor, String usuario, String senha) {
        super(nome, codigo, salario, setor);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
