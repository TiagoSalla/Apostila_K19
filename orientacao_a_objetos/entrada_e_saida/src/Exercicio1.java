import java.io.*;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {
        InputStream leitura = new FileInputStream("leitura.txt");
        Scanner scanner = new Scanner(leitura);

        FileOutputStream escrita = new FileOutputStream("escrita.txt");
        PrintStream printStream = new PrintStream(escrita);

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            printStream.println(linha);
        }
    }
}
