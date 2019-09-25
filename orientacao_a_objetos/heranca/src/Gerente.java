public class Gerente extends Funcionario{
    private String regiao;
    private String area;

    public void imprimeDados(){
        super.imprimeDados();
        System.out.println(regiao);
        System.out.println(area);
    }

    public Gerente(String regiao, String area) {
        this.regiao = regiao;
        this.area = area;
    }

    public Gerente(String nome, double salario, double bonificacao, String regiao, String area) {
        super(nome, salario, bonificacao);
        this.regiao = regiao;
        this.area = area;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
