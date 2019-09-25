import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlePonto {
    public void registraEntrada(Funcionario funcionario){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("Entrada: " + funcionario.getCodigo());
        System.out.println("Data: " + sdf.format(agora));
    }

    public void registraSaida(Funcionario funcionario){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("Saída: " + funcionario.getCodigo());
        System.out.println("Data: " + sdf.format(agora));
    }
}
