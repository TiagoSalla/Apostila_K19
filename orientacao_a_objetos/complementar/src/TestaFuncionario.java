import javax.swing.*;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        int opcao;

        funcionario.setNome(Metodos.entradaComRetornoString("Insira o nome do funcionário:"));

        do{
            opcao = Metodos.entradaComRetornoInt(
                    "Insira a opção desejada:\n1 - Alterar o nome\n2 - Alterar o salário\n" +
                            "3 - Mostrar os dados atuais\n4 - Sair");
            switch (opcao){
                case 1: //Alterar nome
                    funcionario.alteraNome(Metodos.entradaComRetornoString(
                            "Insira o novo nome: "));
                    mostraMensagem("Nome alterado com sucesso!");
                    break;
                case 2: //Alterar salário
                    funcionario.alteraSalario(Metodos.entradaComRetornoDouble(
                            "Insira o novo salário: "));
                    mostraMensagem("Salário alterado com sucesso!");
                    break;
                case 3: //Mostrar dados atuais
                    funcionario.mostraDadosAtuais(funcionario.getNome(), funcionario.getSalario());
                    break;
                case 4: //Opção de sair
                    System.exit(0);
                default:
                    mostraMensagem("Opção Inválida! Tente novamente.");
                    break;
            }
        }while (opcao != 4);
    }

    private static void mostraMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
