public class Gerente extends Funcionario {
    private String area;

    public Gerente() {
    }

    public Gerente(String area) {
        this.area = area;
    }

    public Gerente(String nome, int codigo, double salario, double valeRefeicao, String area) {
        super(nome, codigo, salario, valeRefeicao);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
