import javax.swing.*;

import static java.lang.Integer.parseInt;

public class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        int opcao;

        conta.setNumero(Metodos.entradaComRetornoInt("Insira o número da conta:"));
        conta.setSaldo(Metodos.entradaComRetornoDouble("Insira o saldo da conta:"));
        conta.setLimite(Metodos.entradaComRetornoDouble("Insira o limite da conta:"));

        do{
            opcao = Metodos.entradaComRetornoInt(
                    "Insira a opção desejada:\n1 - Depositar\n2 - Sacar\n3 - Imprimir Extrato\n4 - Sair");
            switch (opcao){
               case 1: //Opção de depósito
                   conta.deposita(Metodos.entradaComRetornoDouble("Insira o valor a ser depositado: "));
                   Metodos.mostraMensagem("Depósito efetuado com sucesso!");
                   break;
               case 2: //Opção de saque
                   conta.saca(Metodos.entradaComRetornoDouble("Insira o valor a ser sacado: "));
                   Metodos.mostraMensagem("Saque efetuado com sucesso!");
                   break;
               case 3: //Opção de imprimir extrato
                   conta.imprimeExtrato(conta.getNumero(), conta.getSaldo(), conta.getLimite());
                   break;
               case 4: //Opção de sair
                   System.exit(0);
               default:
                   Metodos.mostraMensagem("Opção Inválida! Tente novamente.");
                   break;
           }
        }while (opcao != 4);
    }
}

