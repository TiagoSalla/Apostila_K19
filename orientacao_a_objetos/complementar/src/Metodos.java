import javax.swing.*;

public class Metodos {
    public static int entradaComRetornoInt(String mensagem){
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
    }

    public static double entradaComRetornoDouble(String mensagem){
        return Double.parseDouble(JOptionPane.showInputDialog(null, mensagem));
    }

    public static String entradaComRetornoString(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }

    public static void mostraMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
