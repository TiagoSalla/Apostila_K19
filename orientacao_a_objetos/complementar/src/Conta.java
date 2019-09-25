import javax.swing.*;

public class Conta {
    private int numero;
    private double limite;
    private double saldo;

    public void imprimeExtrato(int mensagemNumero, double mensagemSaldo, double mensagemLimite){
        JOptionPane.showMessageDialog(null,
                "Número da Conta: " + mensagemNumero + "\n" +
                        "Saldo Atual: R$ " + mensagemSaldo + "\n" +
                        "Limite: R$ " + mensagemLimite);
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
