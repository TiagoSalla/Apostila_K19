import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        InputStream teclado = System.in;
        Scanner scanner = new Scanner(teclado);
        System.out.println("Digite o que deseja inserir no arquivo ou tecle ENTER duas vezes para sair:");
        write("leitura.txt", scanner);

        InputStream leitura = new FileInputStream("leitura.txt");
        scanner = new Scanner(leitura);
        write("escrita.txt", scanner);
    }

    private static void write(String archiveName, Scanner scanner) throws IOException, InterruptedException {
        FileOutputStream write = new FileOutputStream(archiveName);
        PrintStream printStream = new PrintStream(write);
        String line = "";

        do{
            line = scanner.nextLine();
            printStream.println(line);
        }while(!line.equals(""));
    }
}
